import Hiber1.Cliente;
import Hiber1.Habitacion;
import Hiber1.NewHibernateUtil;
import Hiber1.Ocupaciones;
import Hiber1.Subtipo;
import Soporte.GrupoReservas;
import Soporte.MiDefaultTableCellRenderer;
import Soporte.MiDefaultTableModel;
import Soporte.clasesutiles;
import imp.HabitacionGest;
import java.awt.Frame;
import java.awt.Point;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Claus
 */
public class FrmSeleccionHabitaciones extends javax.swing.JDialog {
    public FrmSeleccionHabitaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public FrmSeleccionHabitaciones(java.awt.Frame parent, boolean modal, List<GrupoReservas> gr) {
        super(parent, modal);
        this._gruposReservas=gr;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jButton1)
                .addContainerGap(529, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Session _sesion=null;
    private String _nombreClienteAMostrar="Cliente Actual";
    private clasesutiles cluti=new clasesutiles();
    private MiDefaultTableModel _modelo = new MiDefaultTableModel();
    private static int DIAS_RETRASO=5;
    private static int DIAS_EN_TABLA=30;
    private List<GrupoReservas>_gruposReservas=new ArrayList<GrupoReservas>();
    private List<Calendar>_listaDias=new ArrayList();
    private List<Habitacion> _listaHabitaciones=new ArrayList<Habitacion>();
    private Point puntoInicial=null;  //coordenadas x y del punto seleccionado en la tabla, correspondiente al dia de inicio
    private Point puntoFinal=null;    //coordenadas x y del punto seleccionado en la tabla, correspondiente al dia de fin
    private void CERRARSesion(){
        if(_sesion.isOpen()){
            _sesion.flush();
            _sesion.clear();
            _sesion.close();
        }
   }
    public Ocupaciones existeReservacionDeHabitacionEnFecha(int idHab, String fec){
        try{
            Query q=_sesion.createQuery("from Ocupaciones where idhabit = "+idHab+" and fecha = '"+fec+"'");
            if(!q.list().isEmpty()){  //si no se encontro
                return (Ocupaciones) q.uniqueResult();
            }else
                return null;
        }catch(Exception h){
            h.printStackTrace();
            return null;
        }
    }

    /*private void inicializarTabla() throws ParseException{   este codigo es para cargar a la lista de grupos todas las reservas que aparecen en la tabla
        Calendar cal=new GregorianCalendar();
        HabitacionGest habges=new HabitacionGest();
        Date hoy=new Date();
        cal.setTime(hoy);
        cal.add(Calendar.DAY_OF_MONTH, (DIAS_RETRASO * -1));
        Object[] obj=new Object[(DIAS_EN_TABLA+1)];
        obj[0]="Hab.";
        _modelo.addColumn(" ");
        _listaDias=new ArrayList();
        for(int i=0;i<DIAS_EN_TABLA;i++){
            Calendar cal2=(Calendar) cal.clone();
            _listaDias.add(cal2);
           //  System.out.println("dsds"+cluti.DateToStr(cal2.getTime(), "yyyy-MM-dd"));
            _modelo.addColumn(cluti.DateToStr(cal2.getTime(),"dd/MM"));
            obj[(i+1)]= cluti.DateToStr(cal2.getTime(), "E", new Locale("es", "ES"));
           // System.out.println(cluti.Date_StringDMA(cal.getTime()));
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
        _modelo.addRow(obj);
        //////////////carga las habitaciones////////////////////////////////////
        _listaHabitaciones=habges.ListaHabitaciones();
        boolean cambioDeGrupo=true;   // si es true, quiere decir que la reserva actual no es la misma a la del dia anterior y hay que crear un nuevo grupo en la lista
        Ocupaciones ocuAnt=null;
        Ocupaciones ocu=new Ocupaciones();
        GrupoReservas gruRes=null;
        boolean sinGuardar=false;   //si quedo un grupo sin guardar
        for (Habitacion hab:_listaHabitaciones){
            cambioDeGrupo=true;
            //System.out.println("hab"+hab.getIdhabit());
            obj=new Object[(DIAS_EN_TABLA+1)];
            obj[0]=hab.getIdhabit();
            //System.out.println(_listaDias.size()+"");
            for( int i=0;i<_listaDias.size();i++){
               // System.out.println("Hab="+hab.getIdhabit()+" vuelta i="+i+" fecha="+cluti.Date_StringDMA(_listaDias.get(i).getTime()));
                if(null==ocu){
                    ocuAnt=null;
                   // System.out.println("ocuAnt=null");
                }else{
                    if(0==ocu.getIdocup()){  //si
                    ocuAnt=null;
                   // System.out.println("ocuAnt=null");
                    }else{
                        ocuAnt=new Ocupaciones(ocu.getIdocup(), ocu.getSubtipo(), ocu.getEstado(), ocu.getHabitacion(), ocu.getReservacion(), ocu.getFecha());
          //              System.out.println("ocuAnt=ocupId="+ocuAnt.getIdocup()+" hab="+hab.getIdhabit()+" fecha="+cluti.Date_StringDMA(ocu.getFecha()));
                    }
                }
              //  if(i==7&&)
                Calendar ca=_listaDias.get(i);
                //System.out.println("ca="+cluti.DateToStr(ca.getTime(), "yyyy-MM-dd"));
               //   System.out.println("de lista="+cluti.DateToStr(_listaDias.get(i).getTime(), "yyyy-MM-dd"));
                ocu=existeReservacionDeHabitacionEnFecha(hab.getIdhabit(), cluti.DateToStr(ca.getTime(), "yyyy-MM-dd"));
                if(null==ocu){
                   // System.out.println("ocu no encontrada = null");
                    obj[i+1]=null;
                    if(null==ocuAnt){  //si hay 2 o mas no encontrados de seguido no hay cambio de grupo xq el grupo estara vacio
                        cambioDeGrupo=false;
                    }else{
                        cambioDeGrupo=true;
                    }
                //     System.out.println("cambioGrupo=true1");
                }else{
                  //   System.out.println("ocu encontrada");
                    if(null==ocuAnt){
                        cambioDeGrupo=false;
                 //       System.out.println("cambioGrupo=false1");
                    }else{
                        System.out.println("encontro "+cluti.Date_StringDMA(ocu.getFecha()));
                        if(ocuAnt.getReservacion().getIdres()==ocu.getReservacion().getIdres()){
                            cambioDeGrupo=false;
                   //         System.out.println("cambioGrupo=false2");
                        }else{
                            cambioDeGrupo=true;
                     //       System.out.println("cambioGrupo=true2");
                        }
                      //  ocuAnt=new Ocupaciones(ocu.getIdocup(), ocu.getSubtipo(), ocu.getEstado(), ocu.getHabitacion(), ocu.getReservacion(), ocu.getFecha());
                    }
                    obj[i+1]=ocu.getReservacion().getCliente().getNombre()+" "+ocu.getReservacion().getCliente().getApellido();
                }

                if(cambioDeGrupo){
                  // System.out.println("entro a cambio de grupo");
                    if(null!=gruRes){
                        gruRes.setFechaFin(ocuAnt.getFecha());
                        _gruposReservas.add(gruRes);
                      //  System.out.println("guardo de "+gruRes.getFechaInicio()+" hasta "+gruRes.getFechaFin());
                        sinGuardar=false;
                        gruRes=null;//para que el siguiente grupo se inicialice
                    }
                  //  gruRes=new GrupoReservas(ocuAnt.getFecha(), ocuAnt.getFecha(), ocuAnt.getReservacion(), false);
                }else{//si sigue de una reserva anterior
                    if(null!=ocu){
                        if(null==gruRes){
                            gruRes=new GrupoReservas(ocu.getFecha(), ocu.getFecha(), false);
                        }
                        sinGuardar=true;
                    }
                }
            }
            _modelo.addRow(obj);
        }
        if(sinGuardar==true && null!=gruRes){
            _gruposReservas.add(gruRes);
        }
        jTable1.setDefaultRenderer (Object.class, new MiDefaultTableCellRenderer());
        jTable1.setModel(_modelo);
        for(GrupoReservas gr:_gruposReservas){
            System.out.println("inicio="+cluti.Date_StringAMD(gr.getFechaInicio())+" fin="+cluti.Date_StringAMD(gr.getFechaFin()));
        }
    }
    */
    private void inicializarTabla() throws ParseException{
        Calendar cal=new GregorianCalendar();
        HabitacionGest habges=new HabitacionGest();
        Date hoy=new Date();
        cal.setTime(hoy);
        cal.add(Calendar.DAY_OF_MONTH, (DIAS_RETRASO * -1));
        Object[] obj=new Object[(DIAS_EN_TABLA+1)];
        obj[0]="Hab.";
        _modelo.addColumn(" ");
        _listaDias=new ArrayList();
        for(int i=0;i<DIAS_EN_TABLA;i++){
            Calendar cal2=(Calendar) cal.clone();
            _listaDias.add(cal2);
           //  System.out.println("dsds"+cluti.DateToStr(cal2.getTime(), "yyyy-MM-dd"));
            _modelo.addColumn(cluti.DateToStr(cal2.getTime(),"dd/MM"));
            obj[(i+1)]= cluti.DateToStr(cal2.getTime(), "E", new Locale("es", "ES"));
           // System.out.println(cluti.Date_StringDMA(cal.getTime()));
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
        _modelo.addRow(obj);
        //////////////carga las habitaciones////////////////////////////////////
        _listaHabitaciones=habges.ListaHabitaciones();
        Ocupaciones ocu=new Ocupaciones();
        for (Habitacion hab:_listaHabitaciones){
            obj=new Object[(DIAS_EN_TABLA+1)];
            obj[0]=hab.getIdhabit();
            for( int i=0;i<_listaDias.size();i++){
                Calendar ca=_listaDias.get(i);
                ocu=existeReservacionDeHabitacionEnFecha(hab.getIdhabit(), cluti.DateToStr(ca.getTime(), "yyyy-MM-dd"));
                if(null==ocu){
                    obj[i+1]=null;
                }else{
                    obj[i+1]=ocu.getReservacion().getCliente().getNombre()+" "+ocu.getReservacion().getCliente().getApellido();
                }
            }
            _modelo.addRow(obj);
        }
        jTable1.setDefaultRenderer (Object.class, new MiDefaultTableCellRenderer());
        jTable1.setModel(_modelo);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(_gruposReservas.size());
        for(GrupoReservas gru:_gruposReservas){
            System.out.println("Habitacion: "+gru.getIdHabitacion()+" del "+cluti.Date_StringDMA(gru.getFechaInicio())+" al "+cluti.Date_StringDMA(gru.getFechaFin()));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       _sesion=NewHibernateUtil.getSessionFactory().getCurrentSession();
       _sesion.getTransaction().begin();
      try{
           this._modelo = new MiDefaultTableModel();
           jTable1.setRowSelectionAllowed(true);
           jTable1.setColumnSelectionAllowed(true);
           jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           //jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           //jTable1.getColumnModel().getColumn(0).setWidth(250);

           inicializarTabla();
       }catch(Exception e){
        e.printStackTrace();
       }
       finally{
        _sesion.getTransaction().commit();
        this.CERRARSesion();
       }
    }//GEN-LAST:event_formWindowOpened
    public void marcacionInicio(String valor, int fila, int columna){
         jTable1.setValueAt(valor,fila,columna);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            boolean entra=false;
            Object ob=jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn());
            if(null==ob && (jTable1.getSelectedColumn()*jTable1.getSelectedRow())>0){  //si x e y son mayores a 0 y si esta libre en esa posicion
               entra=true;
            }else{
                if(ob.toString().equals("...")){
                    entra=true;
                }else{
                    if(null!=puntoInicial){
                        marcacionInicio(null,(int)puntoInicial.getY(), (int)puntoInicial.getX());
                        puntoInicial=null;
                    }
                }
            }
            if(entra){
               boolean agregado=false;  //si se agrego un grupo nuevo es para no setear a null la posicion actual en la tabla
               if(null==this.puntoInicial){
                    puntoInicial=new Point(jTable1.getSelectedColumn(), jTable1.getSelectedRow());
                    marcacionInicio("...",(int)puntoInicial.getY(), (int)puntoInicial.getX());
               }else{
                    puntoFinal=new Point(jTable1.getSelectedColumn(), jTable1.getSelectedRow());
                    if((int)puntoFinal.getY()==(int)puntoInicial.getY()){  //si el puntoFinal corresponde a la misma fila
                        if((int)puntoFinal.getX()>=(int)puntoInicial.getX()){  //si el puntoFinal corresponde a la misma fila
                            boolean libre=true;
                            for(int i=(int)puntoInicial.getX();i<=(int)puntoFinal.getX();i++){
                                ob=jTable1.getValueAt((int)puntoInicial.getY(), i);
                                if(null!=ob){
                                    if(!ob.toString().equals("...")){
                                        libre=false;
                                        break;
                                    }
                                }
                            }
                            if(libre){
                                int idhab=_listaHabitaciones.get((int)puntoInicial.getY()-1).getIdhabit();
                                int r=JOptionPane.showConfirmDialog(null,"Desea reservar la habitación Nº "+idhab+" entre las fechas "+cluti.Date_StringDMA(_listaDias.get((int)puntoInicial.getX()-1).getTime())+" y "+cluti.Date_StringDMA(_listaDias.get((int)puntoFinal.getX()-1).getTime())+"?","CONSULTA", JOptionPane.YES_NO_OPTION);
                                if (r==JOptionPane.YES_OPTION){ //si se presiono SI
                                  // System.out.println("inicio="+cluti.Da
                                    FrmAuxiliarSeleccionHabitaciones1 FrmAuxSele=new FrmAuxiliarSeleccionHabitaciones1((Frame)this.getParent(), true);
                                    FrmAuxSele.setVisible(true);
                                    Subtipo subTipo=FrmAuxSele.getSubTipo();
                                    if(null!=subTipo){
                                        GrupoReservas gr=new GrupoReservas(_listaDias.get((int)puntoInicial.getX()-1).getTime(),_listaDias.get((int)puntoFinal.getX()-1).getTime(),idhab,subTipo,0,false);   // el id de la subreserva es CERO cuando se carga desde la grilla y tiene el valor correcto cuando se lo trae de Reservas y ya tiene una Subreserva creada
                                        _gruposReservas.add(gr);
                                        for(int i=(int)puntoInicial.getX();i<=(int)puntoFinal.getX();i++){
                                            this.marcacionInicio(_nombreClienteAMostrar,(int)puntoInicial.getY(), i);
                                        }
                                        agregado=true;
                                        System.out.println("agregado");
                                    }
                                }
                            }else{
                               System.out.println("ocupado");
                            }
                        }else{
                             JOptionPane.showMessageDialog(null,"Favor seleccionar una fecha de fin igual o superior a la de inicio","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else{
                         JOptionPane.showMessageDialog(null,"Favor seleccionar una fecha de fin correspondiente a la misma habitación que la de inicio","ATENCIÓN",JOptionPane.INFORMATION_MESSAGE);
                    }
                    if(agregado==false){
                        marcacionInicio(null,(int)puntoInicial.getY(), (int)puntoInicial.getX());
                    }
                    puntoInicial=null;
               }
               if(puntoInicial==null){
                 System.out.println("Ini=null");
              }else{
                 System.out.println("IniX="+puntoInicial.getX());
                 System.out.println("IniY="+puntoInicial.getY());
              }
              if(puntoFinal==null){
                 System.out.println("Fin=null");
              }else{
                 System.out.println("FinX="+puntoFinal.getX());
                 System.out.println("FinY="+puntoFinal.getY());
              }
          }else{
              puntoInicial=null;
          }
    }//GEN-LAST:event_jTable1MouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmSeleccionHabitaciones dialog = new FrmSeleccionHabitaciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
