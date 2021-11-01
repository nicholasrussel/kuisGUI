/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author Nicholas Russel
 */
public class Controller {

    static DatabaseHandler conn = new DatabaseHandler();

    // SELECT ALL from table person
    public static ArrayList<Kasir> getAllKasirs() {
        ArrayList<Kasir> cashier = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM person WHERE Jabatan = '" + EnumJabatan.KASIR + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Kasir kasir = new Kasir();
                kasir.setName(rs.getString("Name"));
                kasir.setAlamat(rs.getString("Alamat"));
                kasir.setId_person(rs.getInt("Id_Person"));
                kasir.setNomorTelepon(rs.getString("Nomor_Telepon"));
                kasir.setTtl(rs.getString("TTL"));
                kasir.setGaji(rs.getInt("Gaji"));
                cashier.add(kasir);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (cashier);
    }

    // SELECT ALL from table barang
    public static ArrayList<Kehadiran> getAllKehadiran() {
        ArrayList<Kehadiran> Kehadirans = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM kehadiran";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Kehadiran hadir = new Kehadiran();
                hadir.setTanggal(rs.getString("Tanggal_Masuk"));
                hadir.setId_person(rs.getInt("Id_Person"));
                hadir.setJumlahHari(rs.getInt("Jumlah hari"));
                hadir.setStatus(rs.getInt("Status"));
                Kehadirans.add(hadir);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (Kehadirans);
    }

    public String getSelectedPassword(int ID) {
        String password = "";
        conn.connect();
        String query = "SELECT * FROM person WHERE Id_Person = '" + ID + "'";
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
    public String getSelectedJabatan(int ID){
        String jabatan = "";
        conn.connect();
        String query = "SELECT * FROM person WHERE Id_Person = '" + ID + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                jabatan = rs.getString("Jabatan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jabatan;
    }

    public Person getKasir(int ID) {
        conn.connect();
        String query = "SELECT * FROM person WHERE Id_Person='" + ID + "'";
        Person person = new Kasir();
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                person.setId_person(rs.getInt("Id_Person"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (person);
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
    public static boolean insertNewUser(Kasir newPerson) {
        conn.connect();
        String query = "INSERT INTO person (Jabatan,Name,Alamat,Nomor_Telepon,TTL,Password,Gaji,Gender)" +
  "VALUES (?, ?, ?,?, ?, ?,?, ?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, newPerson.getJabatan().toString());
            stmt.setString(2, newPerson.getName());
            stmt.setString(3, newPerson.getAlamat());
            stmt.setString(4, newPerson.getNomorTelepon());
            stmt.setString(5, newPerson.getTtl());
            stmt.setString(6, newPerson.getPassword());
            stmt.setDouble(7, newPerson.getGaji());
            stmt.setString(8, newPerson.getGender());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // UPDATE
    public static boolean updateKasir(int ID,String nama,String alamat,String nomor,int gaji) {
        conn.connect();
        String query = "UPDATE person SET Name='" + nama+ "', "
                + "Alamat='" + alamat + "', "
                + "Nomor_Telepon='" + nomor+ "',"
                + "Gaji='" + gaji + "' "
                + "WHERE Id_Person='" + ID+ "'";
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
    public static boolean deleteUser(int ID) {
        conn.connect();

        String query = "DELETE FROM person WHERE Id_Person='" + ID + "'";
        try {
            Statement stmt = conn.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}
