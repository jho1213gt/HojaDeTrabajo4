//*******************************************************************************************************
// Autor: Pablo Argueta Carné: 13028
//        Kuk Chung     Carné: 13
//        Aarón Girón   Carné: 13
// Sección: 30
// Fecha: 5/7/14
// Nombre de Archivo: InterfazRadio.java
// Breve Descripción: Es la interfaz para asegurar el contrato de los métodos que debe implementer Radio.
//********************************************************************************************************

/**
 * clase interfaz para el radio con
 * declaraciones de las variables definidas
 * @return
 */

public interface InterfazRadio {
    public void cambiarFrecuencia(boolean frecuencia);
    public double sacar(int boton);
    public void apagar();
    public void encender();
    public void guardar(int boton, double estacion);
    public double subirEstacion();
    public double bajarEstacion();
    public boolean getFrecuencia();
    public boolean getEncendido();
    public double getEstacionAM();
    public double getEstacionFM();         
}
