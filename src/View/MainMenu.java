/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.Controller;
import Model.User;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicholas Russel
 */
public class MainMenu extends JFrame {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JButton register, update, logout, login,lihatDataPengguna;
    ArrayList<User> users = Controller.getAllUsers();
    ArrayList<Integer> listCheckedUser = new ArrayList<>();

    public MainMenu() {

        setTitle("Main Menu");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Selamat Datang di Main Menu");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 30);
        title.setLocation(300, 30);
        c.add(title);

        register = new JButton("Register");
        register.setFont(new Font("Arial", Font.PLAIN, 15));
        register.setSize(300, 20);
        register.setLocation(10, 100);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuRegister();
            }
        });
        c.add(register);

        update = new JButton("Update");
        update.setFont(new Font("Arial", Font.PLAIN, 15));
        update.setSize(300, 20);
        update.setLocation(10, 150);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuUpdate();
            }
        });
        c.add(update);

        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.PLAIN, 15));
        login.setSize(300, 20);
        login.setLocation(10, 250);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuLogin();
            }
        });
        c.add(login);
        
        lihatDataPengguna = new JButton("Login");
        lihatDataPengguna.setFont(new Font("Arial", Font.PLAIN, 15));
        lihatDataPengguna.setSize(300, 20);
        lihatDataPengguna.setLocation(10, 250);
        lihatDataPengguna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuLihatDataPengguna();
            }
        });
        c.add(lihatDataPengguna);

        logout = new JButton("Log Out");
        logout.setFont(new Font("Arial", Font.PLAIN, 15));
        logout.setSize(300, 20);
        logout.setLocation(10, 300);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                JFrame Frame = new JFrame("Log Out");

                if (JOptionPane.showConfirmDialog(Frame, "Are you sure want to Log Out?", "Minimarket",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    new MenuLogin();
                } else {
                    setVisible(true);
                }
            }
        });
        c.add(logout);
        setVisible(true);

    }
}
