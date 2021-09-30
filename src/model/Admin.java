/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Nicholas Russel
 */
public class Admin extends Person {

    private double gaji;
    private ArrayList<Kehadiran> listKehadiran = new ArrayList();

    public Admin(double gaji, String name, String nomorTelepon, String alamat, String ttl) {
        super(name, nomorTelepon, alamat, ttl);
        this.gaji = gaji;
    }
    
    public Admin() {

    }

    public ArrayList<Kehadiran> getListKehadiran() {
        return listKehadiran;
    }

    public void setListKehadiran(ArrayList<Kehadiran> listKehadiran) {
        this.listKehadiran = listKehadiran;
    }
    

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

}
