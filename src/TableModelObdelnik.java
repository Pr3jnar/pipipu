import javax.swing.table.AbstractTableModel;
import java.awt.*;


public class TableModelObdelnik extends AbstractTableModel {
    private static final int COLUMN_COUNT = 6;

    private Obrazek obrazek;


    public TableModelObdelnik(Obrazek obrazek) {
        this.obrazek = obrazek;

    }

    @Override
    public int getRowCount() {
        return COLUMN_COUNT;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if (columnIndex==0){
            switch (rowIndex){
            case 0:
                return "poziceX";
            case 1:
                return "poziceY";
            case 2:
                return "sirka";
            case 3:
                return "vyska";
            case 4:
                return "barva";
            case 5:
                return "tloustka";
            default:
                return null;
        }}
        if (columnIndex==1){
            MujTvar tvar = obrazek.getTvars().get(0);//nulu upravit zatím to díky této nule bere pouze první prvek v listu tvars

            switch (rowIndex){
            case 0:
                 if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getPoziceX();}

            case 1:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getPoziceY();}

            case 2:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getSirka();}
            case 3:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getVyska();}
            case 4:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getBarva();}

            case 5:
                if (tvar instanceof Obdelnik) {
                    return ((Obdelnik) tvar).getTlouska();}

            default:
                return null;}
        }



    return null;}
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Make cells editable only in specific columns (e.g., column 0)
        return columnIndex == 1;
    }
}
