// Java program to implement
// a Simple Registration Form
// using Java Swing
package view;

import controller.DatabaseHandler;
import controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.*;

public class MenuLogin extends JFrame implements ActionListener {

    Statement stat;
    ResultSet rs;
    String sql;

    // Components of the Form
    private Container c;
    private JLabel title, ID, message, pass;
    private JTextField tID;
    private JPasswordField tpass;
    private JButton sub;
    static DatabaseHandler conn = new DatabaseHandler();

    public MenuLogin() {
        setTitle("Login Form");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Login Form");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(100, 80);
        title.setLocation(100, 30);
        c.add(title);

        ID = new JLabel("ID");
        ID.setFont(new Font("Arial", Font.PLAIN, 15));
        ID.setSize(100, 20);
        ID.setLocation(100, 100);
        c.add(ID);

        tID = new JTextField();
        tID.setFont(new Font("Arial", Font.PLAIN, 15));
        tID.setSize(190, 20);
        tID.setLocation(100, 130);
        c.add(tID);

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

    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
//    public void actionPerformed(ActionEvent event) {
//
//        int userID = Integer.parseInt(tID.getText());
//        String password = String.valueOf(tpass.getPassword());
//        conn.connect();
//        Controller c = new Controller();
//
//        String oldPassword = c.getSelectedPassword(userID);
//        try {
//            String sql = "SELECT * FROM person WHERE Id_Person = '" + userID + "' AND Password = '" + password + "'";
//            Statement st = conn.con.createStatement();
//            ResultSet rsLogin = st.executeQuery(sql);
//
//            rsLogin.next();
////            rsLogin.last(); //mengecek jumlah baris pada hasil query
//            if (rsLogin.getRow() == 1) {
//                JOptionPane.showMessageDialog(null, "Login Berhasil!");
//                // new FrmMenuUtama().setVisible(true); //<-- BILA MAU DIARAHKAN KE Frame Menu Utama
//                this.dispose();
//            } else {
//                JOptionPane.showMessageDialog(null, "Maaf, Username / Password salah!");
//
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
    public void actionPerformed(ActionEvent event) {
        conn.connect();
        Controller c = new Controller();
        int userID = Integer.parseInt(tID.getText());
        String password = c.getMD5(String.valueOf(tpass.getPassword()));

        String pass = password.substring(0, 30);


        try {
            String sql = "SELECT * FROM person WHERE Id_Person = '" + userID + "'";
            Statement st = conn.con.createStatement();
            ResultSet rsLogin = st.executeQuery(sql);
            
            if (rsLogin.next()) {
                if (pass.equals(c.getSelectedPassword(userID))) {
                    JOptionPane.showMessageDialog(null, "Login Berhasil!");
                    String jabatan = c.getSelectedJabatan(userID).toLowerCase();
                    String jabatanKasir = EnumJabatan.KASIR.toString().toLowerCase();
                    String jabatanAdmin = EnumJabatan.ADMIN.toString().toLowerCase();
                    if (jabatan.equals(jabatanKasir)) {
                        new MainMenuKasir();
                        this.dispose();
                    } else {
                        new MainMenuAdmin();
                        this.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password Salah");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username / Password salah!");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
// ' AND password='"+password+" && password.equals(rs.getString("Password")) User specificUser = controller.getUser("Budi","jl du"); "SELECT * FROM person WHERE Id_Person='"+userID+"'"
//    public Person getUser(String userName, String password) {
//        Controller controller =  new Controller();
//        Person specificUser = controller.getUser(userName);
//        conn.connect();
//        String query = "SELECT * FROM person WHERE Name='" + userName +"'";
//        Person p = new Person();
//        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
//            message.setText(" Hello " + userName + "");
//        } else {
//            message.setText(" Invalid user.. ");
//        }
//        try {
//            Statement stmt = conn.con.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                user.setId(rs.getInt("ID"));
//                user.setName(rs.getString("Name"));
//                user.setAddress(rs.getString("Address"));
//                user.setPhone(rs.getString("Phone"));
//                user.setAge(rs.getInt("Age"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return (user);
//    }

}
