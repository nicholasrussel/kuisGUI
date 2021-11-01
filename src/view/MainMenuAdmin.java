/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Nicholas Russel
 */
public class MainMenuAdmin extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JButton registerKasir,updateKasir,deleteKasir;

    public MainMenuAdmin() {
        setTitle("Menu Admin");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Selamat Datang di Menu Admin");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 30);
        title.setLocation(300, 30);
        c.add(title);

        registerKasir = new JButton("Register Kasir");
        registerKasir.setFont(new Font("Arial", Font.PLAIN, 15));
        registerKasir.setSize(300, 20);
        registerKasir.setLocation(10, 100);
        registerKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuRegister();
            }
        });
        c.add(registerKasir);
        
        updateKasir = new JButton("Update Kasir");
        updateKasir.setFont(new Font("Arial", Font.PLAIN, 15));
        updateKasir.setSize(300, 20);
        updateKasir.setLocation(10, 150);
        updateKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuUpdateDataKasir();
            }
        });
        c.add(updateKasir);
        
        deleteKasir = new JButton("Delete Kasir");
        deleteKasir.setFont(new Font("Arial", Font.PLAIN, 15));
        deleteKasir.setSize(300, 20);
        deleteKasir.setLocation(10, 200);
        deleteKasir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MenuDeleteKasir();
            }
        });
        c.add(deleteKasir);
        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e) {
        
    }
}
    
