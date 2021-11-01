/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.EnumJabatan;
import model.Kasir;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Nicholas Russel
 */
public class MenuUpdateDataKasir {

    private JLabel title, id, name, mno, alamat, gaji;
    private JPasswordField tpassword;
    private JTextField tid, tname, tmno, tgaji;
    private JButton sub, reset, cancel;
    private JTextArea talamat;

    public MenuUpdateDataKasir() {
        JFrame f = new JFrame();
        f.setTitle("Update Kasir");
        f.setSize(800, 800);
        f.setResizable(false);
        f.setLayout(null);

        title = new JLabel("Update Kasir Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        f.add(title);

        id = new JLabel("ID");
        id.setFont(new Font("Arial", Font.PLAIN, 15));
        id.setSize(300, 20);
        id.setLocation(100, 100);
        f.add(id);

        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 15));
        tid.setSize(200, 20);
        tid.setLocation(200, 100);
        f.add(tid);

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

        mno = new JLabel("Nomor Telepon");
        mno.setFont(new Font("Arial", Font.PLAIN, 15));
        mno.setSize(300, 20);
        mno.setLocation(100, 200);
        f.add(mno);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(200, 20);
        tmno.setLocation(200, 200);
        f.add(tmno);

        gaji = new JLabel("Gaji");
        gaji.setFont(new Font("Arial", Font.PLAIN, 15));
        gaji.setSize(300, 20);
        gaji.setLocation(100, 250);
        f.add(gaji);

        tgaji = new JTextField();
        tgaji.setFont(new Font("Arial", Font.PLAIN, 15));
        tgaji.setSize(200, 20);
        tgaji.setLocation(200, 250);
        f.add(tgaji);

        alamat = new JLabel("Alamat");
        alamat.setFont(new Font("Arial", Font.PLAIN, 15));
        alamat.setSize(300, 20);
        alamat.setLocation(100, 300);
        f.add(alamat);

        talamat = new JTextArea();
        talamat.setFont(new Font("Arial", Font.PLAIN, 15));
        talamat.setSize(200, 75);
        talamat.setLocation(200, 300);
        talamat.setLineWrap(true);
        f.add(talamat);

        sub = new JButton("Update");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(100, 400);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                JFrame f2 = new JFrame();
                f2.setTitle("Check Again");
                f2.setSize(800, 800);
                f2.setResizable(false);
                f2.setLayout(null);

                JLabel id, nama, mno, alamat, gaji;
                JButton insert,cancel;
                int cekID = Integer.parseInt(tid.getText());
                int cekGaji = Integer.parseInt(tgaji.getText());
                String cekNama = tname.getText();
                String cekmno = tmno.getText();
                String cekAlamat = talamat.getText();

                id = new JLabel("ID : " + cekID);
                id.setFont(new Font("Arial", Font.PLAIN, 20));
                id.setSize(300, 20);
                id.setLocation(100, 100);
                f2.add(id);

                nama = new JLabel("Nama : " + cekNama);
                nama.setFont(new Font("Arial", Font.PLAIN, 20));
                nama.setSize(300, 20);
                nama.setLocation(100, 150);
                f2.add(nama);

                mno = new JLabel("Nomor Telepon : " + cekmno);
                mno.setFont(new Font("Arial", Font.PLAIN, 20));
                mno.setSize(300, 20);
                mno.setLocation(100, 200);
                f2.add(mno);

                alamat = new JLabel("Alamat : " + cekAlamat);
                alamat.setFont(new Font("Arial", Font.PLAIN, 20));
                alamat.setSize(300, 20);
                alamat.setLocation(100, 250);
                f2.add(alamat);

                gaji = new JLabel("Gaji : " + cekGaji);
                gaji.setFont(new Font("Arial", Font.PLAIN, 20));
                gaji.setSize(300, 20);
                gaji.setLocation(100, 300);
                f2.add(gaji);
                
                cancel = new JButton("Cancel");
                cancel.setFont(new Font("Arial", Font.PLAIN, 15));
                cancel.setSize(100, 20);
                cancel.setLocation(400, 350);
                cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f2.setVisible(false);
                        f.setVisible(true);
                    }
                });
                f2.add(cancel);
                
                insert = new JButton("Insert");
                insert.setFont(new Font("Arial", Font.PLAIN, 15));
                insert.setSize(100, 20);
                insert.setLocation(100, 350);
                insert.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        f.setVisible(false);
                        JFrame konfirmasiUpdate = new JFrame("Confirmation");
                        JFrame updateLagi = new JFrame("Another Update?");
                        Controller c = new Controller();


                        if (JOptionPane.showConfirmDialog(konfirmasiUpdate, "confirm if you Want to Update", "Minimarket",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            f2.setVisible(false);
                            boolean status = c.updateKasir(cekID,cekNama,cekAlamat,cekmno,cekGaji);
                            if (status) {
                                JOptionPane.showMessageDialog(null, "update berhasil");
                                if (JOptionPane.showConfirmDialog(updateLagi, "Update lagi?", "Minimarket",
                                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                    f.setVisible(true);
                                } else {
                                    new MainMenuAdmin();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "update gagal");
                                new MainMenuAdmin();
                            }
                        } else {
                            f2.setVisible(false);
                            JOptionPane.showMessageDialog(null, "update batal");
                            new MainMenuAdmin();
                        }
                    }
                });
                f2.add(insert);
                
                f2.setVisible(true);
            }
        });
        f.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(250, 400);
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String def = "";
                tid.setText(def);
                tname.setText(def);
                tmno.setText(def);
                talamat.setText(def);
                tgaji.setText(def);
            }
        });
        f.add(reset);
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 15));
        cancel.setSize(100, 20);
        cancel.setLocation(400, 400);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new MainMenuAdmin();
            }
        });
        f.add(cancel);
        f.setVisible(true);
    }
}
