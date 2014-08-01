import java.io.*;     //libreria para la lectura de archivos
import java.util.ArrayList;
public class texto {
private int dato1,dato2;
private String operacion;
private char[] cadena_caracteres;

private Stack<Integer>datos;
private ArrayList<Integer>resultados;

public texto()
{
	cadena_caracteres= new char[100];
	
	datos = new StackVector<Integer>();
	resultados = new ArrayList<Integer>();
	
	}
public void leer(String nombreArchivo) {
	try{
		FileReader nombre= new FileReader(nombreArchivo);		//indicamos que archivo debe leer
		BufferedReader espacio= new BufferedReader(nombre);		//creamos un espacio para memoria para guardar informacion
		operacion= espacio.readLine();							//lee la linea

		cadena_caracteres = operacion.toCharArray();			//los convierte array
		System.out.println("Documento leido: "+operacion);		
		
		for (int i=0; i<cadena_caracteres.length;i++)
		{
			if(cadena_caracteres[i]==' ')
			{
				i=i++;
			}
			else{
			if(cadena_caracteres[i]=='*' || cadena_caracteres[i]=='+' || cadena_caracteres[i]=='-' || cadena_caracteres[i]=='/')
			{
				dato1=datos.pop();
				dato2=datos.pop();
				datos.push(Operacion(dato1,dato2,cadena_caracteres[i]));
			}
			else
			{
				int datoAscii=(int)cadena_caracteres[i];
                int data =Character.getNumericValue(datoAscii);
				datos.push(data);
			} 
			}
			
		}
		resultados.add(datos.pop());
		int cadena1=resultados.get(0);
		System.out.println("El resutlado final es: "+cadena1);
		
	}catch(Exception e)
	{
		System.out.println("Su resultado es: "+e.getMessage());        //se atrapa la excepcion en caso no exista un .txt 
	}
	
}
public static int Operacion(int dato1,int dato2, char op)
{
	int resultado=0;
	if(op=='+')
	{
		resultado=dato1+dato2;
	}
	if(op=='*')
	{
		resultado=dato1*dato2;
	}
	if(op=='-')
	{
		resultado=dato1-dato2;
	}
	if(op=='/')
	{
		resultado=dato1/dato2;
	}
	return resultado;
}

}
