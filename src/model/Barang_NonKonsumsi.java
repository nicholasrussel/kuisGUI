/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nicholas Russel
 */
public class Barang_NonKonsumsi extends Barang{
    private String sni;

    public Barang_NonKonsumsi(String sni, String namaBarang, String kodeBarang, int quantity, int hargaJual, int hargaBeli) {
        super(namaBarang, kodeBarang, quantity, hargaJual, hargaBeli);
        setSni(sni);
    }
    
    public Barang_NonKonsumsi(){
        
    }
    
    public Barang_NonKonsumsi(String sni) {
        this.sni = sni;
    }

    public String getSni() {
        return sni;
    }

    public void setSni(String sni) {
        this.sni = sni;
    }
    
}
