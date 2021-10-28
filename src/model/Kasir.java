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
public class Kasir extends Person {

    private double gaji;
    private ArrayList<Kehadiran> listKehadiran = new ArrayList();

    public Kasir(String name, String nomorTelepon, String alamat, String ttl, int id_person, String password, EnumJabatan jabatan) {
        super(name, nomorTelepon, alamat, ttl, id_person, password, jabatan);
        setGaji(gaji);
    }

    public Kasir() {
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public ArrayList<Kehadiran> getListKehadiran() {
        return listKehadiran;
    }

    public void setListKehadiran(ArrayList<Kehadiran> listKehadiran) {
        this.listKehadiran = listKehadiran;
    }
    
    public String toString(){
        return "\nId Person:\t"+getId_person()+
                "\nName:\t\t"+getName()+
                "\nTTL:\t\t"+getTtl()+
                "\nAlamat:\t\t"+getAlamat()+
                "\nTelepon:\t"+getNomorTelepon()+
                "\nJabatan:\t"+getJabatan();
    }
}
