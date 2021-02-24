package guiandtables;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class ComboBoxRepeat extends JPanel {
    
    private ImageIcon [] images;
    private String [] petNames = {"Lion125","Tiger125","Elephant125","Wolf125","Giraffe125"};
    
    
    public ComboBoxRepeat(){
        super(new BorderLayout());
    images = new ImageIcon[petNames.length];
    Integer [] arrayInt = new Integer[petNames.length];
        
        for(int i=0;i<petNames.length;i++){
            
            arrayInt[i]=i;
            images[i] = createImageIcon(petNames[i]);
            
            JComboBox<Integer> comboBox = new JComboBox<>(arrayInt);
            ComboBoxRenderer renderer = new ComboBoxRenderer();
            renderer.setPreferredSize(new Dimension(300, 125));
            add(comboBox,BorderLayout.PAGE_START);
            comboBox.setRenderer(renderer);
            setOpaque(true);
            
               
            
            
            
        }
        
        
    }
    
    
    private ImageIcon createImageIcon (String imageName){
        String fileName = imageName + ".jpg";
        
       URL imageURL = ComboBoxRepeat.class.getResource(fileName);
        System.out.println(imageURL);
         if(imageURL !=null){
             return new ImageIcon(imageURL);
         }else{
             System.out.printf("Vasa slika '%s' ne postoji",fileName);
                        return null;
             
         }      
     
    }
    
    
    
    private class ComboBoxRenderer extends JLabel implements ListCellRenderer<Integer>{

        @Override
        public Component getListCellRendererComponent(JList<? extends Integer> list, Integer value, int index, boolean isSelected, boolean cellHasFocus) {
           if(isSelected){
               
               setBackground(list.getSelectionBackground());
               setForeground(list.getSelectionForeground());
               
           }else{
               setBackground(getBackground());  
               setForeground(getForeground());
               
           }
   
        
        
        ImageIcon image = images[value];
        String names = petNames[value];
        if(image != null){
            setIcon(image);
            setText(names);
            
        }else{
            System.out.println("Nemoguce pronaci sliku");
        }
            return this;
        }
          
        
    }
    

}
