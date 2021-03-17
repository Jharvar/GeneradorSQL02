
import Utiles.UtilesSQL;
import generadorsql.ConfiguradorSQL;
import generadorsql.GeneradorSQL;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jharvar
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    
    int nScriptTotal=1;
    private String nScript="";
    private String table="";
    private String vista="";
    private String sinonimo="";
    private String esquema ="";
    private String tipoTicket="";
    private String idTicket="";
    private String tablaSQL="";
    private ConfiguradorSQL config;
    private GeneradorSQL gSQL;
    private File fichero;
    private FileWriter fw;
    private StringBuffer constructorSQL = new StringBuffer();
    
    public VPrincipal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.gSQL = new GeneradorSQL();
        
    }
    private void inicializador(){
        try {
            config=new ConfiguradorSQL();
            fichero = new File(config.getRuta());
            fw = new FileWriter(fichero);
        } catch (IOException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        checkTable = new javax.swing.JCheckBox();
        checkView = new javax.swing.JCheckBox();
        checkSynonym = new javax.swing.JCheckBox();
        checkIndex = new javax.swing.JCheckBox();
        checkGrant = new javax.swing.JCheckBox();
        checkRevoke = new javax.swing.JCheckBox();
        checkTrigger = new javax.swing.JCheckBox();
        checkPK = new javax.swing.JCheckBox();
        checkFK = new javax.swing.JCheckBox();
        labelNumero = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        buttonGeneral = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        listadoEsquemas = new javax.swing.JComboBox<>();
        labelEsquema = new javax.swing.JLabel();
        checkOT = new javax.swing.JCheckBox();
        checkT = new javax.swing.JCheckBox();
        checkD = new javax.swing.JCheckBox();
        identificadorTrabajo = new javax.swing.JTextField();
        identificador = new javax.swing.JLabel();
        tabla = new javax.swing.JTextField();
        labelTabla = new javax.swing.JLabel();
        bConsScript = new javax.swing.JButton();
        labelConstruirScript = new javax.swing.JLabel();
        checkRollback = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        itemLimpiar = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkTable.setText("Table");
        checkTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTableActionPerformed(evt);
            }
        });
        jPanel1.add(checkTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, -1));

        checkView.setText("View");
        checkView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkViewActionPerformed(evt);
            }
        });
        jPanel1.add(checkView, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 60, -1));

        checkSynonym.setText("Synonym");
        checkSynonym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSynonymActionPerformed(evt);
            }
        });
        jPanel1.add(checkSynonym, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 80, -1));

        checkIndex.setText("Index");
        checkIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIndexActionPerformed(evt);
            }
        });
        jPanel1.add(checkIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 60, -1));

        checkGrant.setText("Grant");
        checkGrant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGrantActionPerformed(evt);
            }
        });
        jPanel1.add(checkGrant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 60, -1));

        checkRevoke.setText("Revoke");
        checkRevoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRevokeActionPerformed(evt);
            }
        });
        jPanel1.add(checkRevoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, -1));

        checkTrigger.setText("Trigger");
        checkTrigger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTriggerActionPerformed(evt);
            }
        });
        jPanel1.add(checkTrigger, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 70, -1));

        checkPK.setText("PK");
        checkPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPKActionPerformed(evt);
            }
        });
        jPanel1.add(checkPK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 50, -1));

        checkFK.setText("FK");
        checkFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFKActionPerformed(evt);
            }
        });
        jPanel1.add(checkFK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 50, -1));

        labelNumero.setText("Nº De Scripts");
        jPanel1.add(labelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 70, -1));

        textNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroActionPerformed(evt);
            }
        });
        jPanel1.add(textNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, -1));

        buttonGeneral.setText("Generar");
        buttonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGeneralActionPerformed(evt);
            }
        });
        jPanel1.add(buttonGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 80, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 10));

        listadoEsquemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SICAS", "SICAS_AUDI", "SICAS_BATCH", "SICAS_DEPU", "SICAS_DISCRE", "SICAS_ESTA", "SICAS_SYS", "SICAS_TMP", "SICAS_USER", "SICASBUS", "SICASBUS_AUDI", "SICASBUS_SYS", "SICASBUS_TMP" }));
        listadoEsquemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoEsquemasActionPerformed(evt);
            }
        });
        jPanel1.add(listadoEsquemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        labelEsquema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEsquema.setText("Esquema");
        jPanel1.add(labelEsquema, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 60, 20));

        checkOT.setText("OT");
        checkOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOTActionPerformed(evt);
            }
        });
        jPanel1.add(checkOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        checkT.setText("T");
        checkT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTActionPerformed(evt);
            }
        });
        jPanel1.add(checkT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        checkD.setText("D");
        checkD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDActionPerformed(evt);
            }
        });
        jPanel1.add(checkD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        identificadorTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificadorTrabajoActionPerformed(evt);
            }
        });
        jPanel1.add(identificadorTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, -1));

        identificador.setText("Identificador");
        jPanel1.add(identificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        tabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablaActionPerformed(evt);
            }
        });
        jPanel1.add(tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 150, -1));

        labelTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTabla.setText("Tabla");
        jPanel1.add(labelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 40, 20));

        bConsScript.setText("Construir");
        bConsScript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsScriptActionPerformed(evt);
            }
        });
        jPanel1.add(bConsScript, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 120, -1));

        labelConstruirScript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConstruirScript.setText("Construir Script");
        jPanel1.add(labelConstruirScript, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 64, 90, 20));

        checkRollback.setText("Rollback");
        checkRollback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRollbackActionPerformed(evt);
            }
        });
        jPanel1.add(checkRollback, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 80, -1));

        MenuPrincipal.setText("Archivo");

        itemLimpiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemLimpiar.setText("Limpiar");
        MenuPrincipal.add(itemLimpiar);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemSalir.setText("Salir");
        MenuPrincipal.add(itemSalir);

        jMenuBar1.add(MenuPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroActionPerformed
            if(!textNumero.getText().isEmpty()){
                nScript =textNumero.getText();
                System.out.println(nScript);
            }
    }//GEN-LAST:event_textNumeroActionPerformed

    private void checkTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTableActionPerformed
                if(checkTable.isSelected()){
                    table = checkTable.getText().toString();
                    System.out.println(table);
                    textNumero.setText(Integer.toString(nScriptTotal));
                }
                
    }//GEN-LAST:event_checkTableActionPerformed

    private void checkViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkViewActionPerformed
                if(checkView.isSelected()){
                     vista = checkView.getText();
                     System.out.println(vista);
                      textNumero.setText(Integer.toString(nScriptTotal));
                }
    }//GEN-LAST:event_checkViewActionPerformed

    private void checkSynonymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSynonymActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkSynonymActionPerformed

    private void checkGrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGrantActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkGrantActionPerformed

    private void checkRevokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRevokeActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkRevokeActionPerformed

    private void checkTriggerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTriggerActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkTriggerActionPerformed

    private void checkIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIndexActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkIndexActionPerformed

    private void checkPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPKActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkPKActionPerformed

    private void checkFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFKActionPerformed
         textNumero.setText(Integer.toString(nScriptTotal));
    }//GEN-LAST:event_checkFKActionPerformed

    private void listadoEsquemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoEsquemasActionPerformed
        esquema = listadoEsquemas.getSelectedItem().toString();
        System.out.println(esquema);
    }//GEN-LAST:event_listadoEsquemasActionPerformed

    private void buttonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGeneralActionPerformed

    private void checkOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOTActionPerformed
        tipoTicket = checkOT.getText().toString();
        System.out.println(tipoTicket);
    }//GEN-LAST:event_checkOTActionPerformed

    private void checkTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTActionPerformed
         tipoTicket = checkT.getText().toString();
         System.out.println(tipoTicket);
    }//GEN-LAST:event_checkTActionPerformed

    private void checkDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDActionPerformed
         tipoTicket = checkD.getText().toString();
         System.out.println(tipoTicket);
    }//GEN-LAST:event_checkDActionPerformed

    private void bConsScriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsScriptActionPerformed
            generarScript();
    }//GEN-LAST:event_bConsScriptActionPerformed

    private void identificadorTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificadorTrabajoActionPerformed
        if(!identificadorTrabajo.getText().isEmpty()){
            idTicket = identificadorTrabajo.getText().toString();
            System.out.println(idTicket);
        }
    }//GEN-LAST:event_identificadorTrabajoActionPerformed

    private void tablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablaActionPerformed
        if(!tabla.getText().isEmpty()){
            tablaSQL = tabla.getText().toString();
            System.out.println(tablaSQL);
        }
    }//GEN-LAST:event_tablaActionPerformed

    private void checkRollbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRollbackActionPerformed
                if(checkRollback.isSelected()){
                    nScriptTotal=Integer.parseInt(textNumero.getText())
                            + Integer.parseInt(textNumero.getText());
                    textNumero.setText(Integer.toString(nScriptTotal));
                }
    }//GEN-LAST:event_checkRollbackActionPerformed

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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JButton bConsScript;
    private javax.swing.JButton buttonGeneral;
    private javax.swing.JCheckBox checkD;
    private javax.swing.JCheckBox checkFK;
    private javax.swing.JCheckBox checkGrant;
    private javax.swing.JCheckBox checkIndex;
    private javax.swing.JCheckBox checkOT;
    private javax.swing.JCheckBox checkPK;
    private javax.swing.JCheckBox checkRevoke;
    private javax.swing.JCheckBox checkRollback;
    private javax.swing.JCheckBox checkSynonym;
    private javax.swing.JCheckBox checkT;
    private javax.swing.JCheckBox checkTable;
    private javax.swing.JCheckBox checkTrigger;
    private javax.swing.JCheckBox checkView;
    private javax.swing.JLabel identificador;
    private javax.swing.JTextField identificadorTrabajo;
    private javax.swing.JMenuItem itemLimpiar;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelConstruirScript;
    private javax.swing.JLabel labelEsquema;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelTabla;
    private javax.swing.JComboBox<String> listadoEsquemas;
    private javax.swing.JTextField tabla;
    private javax.swing.JTextField textNumero;
    // End of variables declaration//GEN-END:variables

    public void generarTable(){
        if(UtilesSQL.TABLE.equalsIgnoreCase(table)){
            System.out.println(tipoTicket);
            System.out.println(idTicket);
            System.out.println(nScript);
            System.out.println(esquema);
            System.out.println(tablaSQL);
            System.out.println(UtilesSQL.tipologia.get(UtilesSQL.TABLE));
            gSQL.construirScript(tipoTicket,idTicket,
                    nScript,esquema,tablaSQL,
                    UtilesSQL.tipologia.get(UtilesSQL.TABLE));
        }
    }
    public void generarView(){
        
    }
    public void generarSynonym(){
        
    }
    public void generarGrant(){
        
    }
    public void generarRevoke(){
        
    }
    
    public void generarScript(){
       int cScripts=Integer.parseInt(textNumero.getText().toString());
       System.out.println(cScripts);
       int cRecorrida =0;
       
       while(cRecorrida < cScripts){
            if(checkTable.isSelected()){
                generarTable();
            }if(checkView.isSelected()){
                generarView();
            }if(checkSynonym.isSelected()){
                
            }if(checkGrant.isSelected()){
                
            }if(checkRevoke.isSelected()){
                
            }if(checkTrigger.isSelected()){
                
            }if(checkIndex.isSelected()){
                
            }if(checkPK.isSelected()){
                
            }if(checkFK.isSelected()){
                
            }if(!checkTable.isSelected() 
                    && !checkView.isSelected()
                    && !checkSynonym.isSelected()
                    && !checkGrant.isSelected()
                    && !checkRevoke.isSelected()
                    && !checkTrigger.isSelected()
                    && !checkIndex.isSelected()
                    && !checkPK.isSelected()
                    && !checkFK.isSelected())
                    JOptionPane.showMessageDialog(null, 
                            "Debes Seleccionar un Tipo de Script", 
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
           cRecorrida++;
       }
       
       
       
       
    }




}
