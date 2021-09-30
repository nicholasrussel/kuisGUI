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
public class Kasir extends Employee {

    private double gaji;
    private ArrayList<Kehadiran> listKehadiran = new ArrayList();

    public Kasir(double gaji, String NIK, String name, String nomorTelepon, String alamat, String ttl) {
        super(NIK, name, nomorTelepon, alamat, ttl);
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

}
