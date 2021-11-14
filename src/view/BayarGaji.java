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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Kehadiran;
import java.util.ArrayList;
import java.util.Properties;
import model.Kasir;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Nicholas Russel
 */
public class BayarGaji {

    private JFrame f, f2,fConfirmation;
    private JLabel title, id, nama, nomorTelp, gaji, periode, periode2;
    private JTextField tid;
    private JButton bayar, insert, cancel;
    private UtilDateModel model, model2;
    private Properties p, p2;
    private JDatePanelImpl datePanel, datePanel2;
    private JDatePickerImpl datePicker, datePicker2;

    public BayarGaji() {
        new LihatKehadiran(0);
        f = new JFrame();
        f.setTitle("Bayar Gaji Kasir");
        f.setSize(600, 600);
        f.setResizable(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);

        title = new JLabel("Bayar Gaji Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(50, 30);
        f.add(title);

        id = new JLabel("Id Person : ");
        id.setFont(new Font("Arial", Font.PLAIN, 15));
        id.setSize(300, 20);
        id.setLocation(50, 100);
        f.add(id);

        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 15));
        tid.setSize(200, 20);
        tid.setLocation(50, 150);
        f.add(tid);

        periode = new JLabel("Dari tanggal : ");
        periode.setFont(new Font("Arial", Font.PLAIN, 15));
        periode.setSize(300, 20);
        periode.setLocation(50, 200);
        f.add(periode);

        model = new UtilDateModel();
        p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new controller.DateFormatter());
        datePicker.setBounds(50, 250, 200, 50);
        f.add(datePicker);

        periode2 = new JLabel("Sampai tanggal : ");
        periode2.setFont(new Font("Arial", Font.PLAIN, 15));
        periode2.setSize(300, 20);
        periode2.setLocation(50, 300);
        f.add(periode2);

        model2 = new UtilDateModel();
        p2 = new Properties();
        p2.put("text.today", "Today");
        p2.put("text.month", "Month");
        p2.put("text.year", "Year");
        datePanel2 = new JDatePanelImpl(model2, p2);
        datePicker2 = new JDatePickerImpl(datePanel2, new controller.DateFormatter());
        datePicker2.setBounds(50, 350, 200, 50);
        f.add(datePicker2);

        insert = new JButton("Insert");
        insert.setFont(new Font("Arial", Font.PLAIN, 15));
        insert.setSize(100, 20);
        insert.setLocation(50, 450);
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                fConfirmation = new JFrame("Confirmation");
                Controller c = new Controller();
                f2 = new JFrame();
                f2.setTitle("Bayar Gaji Kasir");
                f2.setSize(400, 400);
                f2.setResizable(false);
                f2.setLayout(null);
                f2.setLocationRelativeTo(null);

                title = new JLabel("Confirmation Detail");
                title.setFont(new Font("Arial", Font.PLAIN, 20));
                title.setSize(300, 20);
                title.setLocation(50, 30);
                f2.add(title);

                int userID = Integer.parseInt(tid.getText());
                String hari = String.valueOf(datePicker.getModel().getDay());
                String bulan = String.valueOf(datePicker.getModel().getMonth() + 1);
                String tahun = String.valueOf(datePicker.getModel().getYear());
                String TTL = tahun + ":" + bulan + ":" + hari;

                String hari2 = String.valueOf(datePicker2.getModel().getDay());
                String bulan2 = String.valueOf(datePicker2.getModel().getMonth() + 1);
                String tahun2 = String.valueOf(datePicker2.getModel().getYear());
                String TTL2 = tahun2 + ":" + bulan2 + ":" + hari2;

                Kasir pegawaiYangDibayar = c.getKasir(userID);
                int hadir = c.getKehadiranKasir(userID, TTL, TTL2);
                String bun = String.valueOf(datePicker.getModel().getMonth());
                System.out.println(bun);
                System.out.println(TTL);
                System.out.println(TTL2);
                System.out.println(hadir);

                id = new JLabel("Id Person : " + pegawaiYangDibayar.getId_person());
                id.setFont(new Font("Arial", Font.PLAIN, 15));
                id.setSize(300, 20);
                id.setLocation(50, 100);
                f2.add(id);

                nama = new JLabel("Nama : " + pegawaiYangDibayar.getName());
                nama.setFont(new Font("Arial", Font.PLAIN, 15));
                nama.setSize(300, 20);
                nama.setLocation(50, 150);
                f2.add(nama);

                nomorTelp = new JLabel("Nomor Telepon: " + pegawaiYangDibayar.getNomorTelepon());
                nomorTelp.setFont(new Font("Arial", Font.PLAIN, 15));
                nomorTelp.setSize(300, 20);
                nomorTelp.setLocation(50, 200);
                f2.add(nomorTelp);

                gaji = new JLabel("Gaji: " + c.hitungGaji(pegawaiYangDibayar.getGaji(), hadir));
                gaji.setFont(new Font("Arial", Font.PLAIN, 15));
                gaji.setSize(300, 20);
                gaji.setLocation(50, 250);
                f2.add(gaji);

                bayar = new JButton("Bayar");
                bayar.setFont(new Font("Arial", Font.PLAIN, 15));
                bayar.setSize(100, 20);
                bayar.setLocation(50, 300);
                bayar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        if (JOptionPane.showConfirmDialog(fConfirmation, "confirm if the details correct", "Minimarket",
                                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                            f2.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Bayar Gaji berhasil");
                            new MainMenuAdmin();

                        } else {
                            f2.setVisible(false);
                            JOptionPane.showMessageDialog(null, "Bayar Gaji batal");
                            new MainMenuAdmin();
                        }
                    }
                });
                f2.add(bayar);

                cancel = new JButton("Cancel");
                cancel.setFont(new Font("Arial", Font.PLAIN, 15));
                cancel.setSize(100, 20);
                cancel.setLocation(160, 300);
                cancel.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        f.setVisible(false);
                        new MainMenuAdmin();
                    }
                });
                f2.add(cancel);
                f2.setVisible(true);
            }
        });
        f.add(insert);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 15));
        cancel.setSize(100, 20);
        cancel.setLocation(200, 450);
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
