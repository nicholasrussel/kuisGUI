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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicholas Russel
 */
public class MenuLihatDataPengguna extends JFrame{

    // Components of the Form
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane sp;
    private JButton cancel;
    private Container c;
    ArrayList<User> users = Controller.getAllUsers();
    ArrayList<Integer> listCheckedUser = new ArrayList<>();
    public MenuLihatDataPengguna() {
        
        setTitle("Main Menu");
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        c = getContentPane();
        c.setLayout(null);

        setVisible(true);
        model = new DefaultTableModel() {
            @Override
            public Class getColumnClass(int columnIndex) {
                switch(columnIndex) {
                    case 0 :
                    case 5 :
                    case 6 :
                    case 7 :
                        return Integer.class;
                    case 8 :
                        return Boolean.class;
                    default :
                        return String.class;
                }
            }
        };
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Email");
        model.addColumn("Id_Category");
        table = new JTable(model);
        
        //Looping Data to Table
        for (int i=0; i<users.size(); i++) {
            User current = users.get(i);
            Object[] addBooks = new Object[4];
            addBooks[0] = current.getId();
            addBooks[1] = current.getName();
            addBooks[2] = current.getEmail();
            addBooks[3] = current.getIdCategory();
            model = (DefaultTableModel)table.getModel();
            model.addRow(addBooks);
        }

        //Set Column Size
        table.getColumnModel().getColumn(0).setPreferredWidth(2);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(60);
        table.getColumnModel().getColumn(3).setPreferredWidth(60);

        table.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                boolean added = false;
                for(int i=0;i<table.getModel().getRowCount();i++) {
                    if ((Boolean) table.getModel().getValueAt(i, 8)) {

                            listCheckedUser.add(users.get(table.getSelectedRow()).getId());

                        added = true;
                    }
                    if(added) {
                        break;
                    }
                }     
            }
        });
        
        table.setBounds(20, 20, 750, 300);
        sp = new JScrollPane(table);
        sp.setBounds(20, 20, 750, 300);
        c.add(sp);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Arial", Font.PLAIN, 15));
        cancel.setSize(100, 20);
        cancel.setLocation(950, 950);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MainMenu();
            }
        });
        c.add(cancel);
    }

}
