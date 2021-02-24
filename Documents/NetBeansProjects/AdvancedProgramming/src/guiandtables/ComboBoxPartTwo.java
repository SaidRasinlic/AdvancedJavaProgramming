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

public class ComboBoxPartTwo extends JPanel {

    private final ImageIcon[] images;
    private final String[] nameOfPets = {"Lion125", "Wolf125", "Giraffe125", "Tiger125", "Elephant125"};

    public ComboBoxPartTwo() {
        super(new BorderLayout());

        images = new ImageIcon[nameOfPets.length];
        Integer[] array = new Integer[nameOfPets.length];

        for (int i = 0; i < nameOfPets.length; i++) {

            array[i] = i;

            images[i] = createImage(nameOfPets[i]);

            JComboBox<Integer> comboBox = new JComboBox<>(array);

            ComboBoxRenderer renderer = new ComboBoxRenderer();
            renderer.setPreferredSize(new Dimension(300, 125));
            comboBox.setRenderer(renderer);
            add(comboBox, BorderLayout.PAGE_START);
            renderer.setOpaque(true);

        }

    }

    public ImageIcon createImage(String imageName) {
        String fileName = imageName + ".jpg";
        URL imageURL = ComboBoxPartTwo.class.getResource(fileName);
        System.out.println(imageURL);
        if (imageURL != null) {
            return new ImageIcon(imageURL);

        } else {
            System.out.printf("Vasa slika ne postoji,'%s''%n'", fileName);
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
            String petName = nameOfPets[value];
            if (image != null) {
                setIcon(image);
                setText(petName);
            } else {

                setText("Slika ne postoji");
            }
            return this;

        }

    }
}
