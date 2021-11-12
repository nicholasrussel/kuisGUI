// Java program to implement
// a Simple Registration Form
// using Java Swing
package view;

import Controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Properties;
import model.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class MenuRegister {

    private JFrame f, f2;
    private JLabel title, name, email, category,password;
    private JPasswordField tpassword;
    private JTextField tname, tEmail;
    private JRadioButton male, female;
    private JButton sub, reset, cancel, cancel2;

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

        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
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
                f2.setTitle("Check Again");
                f2.setSize(800, 800);
                f2.setResizable(false);
                f2.setLayout(null);
                JLabel nama, mno, jabatan, tempatTanggalLahir, alamat, gender, password, gaji, warning;
                JPasswordField pass;
                JButton insert;
                int cekGaji = Integer.parseInt(tgaji.getText());
                String cekNama = tname.getText();
                String cekPassword = String.valueOf(tpassword.getPassword());

                if (male.isSelected()) {
                    cekGender = male.getText();
                } else if (female.isSelected()) {
                    cekGender = female.getText();
                }

                title = new JLabel("Confirmation");
                title.setFont(new Font("Arial", Font.PLAIN, 30));
                title.setSize(300, 30);
                title.setLocation(300, 30);
                f2.add(title);

                nama = new JLabel("Nama : " + cekNama);
                nama.setFont(new Font("Arial", Font.PLAIN, 20));
                nama.setSize(300, 20);
                nama.setLocation(100, 100);
                f2.add(nama);

                mno = new JLabel("Nomor Telepon : " + cekmno);
                mno.setFont(new Font("Arial", Font.PLAIN, 20));
                mno.setSize(300, 20);
                mno.setLocation(100, 150);
                f2.add(mno);

                jabatan = new JLabel("Jabatan : " + cekJabatan);
                jabatan.setFont(new Font("Arial", Font.PLAIN, 20));
                jabatan.setSize(300, 20);
                jabatan.setLocation(100, 200);
                f2.add(jabatan);

                tempatTanggalLahir = new JLabel("TTL : " + TTL);
                tempatTanggalLahir.setFont(new Font("Arial", Font.PLAIN, 20));
                tempatTanggalLahir.setSize(300, 20);
                tempatTanggalLahir.setLocation(100, 250);
                f2.add(tempatTanggalLahir);

                alamat = new JLabel("Alamat : " + cekAlamat);
                alamat.setFont(new Font("Arial", Font.PLAIN, 20));
                alamat.setSize(300, 20);
                alamat.setLocation(100, 300);
                f2.add(alamat);

                gender = new JLabel("Gender : " + cekGender);
                gender.setFont(new Font("Arial", Font.PLAIN, 20));
                gender.setSize(300, 20);
                gender.setLocation(100, 350);
                f2.add(gender);

                gaji = new JLabel("Gaji : " + cekGaji);
                gaji.setFont(new Font("Arial", Font.PLAIN, 20));
                gaji.setSize(300, 20);
                gaji.setLocation(100, 400);
                f2.add(gaji);

                password = new JLabel("Retype Password : ");
                password.setFont(new Font("Arial", Font.PLAIN, 20));
                password.setSize(200, 20);
                password.setLocation(100, 450);
                f2.add(password);

                pass = new JPasswordField();
                pass.setSize(300, 20);
                pass.setLocation(100, 500);
                f2.add(pass);

                String kirimGender = cekGender;

                warning = new JLabel("");
                warning.setFont(new Font("Arial", Font.PLAIN, 15));
                warning.setSize(300, 20);
                warning.setLocation(100, 500);
                f2.add(warning);

                insert = new JButton("Insert");
                insert.setFont(new Font("Arial", Font.PLAIN, 15));
                insert.setSize(100, 20);
                insert.setLocation(100, 600);
                insert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String cekpass = String.valueOf(pass.getPassword());
                        f.setVisible(false);

                        if (cekpass.equals(cekPassword)) {
                            warning.setText("Registration complete");
                            Controller c = new Controller();
                            String hashedPass = c.getMD5(String.valueOf(pass.getPassword()));
                            String subHashedPass = hashedPass.substring(0, 30);
                            Kasir newPerson = new Kasir();
                            newPerson.setName(cekNama);
                            newPerson.setAlamat(cekAlamat);
                            newPerson.setGender(kirimGender);
                            newPerson.setJabatan(j);
                            newPerson.setNomorTelepon(cekmno);
                            newPerson.setTtl(TTL);
                            newPerson.setPassword(subHashedPass);
                            newPerson.setGaji(cekGaji);
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
                        } else {
                            warning.setText("Password harus sesuai!");
                        }

                    }
                });
                f2.add(insert);

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

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(250, 600);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String def = "";
                tname.setText(def);
                tjabatan.setText(def);
                tmno.setText(def);
                talamat.setText(def);
                tgaji.setText(def);
                ttempatLahir.setText(def);
                tpassword.setText(def);
            }
        });
        f.add(reset);
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
