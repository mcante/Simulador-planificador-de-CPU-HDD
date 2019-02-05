
package planificador_v1;

import static java.lang.Math.abs;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;


public class Disco extends javax.swing.JFrame {

    
    //ALMACENA LA CANTIDAD DE SOLICITUDES QUE SE ATENDERAN
    Integer cantiSolicitudes=0;
    Integer contador=0;
    Integer ci=0; //Cilindro inicial
    
    LinkedList<Integer> Lista = new LinkedList<Integer>();
    LinkedList<Integer> Ordenada = new LinkedList<Integer>();
    LinkedList<Integer> OrdenadaSsf = new LinkedList<Integer>();
    LinkedList<Integer> OrdenadaScan = new LinkedList<Integer>();
    LinkedList<Integer> ResultadosSsf = new LinkedList<Integer>();
    LinkedList<Integer> ResultadosScan = new LinkedList<Integer>();
    public int[][] resultadoFcfs = new int[50][3]; // del, al, movimientos
    public int[][] resultadoSsf = new int[50][3]; // del, al, movimientos
    public int[][] resultadoScan = new int[50][3]; // del, al, movimientos
    

    public Disco() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblSolicitudes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TxtSolicitudes = new javax.swing.JTextField();
        BtnCrearEspacios = new javax.swing.JButton();
        BtnEjemplo = new javax.swing.JButton();
        BtnAnalizar = new javax.swing.JButton();
        TxtCilindro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblFcfs = new javax.swing.JTable();
        TxtMovFcfs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblSsf = new javax.swing.JTable();
        TxtMovSsf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TblScan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        TxtMovScan = new javax.swing.JTextField();
        BtnEjemplo2 = new javax.swing.JButton();
        TxtTiende = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtMejor = new javax.swing.JTextField();
        BtnCerrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Solicitudes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblSolicitudes);

        jLabel1.setText("Cantidad de Solicitudes");

        TxtSolicitudes.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtnCrearEspacios.setText("Crear");
        BtnCrearEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearEspaciosActionPerformed(evt);
            }
        });

        BtnEjemplo.setText("Cargar Ejemplo 1");
        BtnEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjemploActionPerformed(evt);
            }
        });

        BtnAnalizar.setText("ANALIZAR");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });

        TxtCilindro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Cilindro Inicial");

        jLabel3.setText("RESULTADOS");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("ALGORITMOS DE PLANIFICACIÓN DE DISCO");

        Pane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Pane.setToolTipText("");
        Pane.setName(""); // NOI18N

        TblFcfs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Del", "Al", "Resultado"
            }
        ));
        jScrollPane2.setViewportView(TblFcfs);

        TxtMovFcfs.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("MOVIMIENTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TxtMovFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMovFcfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pane.addTab("FCFS", jPanel1);

        TblSsf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Del", "Al", "Resultado"
            }
        ));
        jScrollPane3.setViewportView(TblSsf);

        TxtMovSsf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("MOVIMIENTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TxtMovSsf, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMovSsf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pane.addTab("SSTF", jPanel2);

        TblScan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Del", "Al", "Resultado"
            }
        ));
        jScrollPane4.setViewportView(TblScan);

        jLabel7.setText("MOVIMIENTOS");

        TxtMovScan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtMovScan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMovScan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pane.addTab("SCAN O ELEVADOR", jPanel3);

        BtnEjemplo2.setText("Cargar Ejemplo 2");
        BtnEjemplo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjemplo2ActionPerformed(evt);
            }
        });

        TxtTiende.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTiende.setText("0");
        TxtTiende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTiendeActionPerformed(evt);
            }
        });

        jLabel8.setText("Tiende a:");

        jLabel9.setText("MEJOR ALGORITMO");

        TxtMejor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCerrar.setText("Regresar a menú");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("By. Melvin Canté");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(BtnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtnCrearEspacios))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(15, 15, 15)
                                                        .addComponent(BtnAnalizar))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(BtnEjemplo2)
                                                            .addComponent(BtnEjemplo)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel2)
                                                            .addComponent(TxtCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(TxtTiende, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(TxtMejor))))
                                        .addGap(14, 14, 14)
                                        .addComponent(Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BtnCerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCrearEspacios)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtCilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtTiende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(26, 26, 26)))
                        .addComponent(BtnAnalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEjemplo)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEjemplo2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMejor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void BtnCrearEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearEspaciosActionPerformed

        if (!TxtSolicitudes.getText().equals("")) {
            limpiar(); //Limpiar tabla antes de empezar
            cantiSolicitudes = Integer.valueOf(TxtSolicitudes.getText());
            contador = cantiSolicitudes;
            DefaultTableModel modelo = (DefaultTableModel) TblSolicitudes.getModel();
            Object[] miTabla = new Object[2];
            for (int i = 0; i < cantiSolicitudes; i++) {
                miTabla[0] = i+1;
                miTabla[1] = "";
                modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
                TblSolicitudes.setModel(modelo); //se pasa el modelo a la tabla...
            }
        } else {
            String e = null;
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad de solicitudes, no puede quedar en blanco " + e);
        }
        

    }//GEN-LAST:event_BtnCrearEspaciosActionPerformed

    private void BtnEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjemploActionPerformed
        limpiar(); //Si es un ejemplo limpiar valores.
        DefaultTableModel modelo = (DefaultTableModel) TblSolicitudes.getModel();
        Object[] miTabla = new Object[2];
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "1";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "36";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "16";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "34";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "9";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "12";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        TxtCilindro.setText("20");
        TxtTiende.setText("0");
    }//GEN-LAST:event_BtnEjemploActionPerformed

    private void BtnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarActionPerformed
        
        TxtMovFcfs.setText("0");
        TxtMovSsf.setText("0");
        TxtMovScan.setText("0");
        
        
        if (!TxtCilindro.getText().equals("")) {

            for (int i = 0; i < contador; i++) {
                int val = new Integer((String) TblSolicitudes.getValueAt(i, 1)); //Castear el objeto como String y luego como integer
                               
                Lista.add(val); //Fue almacenado con int por ello no se le pasa parseInt
                Ordenada.add(val); //Fue almacenado con int por ello no se le pasa parseInt
                OrdenadaSsf.add(val); //Fue almacenado con int por ello no se le pasa parseInt
                OrdenadaScan.add(val); //Fue almacenado con int por ello no se le pasa parseInt
                
            }
            
            //ORDENAR LISTA
            Collections.sort(Ordenada); //SORT ORDENA LISTAS...
            Collections.sort(OrdenadaSsf); //SORT ORDENA LISTAS...
            //System.out.println("Ordenada: " + Ordenada);
        
            ci = Integer.valueOf(TxtCilindro.getText());
            System.out.println("Lista: " + Lista);
        
            leerTablaFcFs();
            leerTablaSsf();
            
            if (TxtTiende.getText()!="") {
                leerScan();
            }
            
            //VERIFICAR QUIEN ES EL MEJOR ALGORITMO DE LOS TRES
            mejor();
            
        } else {
            String e = null;
            JOptionPane.showMessageDialog(null, "El campo de cilindro inicial no puede estar vacío." + e);
        }
        
        
        
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    public void mejor(){
        int fcfs = 0;
        int ssf = 0;
        int scan = 0;
        
        int menor = 0;

        if (TxtMovFcfs.getText()!="" && TxtMovSsf.getText()!="" && TxtMovScan.getText()!="") {
            fcfs = Integer.valueOf(TxtMovFcfs.getText());
            ssf = Integer.valueOf(TxtMovSsf.getText());
            scan = Integer.valueOf(TxtMovScan.getText());


            if (fcfs<ssf && fcfs<scan) {
                menor = fcfs;
                TxtMejor.setText("FcFs: "+menor);
            } else if (ssf<fcfs && ssf<scan) {
                menor = ssf;
                TxtMejor.setText("SSTF: "+menor);
            } else if (scan<fcfs && scan<ssf) {
                menor = scan;
                TxtMejor.setText("Scan: "+menor);
            }
        }
        
        
        
    }
    
    
    private void BtnEjemplo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjemplo2ActionPerformed
        limpiar(); //Si es un ejemplo limpiar valores.
        DefaultTableModel modelo = (DefaultTableModel) TblSolicitudes.getModel();
        Object[] miTabla = new Object[2];
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "26";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "98";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "100";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "110";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        contador++;
        miTabla[0] = contador;
        miTabla[1] = "115";
        modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
        
        TxtCilindro.setText("72");
    }//GEN-LAST:event_BtnEjemplo2ActionPerformed

    private void TxtTiendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTiendeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTiendeActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        Principal ventana = new Principal();
        ventana.show();
        dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    //RESOLVER ALGORITMO FCFS
    public void leerTablaFcFs(){
        
        
        //Preparar la matriz de resultados.
        int con =1;
        resultadoFcfs[0][0] = ci;
        resultadoFcfs[0][1] = Lista.get(0);
        resultadoFcfs[0][2] = abs(resultadoFcfs[0][0] - resultadoFcfs[0][1]);

        for (int i = 0; i < contador-1; i++) {
            resultadoFcfs[con][0] = Lista.get(i);
            resultadoFcfs[con][1] = Lista.get(i+1);
            resultadoFcfs[con][2] = abs(resultadoFcfs[con][0] - resultadoFcfs[con][1]);
            con++;
        }
        
        int movimientos = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("Del "+ resultadoFcfs[i][0] + " Al " + resultadoFcfs[i][1] + " Resultado " + resultadoFcfs[i][2]); 
            movimientos += resultadoFcfs[i][2];
        }
        
        System.out.println("Total de movimiento: " + movimientos);
        TxtMovFcfs.setText(""+movimientos);
        
        DefaultTableModel modelo = (DefaultTableModel) TblFcfs.getModel();
        
        Object[] miTabla = new Object[3]; //Creo un Objeto de tres campos
        //resumenTabla // proceso, T_entrega, T_respuesta, T_espera
        for (int i = 0; i < contador; i++) {
            
            miTabla[0] = resultadoFcfs[i][0]; //el proceso será igual al contador
            miTabla[1] = resultadoFcfs[i][1]; //se guarda la rafaga ingresada
            miTabla[2] = resultadoFcfs[i][2]; //se guarda el tiempo de llegada
            modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
            TblFcfs.setModel(modelo); //se pasa el modelo a la tabla...
            
        }
        
    }
    
    public void leerTablaSsf(){
        System.out.println("_________________******* SSF *******_________________");
        
        System.out.println("Tamaño de la lista: " + OrdenadaSsf.size());
        int Mayor = ci;
        int tiempo = 1000;
        int tmp = 0;
        int indice = 0;
        int valor = 0;
        
        //RECORRE COMPLETO
        for (int j = 0; j < contador; j++) {
            //System.out.println("Lista: " + OrdenadaSsf);
            
            //RECORRE LO QUE VAYA QUEDANDO.
            for (int i = 0; i < OrdenadaSsf.size(); i++) {
          
                tmp = abs(OrdenadaSsf.get(i) - Mayor);
                
                if(tmp <= tiempo){
                    valor = OrdenadaSsf.get(i);
                    tiempo = tmp;
                    indice = i;
                }
            }
            
            resultadoSsf[j][0] = Mayor;
            resultadoSsf[j][1] = valor;
            resultadoSsf[j][2] = abs(valor - Mayor);
                    
            //System.out.println("Valor " + valor + "  menos " + Mayor + "  Resultado " + abs(valor - Mayor) + " Lista: " + OrdenadaSsf.size());
            tiempo = 1000;
            
            Mayor = valor;
            OrdenadaSsf.remove(indice);
            
        }
        System.out.println("Terminó");
            
        
        
        //RECORRER LOS RESULTADOS
        int movimientos = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println(i + "  Del " + resultadoSsf[i][0] + " Al " + resultadoSsf[i][1] + " RESULTADO " + resultadoSsf[i][2]); 
            movimientos += resultadoSsf[i][2];
        }
        
        TxtMovSsf.setText(""+movimientos);
        
        DefaultTableModel modelo = (DefaultTableModel) TblSsf.getModel();
        
        Object[] miTabla = new Object[3]; //Creo un Objeto de tres campos
        //resumenTabla // proceso, T_entrega, T_respuesta, T_espera
        for (int i = 0; i < contador; i++) {
            
            miTabla[0] = resultadoSsf[i][0]; //el proceso será igual al contador
            miTabla[1] = resultadoSsf[i][1]; //se guarda la rafaga ingresada
            miTabla[2] = resultadoSsf[i][2]; //se guarda el tiempo de llegada
            modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
            TblSsf.setModel(modelo); //se pasa el modelo a la tabla...
            
        }
        
    }
    

    
    
    public void leerScan(){
        System.out.println("******************** SCAN *******************");
        
        int tiende = 0;
        tiende = Integer.valueOf(TxtTiende.getText());
        
        int posInicial = 0;
        int conta = 0;
        
        OrdenadaScan.add(ci);
                
        Collections.sort(OrdenadaScan); //SORT ORDENA LA LISTA...
        
        //SI TIENDE A CERO ENTOCNES AGREGARLO A LA LISTA
        if (tiende == 0) {
            OrdenadaScan.add(tiende);
            Collections.sort(OrdenadaScan); //VOLVER A ORDENAR LISTA...
        } else {
            
            int ultimo = OrdenadaScan.getLast();
            if (ultimo < tiende) {
                OrdenadaScan.add(tiende); //NO ES NECESARIO ORDENAR PORQUE QUEDA AL FINAL DE LA LISTA
            }
        }
        
        
        //MOSTRAR LA NUEVA LISTA
        System.out.println("Lista: " + OrdenadaScan);
        
        //ENCONTRAR EL PUNTO INICIAL
        for (int i = 0; i < resultadoFcfs.length; i++) {
            if ((OrdenadaScan.get(i) == ci)) {
                posInicial = i;
                break;
            }
        }
        
        
        
        System.out.println("Estoy en: " + OrdenadaScan.get(posInicial));
        
        
        //CREAR NUEVA LISTA ORDENADA DE SOLICITUDES SEGÚN EL ALGORITMO
        if (tiende == 0) {
            //TIENDE A LA IZQUIERDA O A CERO
            System.out.println("Tiende hacia la izquierda");
            for (int i = posInicial; i >= 0; i--) {
                System.out.println(i+ " pos. " + OrdenadaScan.get(i));
                ResultadosScan.add(OrdenadaScan.get(i));
            }
            
            
            System.out.println("Tiende hacia la derecha");
            for (int i = posInicial+1; i < OrdenadaScan.size(); i++) {
                System.out.println(i+ " pos. " + OrdenadaScan.get(i));
                ResultadosScan.add(OrdenadaScan.get(i));
            }
            
            //TIENDE A LA DERECHA
        } else {
            System.out.println("Tiende hacia la derecha");
            for (int i = posInicial; i < OrdenadaScan.size(); i++) {
                System.out.println(i+ " pos. " + OrdenadaScan.get(i));
                ResultadosScan.add(OrdenadaScan.get(i));
            }
            
            System.out.println("Tiende hacia la izquierda");
            for (int i = posInicial-1; i >= 0; i--) {
                System.out.println(i+ " pos. " + OrdenadaScan.get(i));
                ResultadosScan.add(OrdenadaScan.get(i));
            }
        }
        
        
        
        //CARGAR MATRIZ CON LOS RESULTADOS DE SCAN
        resultadoScan[conta][0] = ResultadosScan.get(0);
        resultadoScan[conta][1] = ResultadosScan.get(1);
        resultadoScan[conta][2] = abs(resultadoScan[conta][0] - resultadoScan[conta][1]);
        
        
        for (int i = 2; i < ResultadosScan.size(); i++) {
            conta++;
            resultadoScan[conta][0] = resultadoScan[conta-1][1];
            resultadoScan[conta][1] = ResultadosScan.get(i);
            resultadoScan[conta][2] = abs(resultadoScan[conta][0] - resultadoScan[conta][1]);
        }
        
        int movimientos = 0;
        for (int i = 0; i < conta+1; i++) {
            System.out.println("Del: " + resultadoScan[i][0] + "  Al: " + resultadoScan[i][1] + "  Resta: " + resultadoScan[i][2]);
            movimientos += resultadoScan[i][2];
        }
        
        DefaultTableModel modelo = (DefaultTableModel) TblScan.getModel();
        
        Object[] miTabla = new Object[3]; //Creo un Objeto de tres campos
        //resumenTabla // proceso, T_entrega, T_respuesta, T_espera
        for (int i = 0; i < conta+1; i++) {
            
            miTabla[0] = resultadoScan[i][0]; //el proceso será igual al contador
            miTabla[1] = resultadoScan[i][1]; //se guarda la rafaga ingresada
            miTabla[2] = resultadoScan[i][2]; //se guarda el tiempo de llegada
            modelo.addRow(miTabla); //Se agrega un nuevo registro a la tabla y se envia el objeto creado
            TblScan.setModel(modelo); //se pasa el modelo a la tabla...
            
        }
        
        TxtMovScan.setText(movimientos+"");
        
    }
    
    
    
    
    
    public void limpiar(){
        
        contador=0;
        
        //Vaciar tabla
        TblSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "#", "Solicitudes" //Encabezados para la tabla
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
            java.util.logging.Logger.getLogger(Disco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnCrearEspacios;
    private javax.swing.JButton BtnEjemplo;
    private javax.swing.JButton BtnEjemplo2;
    private javax.swing.JTabbedPane Pane;
    private javax.swing.JTable TblFcfs;
    private javax.swing.JTable TblScan;
    private javax.swing.JTable TblSolicitudes;
    private javax.swing.JTable TblSsf;
    private javax.swing.JTextField TxtCilindro;
    private javax.swing.JTextField TxtMejor;
    private javax.swing.JTextField TxtMovFcfs;
    private javax.swing.JTextField TxtMovScan;
    private javax.swing.JTextField TxtMovSsf;
    private javax.swing.JTextField TxtSolicitudes;
    private javax.swing.JTextField TxtTiende;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
