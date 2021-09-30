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
public class Kasir extends Person{
    private int gaji;
    private ArrayList<String> listMataKuliahDiajar = new ArrayList();
    public Kasir(String name, String nomorTelepon, String alamat, String ttl, int gaji) {
        super(name, nomorTelepon, alamat, ttl);
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public ArrayList<String> getListMataKuliahDiajar() {
        return listMataKuliahDiajar;
    }

    public void setListMataKuliahDiajar(ArrayList<String> listMataKuliahDiajar) {
        this.listMataKuliahDiajar = listMataKuliahDiajar;
    }
    
}
