package guiandtables;

import guiandtables.ComboBoxRepeat;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainFraming extends JFrame {

    private final JComponent component;

    public MainFraming(String title, JComponent component) {
        super(title);
        this.component = component;

    }

    private void showFrame() {
        add(component);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {

        ComboBoxRepeat repeat = new ComboBoxRepeat();
        MainFraming main = new MainFraming("Combo repeat style", repeat);
        SwingUtilities.invokeLater(main::showFrame);

    }

}
