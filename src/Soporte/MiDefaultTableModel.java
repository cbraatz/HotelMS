package Soporte;

import javax.swing.table.DefaultTableModel;

public class MiDefaultTableModel extends DefaultTableModel {   //esta clase hace que ninguna columna de jtable sea editable
        int colu=-1;
        public MiDefaultTableModel() {
            super();
        }
        public MiDefaultTableModel(int co) {
            super();
            this.colu=co;
        }
      /*  public boolean isCellEditable(int row, int col) {
            return false;
        }*/
    @Override
        public boolean isCellEditable(int row, int column) {
        if (column==colu && colu>=0) {
            return true;  //La columna col es editable.
        }else
            return false;
    }
}
