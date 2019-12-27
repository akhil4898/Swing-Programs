import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginForm extends WindowAdapter implements ActionListener {
    JLabel username, password, info;
    JTextField user;
    JPasswordField pass;
    JButton submit;
    JFrame f;

    LoginForm() {
        f = new JFrame("Login Form");
        f.setLayout(null);
        username = new JLabel("Username");
        password = new JLabel("Password");
        info = new JLabel();
        user = new JTextField();
        pass = new JPasswordField();
        pass.setEchoChar('*');
        submit = new JButton("Submit");
        // f.setLayout(null);
        f.add(username);
        f.add(password);
        f.add(info);
        f.add(user);
        f.add(pass);
        f.add(submit);
        submit.addActionListener(this);
        f.setSize(300, 210);
        username.setBounds(20, 20, 60, 30);
        user.setBounds(100, 20, 100, 30);
        password.setBounds(20, 60, 60, 30);
        pass.setBounds(100, 60, 100, 30);
        info.setBounds(60, 100, 300, 30);
        submit.setBounds(100, 140, 80, 30);
        f.addWindowListener(this);
        f.setVisible(true);
        // f.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String user_name = user.getText();
            String user_pass = pass.getText();
            if (e.getSource() == submit) {
                if (user_name.equals("Aditya") && user_pass.equals("12345")) {
                    info.setText("Your Password is correct");
                } else {
                    info.setText("Your Password is incorrect");
                }
            }
        } catch (Exception ex) {
            info.setText("Invalid Input");
        }
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String args[]) {
        new LoginForm();
    }
}   