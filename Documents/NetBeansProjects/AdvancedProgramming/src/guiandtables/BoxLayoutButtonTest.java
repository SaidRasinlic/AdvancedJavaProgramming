package guiandtables;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class BoxLayoutButtonTest extends JPanel implements ActionListener {

    private final JLabel label;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;

    public BoxLayoutButtonTest() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        label = new JLabel("Press the button");
        button1 = new JButton("SAID");
        button2 = new JButton("Button II");
        button3 = new JButton("Button 3");
        button3.addActionListener(this);
        button1.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button1);
        panel.add(button3);
        add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("SAID")){
        System.out.println("You clicked \"BUTTON I\" ");
        }
        
        if(e.getSource().equals(button3)){
            System.out.println("You clicked \"BUTTON III\"");
        }
    }

    private static void createAndShowGUI() {
        //1. PROZOR ili JFRAME
        JFrame frame = new JFrame("Combo box editabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //2. kreirati kontrole i pobacati kako nam kaže neki manager LayoutManager
        JComponent boxLayout = new BoxLayoutButtonTest();
        boxLayout.setOpaque(true);
        frame.setContentPane(boxLayout);

        //3. prikazati prozor
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

}
