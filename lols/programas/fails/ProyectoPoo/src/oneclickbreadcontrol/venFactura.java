/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneclickbreadcontrol;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Horacio
 */
public class venFactura extends javax.swing.JFrame {
int fila = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form venFactura
     */
    public venFactura(ArrayList<Producto> aux) {
        initComponents();
        this.aux = aux;
        for (Producto p: aux  ) {
            modelo = (DefaultTableModel) factura.getModel();
            modelo.addRow(new Object[fila]);
            //modelo.setValueAt(p.getID(), fila, 0);
            modelo.setValueAt(p.getCatidad(), fila, 0);
            modelo.setValueAt(p.getNombre(), fila, 1);
            modelo.setValueAt(p.getPrecio(), fila, 2);
            
            fila++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTable();
        total = new javax.swing.JLabel();

        factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cantidad", "Nombre", "Precio"
            }
        ));
        jScrollPane1.setViewportView(factura);

        total.setText("Precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(total)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(total)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Producto> aux =new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable factura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
