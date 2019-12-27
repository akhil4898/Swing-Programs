import java.awt.*;
import java.awt.event.*;

class Additon implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1;
    Frame f1;

    Additon() {
        l1 = new Label("First Value : ");
        l2 = new Label("Second Value : ");
        l3 = new Label("Result : ");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        b1 = new Button("ADD");
        f1 = new Frame("Frame");
        f1.setLayout(null);
        f1.setSize(700, 600);
        l1.setBounds(20, 20, 100, 50);
        l2.setBounds(20, 80, 100, 50);
        l3.setBounds(20, 140, 100, 50);
        t1.setBounds(150, 20, 100, 50);
        t2.setBounds(150, 80, 100, 50);
        t3.setBounds(150, 140, 100, 50);
        b1.setBounds(50, 200, 100, 50);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);
        f1.add(b1);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        int c = 0;
        String s1 = t1.getText();
        String s2 = t2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if (event.getSource() == b1) {
            c = a + b;
        }
        String s3 = String.valueOf(c);
        t3.setText(s3);
    }

    public static void main(String[] args) {
        new Additon();
    }

}
