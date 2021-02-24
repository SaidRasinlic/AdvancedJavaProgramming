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

public class ComboBoxWithPicture extends JPanel {

//JFrame,JPanel,Kontrole,Layout Manager
    private ImageIcon[] images;
    private String[] petNames = {"Lion125", "Tiger125", "Wolf125", "Elephant125", "Giraffe125"};

    public ComboBoxWithPicture() {
        super(new BorderLayout());

        images = new ImageIcon[petNames.length];
        Integer[] intArray = new Integer[petNames.length];

        for (int i = 0; i < petNames.length; i++) {
            images[i] = createImage(petNames[i]);
            intArray[i] = i;
        }

        JComboBox<Integer> combo = new JComboBox<>(intArray);
        ComboBoxRenderer renderer = new ComboBoxRenderer();
        renderer.setPreferredSize(new Dimension(350, 125));
        combo.setRenderer(renderer);
        add(combo, BorderLayout.PAGE_START);
        renderer.setOpaque(true);

    }

    public ImageIcon createImage(String imageName) {
        String fileName = imageName + ".jpg";
        URL imageURL = ComboBoxWithPicture.class.getResource(fileName);
        System.out.println(imageURL);
        if (imageURL != null) {
            return new ImageIcon(imageURL);
        } else {
            System.out.printf("Neispravan URL, nemoguce pronaci vasu sliku:,%s%n", fileName);

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

            ImageIcon image = images[value];
            String text = petNames[value];
            if (image != null) {

                setIcon(image);
                setText(text);

            } else {
                setText("Slika ne postoji");
            }
            return this;
        }

    }
}
