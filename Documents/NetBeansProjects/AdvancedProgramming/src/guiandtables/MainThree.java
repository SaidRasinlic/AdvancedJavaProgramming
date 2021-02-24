package guiandtables;

import guiandtables.ComboBoxPicBro;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainThree extends JFrame{

    private JComponent component;
    
    public MainThree(String title, JComponent component){
        super(title);
        this.component=component;
        
        
    }
    
    private void showFrame(){
        
        add(component);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) {
        
        
        
        ComboBoxPicBro picBro = new ComboBoxPicBro();
        
        
        MainThree mainThree = new MainThree("Third ComboBox", picBro);
        
        SwingUtilities.invokeLater(mainThree::showFrame);
        
        
        
    }
    
    
    
    
}
