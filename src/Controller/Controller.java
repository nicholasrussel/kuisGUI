/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CategoryUser;
import Model.User;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nicholas Russel
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();

    public static ArrayList<CategoryUser> getAllCategory() {
        ArrayList<CategoryUser> allUser = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM categoryuser";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                CategoryUser user = new CategoryUser();
                user.setName(rs.getString("Name"));
                user.setId(rs.getInt("ID"));
                allUser.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (allUser);
    }
    
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> allUser = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM user";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                User user = new User();
                user.setName(rs.getString("Name"));
                user.setIdCategory(rs.getInt("ID_Category"));
                user.setId(rs.getInt("ID"));
                user.setEmail(rs.getString("Email"));
                allUser.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (allUser);
    }

    public User getUsers(String email) {
        conn.connect();
        String query = "SELECT * FROM user WHERE Email='" + email + "'";
        User user = new User();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setId(rs.getInt("ID"));
                user.setIdCategory(rs.getInt("ID_Category"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (user);
    }
    public boolean insertNewUser(User newPerson) {
        conn.connect();
        String query = "INSERT INTO user (ID,Name,Email,Password,ID_Category)"
                + "VALUES ( ?,?,?, ?, ?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setInt(1, 1);
            stmt.setString(2, newPerson.getName());
            stmt.setString(3, newPerson.getEmail());
            stmt.setString(4, newPerson.getPassword());
            stmt.setInt(5, newPerson.getIdCategory());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public boolean updateKasir(int ID, String nama, String email) {
        conn.connect();
        String query = "UPDATE user SET Name='" + nama + "', "
                + "Email='" + email + "', "
                + "WHERE ID='" + ID + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // DELETE
    public boolean deleteUser(int ID) {
        conn.connect();

        String query = "DELETE FROM user WHERE ID='" + ID + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    public String getSelectedPassword(String email) {
        String password = "";
        conn.connect();
        String query = "SELECT * FROM user WHERE Email = '" + email + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                password = rs.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return password;
    }

    public String getMD5(String password) {
        try {
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(password.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
