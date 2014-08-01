/**
 * 
 * @author Pablo Argueta Carné: 13028
 * @author Kuk Chung     Carné: 13
 * @author Aarón Girón   Carné: 13
 * Sección: 30
 * Fecha: 5/7/14
 * Nombre de Archivo: GUI.java
 * Breve Descripción: Es la interfaz gráfica, que muestra todas las funciones del sistema hidráulico.
 * 
 */

/**
 * Importando la libreria necesaria para la interfaz grafica
 */
import java.awt.Color;

@SuppressWarnings("unchecked")
/**
 * clase de interfaz grafica que extiende a configuraciones predeterminados
 * de java para la interfaz grafica
 */
public class GUI extends javax.swing.JFrame {
private boolean a=false;
private InterfazRadio radio= new Radio();
    /**
     * Configuracion predeterminado del radio de la frecuencia
     */
    public GUI() {
        initComponents();
        bloq();                        
        if(radio.getFrecuencia()){
            fm.setSelected(true);
        }
        else{
            am.setSelected(true);
    }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        am = new javax.swing.JRadioButton();
        fm = new javax.swing.JRadioButton();
        lblFrecuencia = new javax.swing.JLabel();
        lblTituloEstacion = new javax.swing.JLabel();
        lblEstacion = new javax.swing.JLabel();
        bMenos = new javax.swing.JButton();
        lblCambiar = new javax.swing.JLabel();
        lblFav = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bOnOff = new javax.swing.JToggleButton();
        bMas = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        fijarFav = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(am);
        am.setText("AM");
        am.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amActionPerformed(evt);
            }
        });

        buttonGroup1.add(fm);
        fm.setText("FM");
        fm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmActionPerformed(evt);
            }
        });

        lblFrecuencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFrecuencia.setText("Frecuencia");

        lblTituloEstacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloEstacion.setText("Estacion");

        lblEstacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        bMenos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMenos.setText("-");
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });

        lblCambiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCambiar.setText("Cambiar");

        lblFav.setFont(new java.awt.Font("Script MT Bold", 2, 24)); // NOI18N
        lblFav.setText("Favoritos");

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b10.setText("10");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        b11.setText("11");
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setText("12");
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bOnOff.setText("ON/OFF");
        bOnOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOnOffActionPerformed(evt);
            }
        });

        bMas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMas.setText("+");
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Kunstler Script", 2, 48)); // NOI18N
        lblTitulo.setText("Ferrari 458 Italia");

        fijarFav.setText("Fijar Favorito");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(b9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(b10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(b5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(b6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                        .add(b1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(b2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(b3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(b11, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .add(b7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(b4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(b8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(b12)))
                            .add(layout.createSequentialGroup()
                                .add(lblFav, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(fijarFav)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 55, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(bSalir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(bOnOff, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(33, 33, 33))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(37, 37, 37)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(am)
                                    .add(fm)))
                            .add(lblFrecuencia))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(120, 120, 120)
                                .add(lblTituloEstacion)
                                .add(18, 18, 18)
                                .add(lblEstacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(167, 167, 167)
                                .add(lblCambiar))
                            .add(layout.createSequentialGroup()
                                .add(140, 140, 140)
                                .add(bMas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(bMenos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))))
            .add(layout.createSequentialGroup()
                .add(68, 68, 68)
                .add(lblTitulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 252, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTitulo)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(lblFrecuencia)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(am)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fm))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblTituloEstacion)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblEstacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lblCambiar)
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(bMas)
                            .add(bMenos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblFav)
                            .add(fijarFav))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(b1)
                            .add(b2)
                            .add(b3)
                            .add(b4)))
                    .add(layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(bOnOff, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(b5)
                            .add(b6)
                            .add(b8)
                            .add(b7))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(b9)
                            .add(b10)
                            .add(b11)
                            .add(b12))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(bSalir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /** 
     * seleccion de la frecuencia del radio
     */ 
    private void seleccionarFrecuencia(){        
        if(radio.getFrecuencia()){
            am.setSelected(true);
        }
        else{
            fm.setSelected(true);
        }
    }
    /**
     * habilitador sobre la interaccion con el programa en estado bloqueado
     */
    private void bloq() {        
        lblFav.setEnabled(false);
        lblFrecuencia.setEnabled(false);
        lblTituloEstacion.setEnabled(false);
        lblEstacion.setEnabled(false);
        lblCambiar.setEnabled(false);
        fijarFav.setEnabled(false);
        am.setEnabled(false);
        fm.setEnabled(false);    
        bMas.setEnabled(false);
        bMenos.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        bOnOff.setBackground(Color.red);
    }
    /** 
     * habilitador sobre la interaccion con el programa en transicion de habililtar la interaccion entre el usuario
     */
    private void desbloq() {        
        lblFav.setEnabled(true);
        lblFrecuencia.setEnabled(true);
        lblTituloEstacion.setEnabled(true);
        lblEstacion.setEnabled(true);
        lblCambiar.setEnabled(true);
        am.setEnabled(true);
        fm.setEnabled(true);
        bMas.setEnabled(true);
        bMenos.setEnabled(true);
        fijarFav.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        bOnOff.setBackground(Color.green);
    }
    /**
     * Reaccion ejecutada por el usuario sobre el estado de radio general
     * de ver si esta encendido o apagado llamando a una configuracion predeterminada
     * para la interaccion entre el usuario
     */
    private void bOnOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOnOffActionPerformed
        if(!radio.getEncendido()){
            desbloq();
            radio.encender();
        }
        else{
            bloq();
            radio.apagar();
        }
    }//GEN-LAST:event_bOnOffActionPerformed

    /**
     * Reaccion ejecutada por el usuario para salir del programa
     */ 
    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed
    /**
     * Accion utilizada para mostrar los valores de presente estacion
     */ 
    private void amActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amActionPerformed
        lblEstacion.setText(""+radio.getEstacionAM());  
        radio.cambiarFrecuencia(false);
    }//GEN-LAST:event_amActionPerformed
    /** 
     * Accion utilizada para mostrar los valores de presente estacion
     */ 
    private void fmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmActionPerformed
        lblEstacion.setText(""+radio.getEstacionFM());
        radio.cambiarFrecuencia(true);
    }//GEN-LAST:event_fmActionPerformed
    /**
     * Accion utilizada para cambiar(subir) la estacion presente del radio
     */ 
    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        radio.subirEstacion();
        if(radio.getFrecuencia()){
           lblEstacion.setText(""+radio.getEstacionFM()); 
        }
        else{
            lblEstacion.setText(""+radio.getEstacionAM());
        }        
    }//GEN-LAST:event_bMasActionPerformed
    /**
     * Accion utilizada para cambiar(bajar) la estacion presente del radio
     */ 
    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        radio.bajarEstacion();
        if(radio.getFrecuencia()){
           lblEstacion.setText(""+radio.getEstacionFM()); 
        }
        else{
            lblEstacion.setText(""+radio.getEstacionAM());
        }        
    }//GEN-LAST:event_bMenosActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(1,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(1,radio.getEstacionAM());
            }        
        }
        else{
            lblEstacion.setText(""+radio.sacar(1));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b1ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(2,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(2,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(2));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b2ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(3,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(3,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(3));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b3ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */
    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(4,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(4,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(4));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b4ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(5,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(5,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(5));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b5ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(6,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(6,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(6));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b6ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(7,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(7,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(7));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b7ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(8,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(8,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(8));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b8ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(9,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(9,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(9));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b9ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(10,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(10,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(10));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b10ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */
    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(11,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(11,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(11));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b11ActionPerformed
    /**
     * Accion utilizada para guardar la estacion con la frecuencia seleccionado
     * con la funcion de cargar inmediatamente la estacion favorita
     */ 
    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        if(fijarFav.isSelected()){            
            if(radio.getFrecuencia()){
               radio.guardar(12,radio.getEstacionFM()); 
            }
            else{
                radio.guardar(12,radio.getEstacionAM());
            }
        }
        else{
            lblEstacion.setText(""+radio.sacar(12));
            seleccionarFrecuencia();
        }
    }//GEN-LAST:event_b12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    } 
    /**
     * declaracion de los variables que conforma al interfaz grafica
     */ 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton am;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JToggleButton bOnOff;
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fijarFav;
    private javax.swing.JRadioButton fm;
    private javax.swing.JLabel lblCambiar;
    private javax.swing.JLabel lblEstacion;
    private javax.swing.JLabel lblFav;
    private javax.swing.JLabel lblFrecuencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloEstacion;
    // End of variables declaration//GEN-END:variables
}
