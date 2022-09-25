package Soporte;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MiDefaultTableCellRenderer  extends DefaultTableCellRenderer{
   @Override
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
     super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
     //String s =  table.getModel().getValueAt(row, column ).toString();
     Object o =  table.getModel().getValueAt(row, column );  //podria dejar como el de arriba, pero si la tabla no tiene contenido en esa celda al hacer toString tira nullpointer xq es null el contenido
     if(o!=null){ //si tiene contenido
         String s=o.toString();  //s es el texto de la celda
         if(s.equals("sáb")||s.equals("dom")||s.equals("lun")||s.equals("mar")||s.equals("mié")||s.equals("jue")||s.equals("vie")||column==0){
             this.setearTitulo();
           //  System.out.println("titulo");
         }else{
             this.setearOcupado();
           //  System.out.println("ocupado");
         }
      }else{
            this.setearLibre();
          //  System.out.println("libre");
       }
      return this;
   }
   public void setearTitulo(){  //si el texto es un dia de la semana
        this.setOpaque(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.setForeground(Color.BLACK);
   }
   public void setearLibre(){ //se considera libre si no tiene nada escrito
       this.setOpaque(true);
       this.setBackground(Color.WHITE);
       this.setForeground(Color.BLACK);
   }
   public void setearOcupado(){  //es ocupado si no tiene nada escrito y si no es un dia de la semana
       this.setOpaque(true);
       this.setBackground(Color.RED);
       this.setForeground(Color.WHITE);
   }
}

