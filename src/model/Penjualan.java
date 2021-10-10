/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */

public class Penjualan {
    private double labaKotor;
    private String tanggalJual;
    private ArrayList <Barang> barang = new ArrayList();
    

    public Penjualan(double labaKotor,String tanggalJual,Barang barang) {
       setLabaKotor(labaKotor);
       setTanggalJual(tanggalJual);
       setBarang(barang);
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang.add(barang);
    }

    public double getLabaKotor() {
        return labaKotor;
    }

    public void setLabaKotor(double labaKotor) {
        this.labaKotor = labaKotor;
    }

    public String getTanggalJual() {
        return tanggalJual;
    }

    public void setTanggalJual(String tanggalJual) {
        this.tanggalJual = tanggalJual;
    }
    
}
