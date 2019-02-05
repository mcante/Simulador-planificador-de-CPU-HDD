
package planificador_v1;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PrioridadApropiativo extends javax.swing.JFrame {

    public int contador; //Contador para llevar el control de los registros ingresados...
    public float promedio;
    public String encadenamiento="";
    public String cadenaLista="";
    
    
    public int[][] data = new int[50][5]; // proceso, rafaga, llegada, estado
    public int[][] copia = new int[50][5]; // proceso, rafaga, llegada, estado
    public int[][] resumen = new int[50][5]; // proceso, inicio, finalizado, rafagas
    public int[][] resumenTabla = new int[50][5]; // proceso, T_entrega, T_respuesta, T_espera
    LinkedList<String> Lista = new LinkedList<String>();
               
    public PrioridadApropiativo() {
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtTiempoRafaga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTiempoLlegada = new javax.swing.JTextField();
        Btn_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_TablaInicial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtResultado = new javax.swing.JTextArea();
        BtnResolver = new javax.swing.JButton();
        LblProceso = new javax.swing.JLabel();
        BtnEjemplo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        BtnResumen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxtPrioridad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtPane = new javax.swing.JTextPane();
        BtnVerGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Prioridad Apropiativo");

        jLabel3.setText("Tiempo Ráfaga");

        TxtTiempoRafaga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTiempoRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTiempoRafagaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tiempo Llegada");

        TxtTiempoLlegada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTiempoLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTiempoLlegadaActionPerformed(evt);
            }
        });

        Btn_Agregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Btn_Agregar.setText("Agregar");
        Btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AgregarActionPerformed(evt);
            }
        });

        Tbl_TablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Rafaga", "Prioridad", "Llegada"
            }
        ));
        jScrollPane1.setViewportView(Tbl_TablaInicial);

        TxtResultado.setColumns(20);
        TxtResultado.setLineWrap(true);
        TxtResultado.setRows(5);
        jScrollPane2.setViewportView(TxtResultado);

        BtnResolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnResolver.setText("Resolver");
        BtnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResolverActionPerformed(evt);
            }
        });

        LblProceso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LblProceso.setText("Proceso 1");

        BtnEjemplo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnEjemplo.setText("Cargar Ejemplo");
        BtnEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjemploActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Diagrama de Gantt");

        BtnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnResumen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnResumen.setText("Tabla de Resumen");
        BtnResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResumenActionPerformed(evt);
            }
        });

        jLabel5.setText("Prioridad");

        TxtPrioridad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrioridadActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("By. Melvin Canté");

        BtnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCerrar.setText("Regresar a menú");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(TxtPane);

        BtnVerGrafico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnVerGrafico.setText("Actualizar Gráfico");
        BtnVerGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addComponent(jLabel1)
                                        .addGap(343, 343, 343))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(LblProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(TxtTiempoRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(TxtPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addComponent(jLabel5)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(TxtTiempoLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Btn_Agregar))
                                                            .addComponent(jLabel4)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(126, 126, 126)
                                                        .addComponent(BtnResolver)
                                                        .addGap(34, 34, 34)
                                                        .addComponent(BtnResumen))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(BtnVerGrafico)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(BtnEjemplo)
                                                    .addComponent(BtnLimpiar))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(BtnCerrar))
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCerrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtPrioridad)
                                        .addComponent(TxtTiempoLlegada)))
                                .addComponent(Btn_Agregar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtTiempoRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblProceso))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnEjemplo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnLimpiar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnResolver)
                            .addComponent(BtnResumen))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnVerGrafico)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTiempoRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTiempoRafagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTiempoRafagaActionPerformed

    private void TxtTiempoLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTiempoLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTiempoLlegadaActionPerformed

    private void Btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AgregarActionPerformed

        if ((TxtTiempoRafaga.getText().equals("")) || (TxtTiempoLlegada.getText().equals(""))|| (TxtPrioridad.getText().equals(""))){
            String e = null;
            JOptionPane.showMessageDialog(null, "Ráfaga, Prioridad o Llegada no pueden estar vacíos " + e);
        }else{
            //Se crea un modelo default de la tabla
            DefaultTableModel modelo = (DefaultTableModel) Tbl_TablaInicial.getModel();

            contador++; //Con el contador mantengo el control de cuántos registros se van insertando en la tabla
            Object[] miTabla = new Object[4]; //Creo un Objeto de tres campos
            miTabla[0] = contador; //el proceso será igual al contador
            miTabla[1] = TxtTiempoRafaga.getText(); //se guarda la rafaga ingresada
            miTabla[2] = TxtPrioridad.getText(); //se guarda la prioridad
            miTabla[3] = TxtTiempoLlegada.getText(); //se guarda el tiempo de llegada
            modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
            Tbl_TablaInicial.setModel(modelo); //se pasa el modelo a la tabla...

            //mostrar();
            LblProceso.setText("Proceso " + (contador+1)); //Se muestra el proximo proceso a insertar...
            TxtTiempoRafaga.setText(null); //Se limpia la caja de texto
            TxtPrioridad.setText(null);
            TxtTiempoLlegada.setText(null); //Se limpia la caja de texto
            TxtTiempoRafaga.grabFocus(); //Se coloca el foco en el tiempo de rafaga
        }
    }//GEN-LAST:event_Btn_AgregarActionPerformed

    private void BtnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResolverActionPerformed
        
        cargar(contador);
        operar();
        
    }//GEN-LAST:event_BtnResolverActionPerformed

    private void BtnEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjemploActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) Tbl_TablaInicial.getModel();
        
        contador++; //Con el contador mantengo el control de cuántos registros se van insertando en la tabla
        Object[] miTabla = new Object[4]; //Creo un Objeto de tres campos
        miTabla[0] = contador; //el proceso será igual al contador
        miTabla[1] = "3"; //se guarda la rafaga ingresada
        miTabla[2] = "3"; //se guarda la prioridad
        miTabla[3] = "0"; //se guarda el tiempo de llegada
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        Tbl_TablaInicial.setModel(modelo); //se pasa el modelo a la tabla...
        
        contador++; //Con el contador mantengo el control de cuántos registros se van insertando en la tabla
        miTabla[0] = contador; //el proceso será igual al contador
        miTabla[1] = "4"; //se guarda la rafaga ingresada
        miTabla[2] = "2"; //se guarda la prioridad
        miTabla[3] = "0"; //se guarda el tiempo de llegada
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        Tbl_TablaInicial.setModel(modelo); //se pasa el modelo a la tabla...
        
        contador++; //Con el contador mantengo el control de cuántos registros se van insertando en la tabla
        miTabla[0] = contador; //el proceso será igual al contador
        miTabla[1] = "2"; //se guarda la rafaga ingresada
        miTabla[2] = "2"; //se guarda la prioridad
        miTabla[3] = "3"; //se guarda el tiempo de llegada
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        Tbl_TablaInicial.setModel(modelo); //se pasa el modelo a la tabla...
        
        contador++; //Con el contador mantengo el control de cuántos registros se van insertando en la tabla
        miTabla[0] = contador; //el proceso será igual al contador
        miTabla[1] = "1"; //se guarda la rafaga ingresada
        miTabla[2] = "1"; //se guarda la prioridad
        miTabla[3] = "3"; //se guarda el tiempo de llegada
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        Tbl_TablaInicial.setModel(modelo); //se pasa el modelo a la tabla...
        
    }//GEN-LAST:event_BtnEjemploActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResumenActionPerformed
        Resumen();
    }//GEN-LAST:event_BtnResumenActionPerformed

    private void TxtPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrioridadActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        Principal ventana = new Principal();
        ventana.show();
        dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnVerGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerGraficoActionPerformed
        insertarImagen("c:/Salida/prioridad.jpg");
    }//GEN-LAST:event_BtnVerGraficoActionPerformed

    
    public void cargar(int registros){
        
        //SE COPIA EL CONTENIDO DE LA TABLA EN DOS MATRICES CON LA MISMA INFORMACIÓN, PARA MANTENER UNA COPIA Y DE ESTA TOMAR PARA GENERAR LA TABLA DE RESUMEN
        for (int i = 0; i < contador; i++) {
            data[i][0] = (int) Tbl_TablaInicial.getValueAt(i, 0); //Fue almacenado con int por ello no se le pasa parseInt
            copia[i][0] = data[i][0];
            data[i][1] = parseInt((String) (Tbl_TablaInicial.getValueAt(i, 1)));
            copia[i][1] = data[i][1];
            data[i][2] = parseInt((String) (Tbl_TablaInicial.getValueAt(i, 2)));
            copia[i][2] = data[i][2];
            data[i][3] = parseInt((String) (Tbl_TablaInicial.getValueAt(i, 3)));
            copia[i][3] = data[i][3];
            
        }
    }
    
    public void operar(){
        
        
        int tiempos=0;
        int sumaTiempos=0;
        int rafagaPeque=0; //almacena la rafaga mas pequeño encontrada
        int prioridadPeque=1000;
        int posicion=0;
        int vllegada = 0; //controlar el momento de la llegada
        
        //CALCULAR LA SUMATORIA DE TIEMPOS, Esto marca el final del ciclo del algoritmo
        for (int t = 0; t < contador; t++) {
            sumaTiempos = sumaTiempos + data[t][1];
        }
        
        //GUARDAR LOS PROCESOS EN LA TABLA RESUMEN
        for (int x = 0; x < contador; x++) {
            resumen[x][0]=data[x][0];
        }
        
        //ENCADENAMIENTO ES COSA DE NIÑOS xD, LA LISTA ESTÁ MEJORADA
        encadenamiento= "T" + Integer.toString(tiempos);
        
        //ESTA LISTA ALMACENA TODOS LOS NODOS DE LOS RESULTADOS PARA EL DIAGRAMA DE GANTT
        Lista.add("T" + Integer.toString(tiempos));
        
        for (int j = 0; j < sumaTiempos; j++) { //Se tiene que ejecutar segun el total de ráfagas
            
            for (int i = 0; i < contador; i++) { //Recorre los procesos ingresados...
                    
                for (int k = 0; k < contador; k++) { //establecer prioridad más pequeña según la llegada

                    if(data[k][3] <= tiempos){ // Con esta condición sólo se admiten los procesos no mayores al tiempo de llegada...

                        if((data[k][2]<prioridadPeque) && (data[k][1]>0)){ //Busca la prioridad de las rafagas tengan por lo menos 1 que ejecutar
                           prioridadPeque=data[k][2]; //captura la prioridad más pequeña que equivale a la prioridad más alta.
                           posicion = data[k][0]; //capturar posicion del proceso
                        }
                    }    
                }                 
                
            }
            
            encadenamiento = encadenamiento + " => P" + Integer.toString(posicion)+ " => T" + Integer.toString(tiempos+1);
            
            //ESTA LISTA ALMACENA TODOS LOS NODOS DE LOS RESULTADOS PARA EL DIAGRAMA DE GANTT
            Lista.add("[label=P" + Integer.toString(posicion) + "]");
            Lista.add("T" + Integer.toString(tiempos+1));
            
            //PROCESO INICIO...
            if(data[posicion-1][1]==copia[posicion-1][1]){ //rafaga actual es igual a rafaga copia, si son iguales entonces es el inicio.
                resumen[posicion-1][1]=tiempos; //almacenar el tiempo en que inició el proceso
            }
            
            System.out.println("P" + data[posicion-1][0] + " Rafaga: " + data[posicion-1][1] + " Prioridad: " + data[posicion-1][2] + " Llegada: " + data[posicion-1][3]);
            
            data[posicion-1][1]=data[posicion-1][1]-1; //disminuir una rafaga
            
            //PROCESO FINALIZADO...
            if(data[posicion-1][1]==0){ //rafaga actual es igual CERO, si es así entonces esta finalizando.
                resumen[posicion-1][2]=tiempos+1; //almacenar el tiempo en que finalizó el proceso
            }
            
            tiempos++; //pasar a la siguiente llegada
            prioridadPeque=1000;
            
            //TABLA RESUMEN EN CONSOLA
                System.out.println("______________________________");
                for (int z = 0; z < contador; z++) {
                    System.out.println("P" + resumen[z][0] + "    Inicio: " + resumen[z][1] + "     Finalizado: " + resumen[z][2]);
                }

        }
        
        TxtResultado.setText(encadenamiento); //Mostrar el resultado de encadenamiento en la caja de resultados
        Dibujar();
    }
    
    
    public void Dibujar(){
        
        //GENERAR LA GRAMÁTICA DE GRAPHVIZ
        cadenaLista= "digraph G {rankdir=LR\n" +
                "node [shape=box, color=blue]\n";
        
        //INICIAR LA CADENA CON EL PRIMER VALOR DE LA LISTA, EN TODOS LOS CASOS SERÁ T0
        cadenaLista = cadenaLista + Lista.get(0);
        
        //EL FOR EMPIEZA EN 1 PORQUE YA SE ENCADENÓ EL 0 EN LA LINEA DE ARRIBA
        for (int i = 1; i < Lista.size(); i++) {
            cadenaLista = cadenaLista + " -> " + Lista.get(i+1) + Lista.get(i) + ";\n"; //LO QUE LLEVO + Tx + LA ETIQUETA DE Px
            
            //MIENTRAS LA I AÚN SEA MENOR AL TAMAÑO DE LA LISTA ENCADENAR EL SIGUIENTE NODO, SINO YA NO ENCADENAR MÁS...
            if(i+2!=Lista.size()){ 
               cadenaLista = cadenaLista + Lista.get(i+1);
                i++; 
            }else{
                i++;
            }
                    
        }
        
        cadenaLista=cadenaLista + "\n};";
        
        System.out.println("Cadena Lista: " + cadenaLista);
        
        
        //INTENTAR CREAR LA IMAGEN DE PRIORIDAD
        try {
        
        //CREAR EL ARCHIVO DE TEXTO CON LA TRADUCCIÓN GENERADA
        String ruta = "c:\\Salida\\prioridad.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(cadenaLista);
            bw.close();

            
        String dotPath = "c:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

        String fileInputPath = "c:\\Salida\\prioridad.txt";

        String fileOutputPath = "c:\\Salida\\prioridad.jpg";

        String tParam = " -Tjpg ";
        String tOParam = " -o ";

        String completa = dotPath + tParam + fileInputPath + tOParam + fileOutputPath; //CADENA COMPLETA PARA CREAR LA IMAGEN
        
        Runtime rt = Runtime.getRuntime(); //EJECUTA COMANDOS DE CMD
        rt.exec(completa); //EJECUTA COMANDOS DE CMD
        
        
        TxtPane.setText("");
        ImageIcon salida = new ImageIcon("c:\\Salida\\LIMPIAR.jpg");
        TxtPane.insertIcon(salida);
        
        
        insertarImagen("c:/Salida/LIMPIAR.jpg");
            
        System.out.println("Proceso terminado con éxito");

              
    }catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al intentar crear con GraphViz dot.exe la imagen " + ex);
    }
    }
    
    
    public void insertarImagen(String direccion){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
            //PROBAR METER IMAGENES EN PANE O LBL
            TxtPane.setText("");
            ImageIcon salida = new ImageIcon("c:\\Salida\\prioridad.jpg");
            TxtPane.insertIcon(salida);
    }
    
    public void Resumen(){

        //data// proceso, rafaga, llegada, estado
        //copia // proceso, rafaga, llegada, estado
        //resumen // proceso, inicio, finalizado, rafagas
        //resumenTabla // proceso, T_entrega, T_respuesta, T_espera

        //ENTREGA = T.Finalizado - T.Llegada
        //RESPUESTA = T.Inicio - T.Llegada
        //ESPERA = ENTREGA - Rafagas
            
        for (int i = 0; i < contador; i++) {
            resumenTabla[i][0]=resumen[i][0];//copiar proceso
            resumenTabla[i][1]=resumen[i][2]-data[i][3]; //calcular T_Entrega
            resumenTabla[i][2]=resumen[i][1]-data[i][3]; //calcular T_Respuesta
            resumenTabla[i][3]=resumenTabla[i][1]-copia[i][1]; //calcular T_Espera: (finalizado - llegada)-rafaga
            promedio = promedio + resumenTabla[i][3];
            
            Resumen.resumenTabla[i][0]=resumenTabla[i][0];
            Resumen.resumenTabla[i][1]=resumenTabla[i][1];
            Resumen.resumenTabla[i][2]=resumenTabla[i][2];
            Resumen.resumenTabla[i][3]=resumenTabla[i][3];
        }
        
        promedio = (promedio / contador);
        Resumen.promedio = promedio;
        Resumen.contador = contador;
        
        
        //TABLA RESUMEN EN CONSOLA
//        System.out.println("______________________________");
//        for (int z = 0; z < contador; z++) {
//            System.out.println("P" + resumenTabla[z][0] + "    Entrega: " + resumenTabla[z][1] + "     Respuesta: " + resumenTabla[z][2] + "     Espera: " + resumenTabla[z][3]);
//        }
//        System.out.println("Promedio: " + promedio);
        Resumen.encadenamiento = encadenamiento;
        
        Resumen ver = new Resumen();
        ver.setVisible(true);
        dispose();
    }
    
    public void Limpiar(){
        
        //Limpiar cajas de texto
        TxtResultado.setText(null);
        TxtPane.setText("");
        contador=0;
        
        //Vaciar matrices
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 50; j++) {
                data[j][i]=0;
                copia[j][i]=0;
                resumen[j][i]=0;
                resumenTabla[j][i]=0;
            }
        }
        
        //Vaciar tabla
        Tbl_TablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Proceso", "Rafaga", "Prioridad", "Llegada" //Encabezados para la tabla
            }
        ));
    }
    
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
            java.util.logging.Logger.getLogger(PrioridadApropiativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrioridadApropiativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrioridadApropiativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrioridadApropiativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrioridadApropiativo().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnEjemplo;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnResolver;
    private javax.swing.JButton BtnResumen;
    private javax.swing.JButton BtnVerGrafico;
    private javax.swing.JButton Btn_Agregar;
    private javax.swing.JLabel LblProceso;
    private javax.swing.JTable Tbl_TablaInicial;
    private javax.swing.JTextPane TxtPane;
    private javax.swing.JTextField TxtPrioridad;
    private javax.swing.JTextArea TxtResultado;
    private javax.swing.JTextField TxtTiempoLlegada;
    private javax.swing.JTextField TxtTiempoRafaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
