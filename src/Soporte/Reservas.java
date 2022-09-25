package Soporte;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Reservas extends javax.swing.JDialog {

    /** Creates new form Reservas */
    public Reservas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

     public Reservas(Connection c, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.con=c;
        initComponents();
    }
    Connection con=null;
    ResultSet res=null;
    DefaultTableModel modelo = new DefaultTableModel();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try{
            Statement stat = this.con.createStatement();
            //ANDAString consulta="select * from empleado where (nombre='" +jTextField1.getText()+ "') ";
            String consulta="select o.fecha, o.idhabit, t.descriptp, e.descripest from ocupaciones as o, tipoh as t, Estado as e order by fecha, descriptp";
            ///////////seguir desde aca/////////////////////
            ResultSet res=stat.executeQuery(consulta);
            DefaultTableModel mod = new DefaultTableModel();
            this.modelo=mod;  //se hace publico el resultset
            modelo.addColumn("Nombre");
            modelo.addColumn("Calle");
            modelo.addColumn("Ciudad");
            this.res=res;
        // Bucle para cada resultado en la consulta
        while (res.next()){
         // Se crea un array que será una de las filas de la tabla.
        Object [] fila = new Object[3]; // Hay tres columnas en la tabla

        // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
        for (int i=0;i<3;i++)
        fila[i] = res.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.

        // Se añade al modelo la fila completa.
        modelo.addRow(fila);
        }
        this.jTable1.setModel(modelo);
        }
        catch(SQLException e){ e.printStackTrace();}
        this.repaint();
    }//GEN-LAST:event_formWindowActivated



    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reservas dialog = new Reservas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
