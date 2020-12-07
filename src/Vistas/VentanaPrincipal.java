/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Excepciones.ArchivoJSONInvalido;
import Excepciones.ExtencionDeArchivoInvalida;
import Excepciones.OperacionInvalida;
import Modelos.CalculadoraConjuntos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;

/**
 *
 * @author Andres Esparza
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private CalculadoraConjuntos calculadora;

    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jFileSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextoFichero2 = new javax.swing.JTextArea();
        JChooser2 = new javax.swing.JButton();
        JChooser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextoFichero1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDiferencia = new javax.swing.JButton();
        jDiferenciaSimetrica = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextoFichero3 = new javax.swing.JTextArea();
        jUnion = new javax.swing.JButton();
        jInterseccion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CONJUNTOS");

        jFileSave.setText("GUARDAR RESULTADO");
        jFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileSaveActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextoFichero2.setEditable(false);
        jTextoFichero2.setColumns(20);
        jTextoFichero2.setLineWrap(true);
        jTextoFichero2.setRows(5);
        jScrollPane2.setViewportView(jTextoFichero2);

        JChooser2.setText("Conjunto 2");
        JChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JChooser2ActionPerformed(evt);
            }
        });

        JChooser.setText("Conjunto 1");
        JChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JChooserActionPerformed(evt);
            }
        });

        jTextoFichero1.setEditable(false);
        jTextoFichero1.setColumns(20);
        jTextoFichero1.setLineWrap(true);
        jTextoFichero1.setRows(5);
        jScrollPane1.setViewportView(jTextoFichero1);

        jLabel3.setText("Seleccione dos conjuntos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JChooser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JChooser2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(JChooser)
                        .addGap(30, 30, 30)
                        .addComponent(JChooser2)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jDiferencia.setText("Diferencia");
        jDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiferenciaActionPerformed(evt);
            }
        });

        jDiferenciaSimetrica.setText("Diferencia simetrica");
        jDiferenciaSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDiferenciaSimetricaActionPerformed(evt);
            }
        });

        jTextoFichero3.setEditable(false);
        jTextoFichero3.setColumns(20);
        jTextoFichero3.setLineWrap(true);
        jTextoFichero3.setRows(5);
        jScrollPane3.setViewportView(jTextoFichero3);

        jUnion.setText("Union");
        jUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUnionActionPerformed(evt);
            }
        });

        jInterseccion.setText("Interseccion");
        jInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInterseccionActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel2.setText("Operaciones entre conjuntos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDiferenciaSimetrica)
                            .addComponent(jDiferencia)
                            .addComponent(jUnion)
                            .addComponent(jInterseccion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jUnion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jInterseccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDiferencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDiferenciaSimetrica)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jFileSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFileSave)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JChooserActionPerformed
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            System.out.println("aaaaa");
            File archivo = fc.getSelectedFile();
            try {
                calculadora.setConjuntoA(archivo);
                jTextoFichero1.setText(calculadora.getConjuntoAString());
            } catch (FileNotFoundException ex) {
                jTextoFichero1.setText("no se encontro el archivo");
            } catch (ExtencionDeArchivoInvalida ex) {
                jTextoFichero1.setText(ex.getMessage());
            } catch (ArchivoJSONInvalido ex) {
                jTextoFichero1.setText(ex.getMessage());
            }
            
        }
        
    }//GEN-LAST:event_JChooserActionPerformed

    private void JChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JChooser2ActionPerformed
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            try {
                calculadora.setConjuntoB(archivo);
                jTextoFichero2.setText(calculadora.getConjuntoBString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExtencionDeArchivoInvalida ex) {
                jTextoFichero2.setText(ex.getMessage());
            } catch (ArchivoJSONInvalido ex) {
                jTextoFichero2.setText(ex.getMessage());
            }

        }
        
    }//GEN-LAST:event_JChooser2ActionPerformed

    private void jFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileSaveActionPerformed
        JSONArray elementos = new JSONArray();
        elementos.add(1);
        elementos.add(2);
        elementos.add(3);
        elementos.add(4);
        //jTextoFichero3.setText(elementos.toJSONString());

        JFileChooser guardar = new JFileChooser();
        guardar.showSaveDialog(this);
        guardar.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        File archivo = guardar.getSelectedFile();
        try {
            calculadora.crearResultado(archivo);
        } catch (IOException ex) {
            jTextoFichero3.setText("error con el archivo");
        }
    }//GEN-LAST:event_jFileSaveActionPerformed

    private void jUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUnionActionPerformed
        try {
            calculadora.realizarUnion();
            jTextoFichero3.setText(calculadora.getConjuntoCString());
        } catch (OperacionInvalida ex) {
            jTextoFichero3.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jUnionActionPerformed

    private void jInterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInterseccionActionPerformed
        try {
            calculadora.realizarInterseccion();
            jTextoFichero3.setText(calculadora.getConjuntoCString());
        } catch (OperacionInvalida ex) {
            jTextoFichero3.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jInterseccionActionPerformed

    private void jDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiferenciaActionPerformed
        try {
            calculadora.realizarDiferencia();
            jTextoFichero3.setText(calculadora.getConjuntoCString());
        } catch (OperacionInvalida ex) {
            jTextoFichero3.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jDiferenciaActionPerformed

    private void jDiferenciaSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDiferenciaSimetricaActionPerformed
        try {
            calculadora.realizarDiferenciaSimetrica();
            jTextoFichero3.setText(calculadora.getConjuntoCString());
        } catch (OperacionInvalida ex) {
            jTextoFichero3.setText(ex.getMessage());
        }
    }//GEN-LAST:event_jDiferenciaSimetricaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        CalculadoraConjuntos calculadora = new CalculadoraConjuntos();
        ventana.setCalculadora(calculadora);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JChooser;
    private javax.swing.JButton JChooser2;
    private javax.swing.JButton jDiferencia;
    private javax.swing.JButton jDiferenciaSimetrica;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JButton jFileSave;
    private javax.swing.JButton jInterseccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextoFichero1;
    private javax.swing.JTextArea jTextoFichero2;
    private javax.swing.JTextArea jTextoFichero3;
    private javax.swing.JButton jUnion;
    // End of variables declaration//GEN-END:variables

    public CalculadoraConjuntos getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(CalculadoraConjuntos calculadora) {
        this.calculadora = calculadora;
    }
}
