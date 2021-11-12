// Java program to implement
// a Simple Registration Form
// using Java Swing
package view;

import Controller.DatabaseHandler;
import Controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Model.*;

public class MenuLogin extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title, email, message, pass;
    private JTextField inputEmail;
    private JPasswordField tpass;
    private JButton sub,cancel;
    static DatabaseHandler conn = new DatabaseHandler();

    public MenuLogin() {
        setTitle("Login Form");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Login Form");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(100, 80);
        title.setLocation(100, 30);
        c.add(title);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 15));
        email.setSize(100, 20);
        email.setLocation(100, 100);
        c.add(email);

        inputEmail = new JTextField();
        inputEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        inputEmail.setSize(190, 20);
        inputEmail.setLocation(100, 130);
        c.add(inputEmail);

        pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 15));
        pass.setSize(100, 20);
        pass.setLocation(100, 200);
        c.add(pass);

        tpass = new JPasswordField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(190, 20);
        tpass.setLocation(100, 230);
        c.add(tpass);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 30);
        sub.setLocation(150, 300);
        sub.addActionListener(this);
        c.add(sub);

        setVisible(true);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 15));
        cancel.setSize(100, 20);
        cancel.setLocation(300, 300);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setVisible(false);
                new MainMenu();
            }
        });
        c.add(cancel);
    }

    public void actionPerformed(ActionEvent event) {
        conn.connect();
        Controller c = new Controller();
        String userEmail =inputEmail.getText();
        String password = c.getMD5(String.valueOf(tpass.getPassword()));

        String olahPassword = password.substring(0, 32);

        User login = c.getUsers(userEmail);
        
        System.out.println(password);
        System.out.println(olahPassword);
        if (login != null) {
            if (olahPassword.equals(c.getSelectedPassword(userEmail))) {
                JOptionPane.showMessageDialog(rootPane, "Login Berhasil!");
                new MainMenu();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Password Salah");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Maaf, Username / Password salah!");

        }
    }
    
}



