// Java program to implement
// a Simple Registration Form
// using Java Swing
package view;

import Controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import Model.User;


public class MenuRegister {

    private JFrame f;
    private JLabel title, name, email, category, password;
    private JPasswordField tpassword;
    private JTextField tname, tEmail;
    private JRadioButton male, female;
    private JButton sub, reset, cancel, cancel2;
    private JComboBox comboBoxKategory;
    private String country[] = new String[3];

    public MenuRegister() {
        f = new JFrame();
        f.setTitle("Registration");
        f.setSize(800, 800);
        f.setResizable(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        f.add(title);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 15));
        email.setSize(300, 20);
        email.setLocation(100, 100);
        f.add(email);

        tEmail = new JTextField();
        tEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        tEmail.setSize(300, 20);
        tEmail.setLocation(200, 100);
        f.add(tEmail);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(300, 20);
        name.setLocation(100, 150);
        f.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(200, 20);
        tname.setLocation(200, 150);
        f.add(tname);

        category = new JLabel("Category");
        category.setFont(new Font("Arial", Font.PLAIN, 15));
        category.setSize(300, 20);
        category.setLocation(100, 250);
        f.add(category);

        ArrayList<Model.CategoryUser> kategori = Controller.getAllCategory();
        for (int i = 1; i <= kategori.size(); i++) {
            country[i] = kategori.get(i).getName();
        }

        comboBoxKategory = new JComboBox(country);
        f.add(comboBoxKategory);
        comboBoxKategory.setSize(100, 20);
        comboBoxKategory.setLocation(200,250);


        password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setSize(300, 20);
        password.setLocation(100, 350);
        f.add(password);

        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(200, 20);
        tpassword.setLocation(200, 350);
        f.add(tpassword);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(100, 600);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                String email = tEmail.getText();
                String cekNama = tname.getText();
                String cekPassword = String.valueOf(tpassword.getPassword());
                int cekKategori = (int) comboBoxKategory.getSelectedIndex();
                
                System.out.println(cekKategori);

                Controller c = new Controller();
                String hashedPass = c.getMD5(String.valueOf(cekPassword));
                String subHashedPass = hashedPass.substring(0, 32);
                User newPerson = new User();
                newPerson.setName(cekNama);
                newPerson.setEmail(email);
                newPerson.setIdCategory(cekKategori);
                newPerson.setPassword(subHashedPass);
                boolean status = c.insertNewUser(newPerson);
                if (status) {
                    JOptionPane.showMessageDialog(null, "isi data berhasil");
                    new MainMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "isi data gagal");
                    new MainMenu();
                }
            }
        });
        f.add(sub);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 15));
        cancel.setSize(100, 20);
        cancel.setLocation(400, 600);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new MainMenu();
            }
        });
        f.add(cancel);
        f.setVisible(true);
    }

}
