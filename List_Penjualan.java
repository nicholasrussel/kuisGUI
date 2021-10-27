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
public class List_Penjualan {
    private ArrayList<Penjualan>penjualan = new ArrayList();
    private ArrayList<TopUp> topup = new ArrayList();
    private ArrayList<Diskon> barangDiskon = new ArrayList();

    public List_Penjualan() {
    
    }
    public List_Penjualan(Penjualan penjualan, TopUp topup, Diskon barangDiskon){
        setTopup(topup);
        setPenjualan(penjualan);
        setBarangDiskon(barangDiskon);
    }

    public ArrayList<Diskon> getBarangDiskon() {
        return barangDiskon;
    }

    public void setBarangDiskon(Diskon barangDiskon) {
        this.barangDiskon.add(barangDiskon);
    }
    

    public ArrayList<Penjualan> getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan.add(penjualan);
    }

    public ArrayList<TopUp> getTopup() {
        return topup;
    }

    public void setTopup(TopUp topup) {
        this.topup.add(topup);
    }
    
}
