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

public class ComboBoxPicBro extends JPanel {

    private ImageIcon[] slike;
    private String[] imeZivotinja = {"Tiger125", "Elephant125", "Lion125", "Wolf125", "Giraffe125"};

    public ComboBoxPicBro() {

        super(new BorderLayout());

        slike = new ImageIcon[imeZivotinja.length];
        Integer[] intArray = new Integer[imeZivotinja.length];

        for (int i = 0; i < imeZivotinja.length; i++) {
            intArray[i] = i;

            slike[i] = createIcon(imeZivotinja[i]);

        }

        JComboBox<Integer> comboBox = new JComboBox<>(intArray);
        ComboBoxRenderer renderer = new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(300, 125));
        comboBox.setRenderer(renderer);
        add(comboBox,BorderLayout.PAGE_START);
        setOpaque(true);
        
        
        
    }

    public ImageIcon createIcon(String imageName) {

        String fileName = imageName + ".jpg";

        URL imageURL = ComboBoxPicBro.class.getResource(fileName);
        System.out.println(imageURL);
        if (imageURL != null) {
            return new ImageIcon(imageURL);

        } else {

            System.out.printf("Nemoguce pronaci vasu sliku,'%s''%n'", fileName);
        }
        return null;

    }

    private class ComboBoxRenderer extends JLabel implements ListCellRenderer<Integer> {

        @Override
        public Component getListCellRendererComponent(JList<? extends Integer> list, Integer value, int index, boolean isSelected, boolean cellHasFocus) {

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());

            } else {

                setBackground(list.getBackground());
                setForeground(list.getForeground());

            }

            ImageIcon image = slike[value];
            String imena = imeZivotinja[value];

            if (image != null) {
                setIcon(image);
                setText(imena);

            } else {
                System.out.println("Slika ne postoji");
            }

            return this;

        }

    }
}
