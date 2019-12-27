import javax.swing.*;

class Image extends ImageIcon{
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Display an Image");
        JLabel b1 = new JLabel(new ImageIcon("/home/akhil/Pictures/bhaiya.jpeg"));
        f1.setLayout(null);
        b1.setBounds(10, 10, 80, 20);
        f1.setSize(500, 600);
        f1.add(b1);
        f1.setVisible(true);
    }
}   