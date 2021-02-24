package guiandtables;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass extends JFrame {

    private final JComponent component;

    public MainClass(String title, JComponent component) {
        super(title);
        this.component = component;
    
    }

    public void showFrame() {
        add(component);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
         
    }
    
    
    public static void main(String[] args) {

     //   JButton button = new JButton("Ja sam u MainFrame");

        ComboBoxWithPicture comboBoxWithPic = new ComboBoxWithPicture();

        MainClass mainClass = new MainClass("Combo box with picture", comboBoxWithPic);

        SwingUtilities.invokeLater(mainClass::showFrame);
       
             String europeanDatePattern = "MMM d,yyyy";
DateTimeFormatter europeanDateFormatter = DateTimeFormatter.ofPattern(europeanDatePattern);
System.out.println(europeanDateFormatter.format(LocalDate.of(2016, 7, 31)));

    }

}
