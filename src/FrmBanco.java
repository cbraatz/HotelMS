
import Hiber1.NewHibernateUtil;
import Hiber1.*;
import Hiber1.Banco;
import imp.*;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FrmBanco extends javax.swing.JDialog {
        //para el navegador de busqueda//
        Session Sesion;
        Query consulta;
        List milista;
        int x=0;  //bandera que indica si se hizo algun cambio y actualizar el navegador
        int contador=1;  //contador de la posicion actual del navegador
        ///////////////////////////////////

        Banco ban=new Banco();
        BancoGest banges=new BancoGest();  //instanciamos las clases necesarias a lo largo del programa
        boolean encontrado=false;   //guarda si se encontro o no
        DocumentoGest docges=new DocumentoGest();
    public FrmBanco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 153), 2, true));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Banco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/primero2.png"))); // NOI18N
        jButton1.setToolTipText("PRIMERO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anterior2.png"))); // NOI18N
        jButton2.setToolTipText("ANTERIOR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/siguiente2.png"))); // NOI18N
        jButton3.setToolTipText("SIGUIENTE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ultimo2.png"))); // NOI18N
        jButton4.setToolTipText("ÚLTIMO");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)), "Datos del Banco", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Teléfono:");

        jTextField1.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setToolTipText("CÓDIGO DEL BANCO");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Dirección:");

        jTextField2.setToolTipText("NOMBRE DEL BANCO");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.setToolTipText("DIRECCIÓN DEL BANCO");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jTextField4.setToolTipText("TELÉFONO DEL BANCO");
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addContainerGap(20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setName(""); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo2.png"))); // NOI18N
        jButton5.setToolTipText("NUEVO");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar2.png"))); // NOI18N
        jButton6.setToolTipText("CONFIRMAR/GUARDAR");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar2.png"))); // NOI18N
        jButton7.setToolTipText("BORRAR");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir2.png"))); // NOI18N
        jButton9.setToolTipText("SALIR");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar2.png"))); // NOI18N
        jButton8.setToolTipText("LIMPIAR");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addComponent(jButton8)
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        int c=0;  //almacena el sig codigo                            //BOTON NUEVO
        c=banges.getsiguientecodigo();
        LimpiarCampos();
        if (c>0){
            jTextField1.setText(Integer.toString(c));
            jTextField2.requestFocus();
        }
        else{
            jTextField1.setText("");
            JOptionPane.showMessageDialog(null,"No se pudo obtener un Código nuevo","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
                                                                      //BOTON GUARDAR
        Banco bb=new Banco();
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()){ //si el campo id o descripcion estan vacios
           JOptionPane.showMessageDialog(null,"Campos clave vacíos","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
           x=0;
           encontrado=false;
        }
        else{
            encontrado=banges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
            int r=0;
            boolean resu=false;
            if (encontrado){  //si se encontro y se desea EDITAR
                r=JOptionPane.showConfirmDialog(null,"¿Desea EDITAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    try {
                        //si se presiono SI
                        bb=banges.GetObjBanco();
                        bb.setNombrebanco(jTextField2.getText().toUpperCase());
                        bb.setDireccionban(jTextField3.getText().toUpperCase());
                        bb.setTelefban(jTextField4.getText().toUpperCase());
                        resu=banges.editBanco(bb);
                        if (resu){  //SI SE EDITO CORRECTAMENTE
                           x=1;
                           JOptionPane.showMessageDialog(null,"El registro fue EDITADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                           LimpiarCampos();
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No se pudo EDITAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            x=0;
                        }

                    } catch (Exception ex) {
                        //Logger.getLogger(FrmBanco.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"Error al intentar EDITAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                        LimpiarCampos();
                        x=0;
                    }
                }
            }
            else{
                r=JOptionPane.showConfirmDialog(null,"¿Desea AGREGAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                    try {
                        bb.setIdbanco(Integer.parseInt(jTextField1.getText()));
                        bb.setNombrebanco(jTextField2.getText().toUpperCase());
                        bb.setDireccionban(jTextField3.getText().toUpperCase());
                        bb.setTelefban(jTextField4.getText().toUpperCase());
                        resu=banges.addBanco(bb);
                        if (resu){
                            JOptionPane.showMessageDialog(null,"El registro fue CARGADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            LimpiarCampos();
                            x=1;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No se pudo CARGAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            x=0;
                        }
                    }
                    catch (Exception ex) {
                        // Logger.getLogger(FrmBanco.class.getName()).log(Level.SEVERE, null, ex); //ya se informa el error en la clase
                        JOptionPane.showMessageDialog(null,"Error al intentar CARGAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                        LimpiarCampos();
                        x=0;
                    }
                }
            }

            //////////////para el navegador de busqueda/////////////////
            if (x==1){  //si se llevo a cabo algun cambio
                Sesion=NewHibernateUtil.getSessionFactory().openSession();
                Sesion.beginTransaction();
                consulta=Sesion.createQuery("from Banco as b");
                milista=consulta.list();
                Sesion.getTransaction().commit();
            }
            ///////////////////////////////////////////////////////////////*/
        }
    }//GEN-LAST:event_jButton6MouseClicked
    private void LimpiarCampos(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        if(jTextField2.getText().length()>=30)   //para la validacion
            evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        if(jTextField3.getText().length()>=60)   //para la validacion
        evt.consume();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        if(jTextField4.getText().length()>=60)   //para la validacion
        evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
                                                                      //BOTON LIMPIAR
        LimpiarCampos();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
                                                                      //BOTON SALIR
        this.dispose();//sale
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                                                                      //CAMPO DE TEXTO ID/CODIGO
        if(jTextField1.getText().isEmpty()==false){
            encontrado=banges.ExisteIdEnTabla(Integer.parseInt(jTextField1.getText()));
            if(encontrado){
                this.ban=banges.GetObjBanco();
                jTextField1.setText(Integer.toString(ban.getIdbanco()));
                jTextField2.setText(ban.getNombrebanco());
                jTextField3.setText(ban.getDireccionban());
                jTextField4.setText(ban.getTelefban());
            }
            else {
                JOptionPane.showMessageDialog(null,"Código NO encontrado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                LimpiarCampos();
                this.ban=new Banco();
                encontrado=false;
            }
        }
        else{
            //JOptionPane.showMessageDialog(null,"Campo Código vacío","DATOS REQUERIDOS INSUFICIENTES",JOptionPane.INFORMATION_MESSAGE);
            LimpiarCampos();
            this.ban=new Banco();
            encontrado=false;
        }

    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int r=0;                                                     //BOTON BORRAR
        boolean resu=false;
        if (encontrado && jTextField1.getText().isEmpty()==false){
            r=JOptionPane.showConfirmDialog(null,"¿Desea BORRAR este registro?", "CONSULTA", JOptionPane.YES_NO_OPTION);
            if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                try {
                   if (docges.ExisteFKBanco(Integer.parseInt(jTextField1.getText()))==false){  //si no esta como FK en ninguna de las tablas
                        Banco banco=new Banco();
                        banco=banges.GetObjBanco();
                        resu=banges.delBanco(banco);
                        if (resu){  //SI SE EDITO CORRECTAMENTE
                            JOptionPane.showMessageDialog(null,"El registro fue BORRADO correctamente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            LimpiarCampos();
                            x=1;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"No se pudo BORRAR correctamente el registro","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            x=0;
                        }
                    }
                   else{
                            JOptionPane.showMessageDialog(null,"No se pudo BORRAR el registro porque está siendo utilizado","AVISO",JOptionPane.INFORMATION_MESSAGE);
                            x=0;
                        }

               } catch (Exception ex) {
                  // JOptionPane.showMessageDialog(null,"Error al intentar BORRAR el registro","ERROR",JOptionPane.ERROR_MESSAGE);
                            //ya tira el error en bancogest
                   LimpiarCampos();
                   x=0;
               }
               //////////////para el navegador de busqueda/////////////////
               if (x==1){  //si se llevo a cabo algun cambio
                    Sesion=NewHibernateUtil.getSessionFactory().openSession();
                    Sesion.beginTransaction();
                    consulta=Sesion.createQuery("from Banco as b");
                    milista=consulta.list();
                    Sesion.getTransaction().commit();
               }
               ///////////////////////////////////////////////////////////////
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Favor seleccionar un elemento a borrar","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
            x=0;
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setResizable(false);                                    //AL CARGARSE EL FORMULARIO
        this.setLocationRelativeTo(null);  //centra el objeto en pantalla
       // setDefaultCloseOperation(0);
        Sesion=NewHibernateUtil.getSessionFactory().getCurrentSession(); //esto no se necesita hacer aca, se puede hacer en el principal
        Sesion.beginTransaction();
        consulta=Sesion.createQuery("from Banco as b");
        milista=consulta.list();
        Sesion.getTransaction().commit();
    }//GEN-LAST:event_formWindowOpened

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
                                                                      //BOTON SIGUIENTE
        if(milista.isEmpty()==false){  //si no esta vacia la lista, es decir si hay algun registro en la tabla
            if(jTextField1.getText().isEmpty())
                contador=1;
            else{
                if (contador!=milista.size())  //si no se llego al final
                    contador++;
            }
            ban=(Banco) (milista.get(contador-1));
            jTextField1.setText(Integer.toString(ban.getIdbanco()));
            jTextField1.requestFocus();
            jTextField1.transferFocus();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
                                                                         //BOTON ANTERIOR
        if(milista.isEmpty()==false){  //si no esta vacia la lista, es decir si hay algun registro en la tabla
            if(jTextField1.getText().isEmpty())
                contador=1;
            else{
                if (contador!=1)  //si no se llego al final
                    contador--;
            }
            ban=(Banco) (milista.get(contador-1));
            jTextField1.setText(Integer.toString(ban.getIdbanco()));
            jTextField1.requestFocus();
            jTextField1.transferFocus();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                                                                       //BOTON PRIMERO
        if(milista.isEmpty()==false){  //si no esta vacia la lista, es decir si hay algun registro en la tabla
            contador=1;
            ban=(Banco) (milista.get(contador-1));
            jTextField1.setText(Integer.toString(ban.getIdbanco()));
            jTextField1.requestFocus();
            jTextField1.transferFocus();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
                                                                        //BOTON ULTIMO
        if(milista.isEmpty()==false){  //si no esta vacia la lista, es decir si hay algun registro en la tabla
            contador=milista.size();
            ban=(Banco) (milista.get(contador-1));
            jTextField1.setText(Integer.toString(ban.getIdbanco()));
            jTextField1.requestFocus();
            jTextField1.transferFocus();
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
                                                                    //para validar el CAMPO DE TEXTO ID/CODIGO
        boolean esint=Character.isDigit(evt.getKeyChar());   //tira true si el boton presionado es un digito
        if(esint==false){      //si no se ingresa un digito
            if(((int)evt.getKeyChar()) == 10) //si se presiono enter
                //evt.setKeyChar((char)119);
                jTextField1.transferFocus();
            else
                evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
      //NADA
    }//GEN-LAST:event_jTextField1KeyReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmBanco dialog = new FrmBanco(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
