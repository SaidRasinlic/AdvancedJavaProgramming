package guiandtables;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class SimpleTablePanel extends JPanel {
    
    

    static final String[] COLUMN_NAMES = {"First name", "Last name", "Sport", "# of Years", "Vegetarian"};
    static final Object[][] ROW_DATA = {
        {"Kanita", "Muzaferija", "Snowboarding", 3, false},
        {"Ferida", "Bobar", "Skiing", 5, true},
        {"Rijad", "Rogo", "Walking", 25, false},
        {"Mirzad", "Sadović", "Swimming", 7, true},
        {"Fadil", "Turalić", "Tennis", 2, true}
    };

    public SimpleTablePanel() {
        super(new GridLayout(1, 0));
        /* Vector<String> vectorNames = bookColumnNames
                .stream()
                .collect(Collectors.toCollection(Vector::new));
        Vector<Book> vectorBooks = bookList
                .stream()
                .collect(Collectors.toCollection(Vector::new));
        JTable table1 = new JTable(vectorBooks, vectorNames);*/
        JTable table = new JTable(ROW_DATA, COLUMN_NAMES);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        MouseAdapter mouseAdapter = new TableMouseAdapter(table);
        table.addMouseListener(mouseAdapter);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    private class TableMouseAdapter extends MouseAdapter {

        private final JTable table;

        public TableMouseAdapter(JTable table) {
            this.table = table;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            int numRows = table.getRowCount();
            int numCols = table.getColumnCount();
            TableModel tableModel = table.getModel();
            System.out.println("Vrijednosti podataka u tabeli:");
            for (int rowNumber = 0; rowNumber < numRows; rowNumber++) {
                System.out.print(" red " + rowNumber + ":");
                for (int columnNumber = 0; columnNumber < numCols; columnNumber++) {
                    System.out.print(" " + tableModel.getValueAt(rowNumber, columnNumber));
                }
                System.out.println();
            }
            System.out.println("------------------------");
        }

    }
}
