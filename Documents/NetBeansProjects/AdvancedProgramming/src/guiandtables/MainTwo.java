package guiandtables;

import guiandtables.ComboBoxPartTwo;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainTwo extends JFrame {
    
    private JComponent component;
    
    
    private MainTwo(String title,JComponent component){
        super(title);
       this.component=component;
       
        
    }
    
  private void showFrame(){
      add(component);
      pack();
      setVisible(true);
      setLocationRelativeTo(null);
      
      
  } 
    
    
    public static void main(String[] args) {
        
        ComboBoxPartTwo partTwo = new ComboBoxPartTwo();
        MainTwo mainTwo = new MainTwo("ComboBoxPartTwo", partTwo);
        SwingUtilities.invokeLater(mainTwo::showFrame);
        
        
    }
}
