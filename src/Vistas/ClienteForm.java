/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;



import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;

/**
 *
 * @author Enrique Isales
 */
public class ClienteForm extends javax.swing.JInternalFrame {

        ClienteDAO dao = new ClienteDAO();
        Cliente cl = new Cliente();
    
    
        DefaultTableModel modelo= new DefaultTableModel();
        int id;
    
    public ClienteForm() {
        
        initComponents();
        listar();
    }
    
    void listar(){
    List<Cliente> lista = dao.listar();
    modelo=(DefaultTableModel)tabla.getModel();
    Object[]ob=new Object[5];
    for(int i=0; i<lista.size();i++){
        ob[0]=lista.get(i).getId();
        ob[1]=lista.get(i).getDpi();
        ob[2]=lista.get(i).getNom();
        ob[3]=lista.get(i).getDir();
        ob[4]=lista.get(i).getEstado();
        modelo.addRow(ob);
        
    }
    tabla.setModel(modelo);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtdpi = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        selecEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnagregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Menu de Clientes");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 76, 60));
        jLabel1.setText("NIT:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(231, 76, 60));
        jLabel2.setText("NOMBRES:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(231, 76, 60));
        jLabel3.setText("DIRECCION:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 76, 60));
        jLabel4.setText("ESTADO:");

        txtdireccion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtdpi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txtnombres.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        selecEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        selecEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "0", "1" }));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(231, 76, 60))); // NOI18N

        btnagregar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-base-de-datos-32.png"))); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-actualizar-32.png"))); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-32.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-crear-nuevo-32.png"))); // NOI18N
        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdpi, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(txtdireccion)
                            .addComponent(txtnombres, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(selecEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(selecEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "NIT", "NOMBRES", "DIRECCION", "ESTADO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMaxWidth(50);
            tabla.getColumnModel().getColumn(1).setMaxWidth(80);
            tabla.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
            agregar();
            limpiarTabla();
            listar();
            nuevo();
       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed


        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
       eliminar();
       limpiarTabla();
       listar();
       nuevo();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();
        limpiarTabla();
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        int fila=tabla.getSelectedRow();
        
        if(fila == -1){
            JOptionPane.showMessageDialog(this,"Debe Seleccionar una Fila");    
        }else{
        id= Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        String dpi=tabla.getValueAt(fila, 1).toString();
        String nom=tabla.getValueAt(fila, 2).toString();
        String dir=tabla.getValueAt(fila, 3).toString();
        String es=tabla.getValueAt(fila, 4).toString();
        txtdpi.setText(dpi);
        txtnombres.setText(nom);
        txtdireccion.setText(dir);
        selecEstado.setSelectedItem(es);
        }

        
    }//GEN-LAST:event_tablaMouseClicked

    void agregar(){
        String dpi=txtdpi.getText();
        String nom=txtnombres.getText();
        String dir=txtdireccion.getText();
        String es=selecEstado.getSelectedItem().toString();
        
        Object[] ob=new Object[4];
        ob[0]=dpi;
        ob[1]=nom;
        ob[2]=dir;
        ob[3]=es;
        dao.add(ob);
        
        
    }

    void actualizar(){
        int fila=tabla.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Debe Ingresar una fila");
            
        }else{
        
        String dpi=txtdpi.getText();
        String nom=txtnombres.getText();
        String dir=txtdireccion.getText();
        String es=selecEstado.getSelectedItem().toString();
        
        Object[] obj=new Object[5];
        
        obj[0]=dpi;
        obj[1]=nom;
        obj[2]=dir;
        obj[3]=es;
        obj[4]=id;
        dao.actualizar(obj);
        
        }

    }

    void eliminar(){
        int fila=tabla.getSelectedRow();
        int ids=Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Debe Ingresar una fila");
            
        }else{
      
        dao.eliminar(ids);
        }
        

    }

    void nuevo(){
        txtnombres.setText("");
        txtdireccion.setText("");
        txtdpi.setText("");
        selecEstado.setSelectedItem(0);
        txtdpi.requestFocus();
        

    }
    
    void limpiarTabla(){
        for(int i=0; i <modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
            
        }
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selecEstado;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdpi;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}