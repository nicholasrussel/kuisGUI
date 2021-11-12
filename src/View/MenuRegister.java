// Java program to implement
// a Simple Registration Form
// using Java Swing
package view;

import Controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Properties;
import model.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class MenuRegister {

    private JFrame f, f2;
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
        email.setLocation(100, 250);
        f.add(email);

        tEmail = new JTextField("Gender");
        tEmail.setFont(new Font("Arial", Font.PLAIN, 15));
        tEmail.setSize(300, 20);
        tEmail.setLocation(100, 250);
        f.add(tEmail);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(300, 20);
        name.setLocation(100, 100);
        f.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(200, 20);
        tname.setLocation(200, 100);
        f.add(tname);

        category = new JLabel("Category");
        category.setFont(new Font("Arial", Font.PLAIN, 15));
        category.setSize(300, 20);
        category.setLocation(100, 250);
        f.add(category);

        ArrayList<Model.CategoryUser> kategori = Controller.getAllCategory();
        for (int i = 0; i < kategori.size(); i++) {
            country[i] = kategori.get(i).getName();
        }

        comboBoxKategory = new JComboBox(country);
        comboBoxKategory.setBounds(50, 50, 90, 20);
        f.add(comboBoxKategory);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);

        password = new JLabel("Password");
        password.setFont(new Font("Arial", Font.PLAIN, 15));
        password.setSize(300, 20);
        password.setLocation(100, 450);
        f.add(password);

        tpassword = new JPasswordField();
        tpassword.setFont(new Font("Arial", Font.PLAIN, 15));
        tpassword.setSize(200, 20);
        tpassword.setLocation(200, 450);
        f.add(tpassword);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(100, 600);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f2 = new JFrame();
                f2.setSize(800, 800);
                f2.setResizable(false);
                f2.setLayout(null);
                String email = tEmail.getText();
                String cekNama = tname.getText();
                String cekPassword = String.valueOf(tpassword.getPassword());
                int cekKategori = (int) comboBoxKategory.getItemAt(comboBoxKategory.getSelectedIndex());

                title = new JLabel("Confirmation");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(300, 30);
                title.setLocation(300, 30);
                f2.add(title);

                Controller c = new Controller();
                String hashedPass = c.getMD5(String.valueOf(cekPassword));
                String subHashedPass = hashedPass.substring(0, 32);
                User newPerson = new User();
                newPerson.setName(cekNama);
                newPerson.setEmail(email);
                newPerson.setCategory(cekKategori);
                newPerson.setPassword(subHashedPass);
                boolean status = c.insertNewUser(newPerson);
                if (status) {
                    JOptionPane.showMessageDialog(null, "isi data berhasil");
                    f2.setVisible(false);
                    new MainMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "isi data gagal");
                    f2.setVisible(false);
                    new MainMenu();
                }

                cancel2 = new JButton("Cancel");
                cancel2.setFont(new Font("Arial", Font.PLAIN, 15));
                cancel2.setSize(100, 20);
                cancel2.setLocation(250, 600);
                cancel2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f2.setVisible(false);
                        f.setVisible(true);
                    }
                });
                f2.add(cancel2);
                f2.setVisible(true);
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
