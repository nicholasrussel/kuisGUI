/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    public static ArrayList<Person> getAllKasirs() {
        ArrayList<Person> persons = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM person WHERE Jabatan = '"+EnumJabatan.KASIR+"'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Person person = new Kasir();
                person.setName(rs.getString("Name"));
                person.setAlamat(rs.getString("Alamat"));
                person.setId_person(rs.getInt("Id_Person"));
                person.setNomorTelepon(rs.getString("Nomor_Telepon"));
                person.setTtl(rs.getString("TTL"));
                persons.add(person);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (persons);
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
        String query = "SELECT * FROM person WHERE Id_Person = '"+ID+"'";
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
    public Person getKasir(int ID) {
        conn.connect();
        String query = "SELECT * FROM person WHERE Id_Person='" + ID +"'";
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
}
