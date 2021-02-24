package connectionpool;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

    private final JComponent component;

    public MainFrame(String title, JComponent component) {
        super(title);
        this.component = component;
    }

    public void showFrame() {
        add(component);
        setVisible(true);
        setLocationRelativeTo(null);
        pack();
    }

    public static void main(String[] args) {

        BankTablePanel bankTable = new BankTablePanel();
        MainFrame mainFrame = new MainFrame("Table Panel", bankTable);
        SwingUtilities.invokeLater(mainFrame::showFrame);

    }

}
