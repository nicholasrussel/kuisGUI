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
public class Diskon {
    private float persenDiskon;
    private ArrayList<Barang> barang = new ArrayList();

    public Diskon(float persenDiskon,Barang barang) {
        setPersenDiskon(persenDiskon);
        setBarang(barang);
    }

    public float getPersenDiskon() {
        return persenDiskon;
    }

    public void setPersenDiskon(float persenDiskon) {
        this.persenDiskon = persenDiskon;
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang.add(barang);
    }
    
    
}
