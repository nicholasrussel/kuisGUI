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
public class Barang {
    private String namaBarang;
    private String kodeBarang;
    private int quantity;
    private int hargaJual;
    private int hargaBeli;

    public Barang(String namaBarang, String kodeBarang, int quantity, int hargaJual, int hargaBeli) {
        setNamaBarang(namaBarang);
        setKodeBarang(kodeBarang);
        setQuantity(quantity);
        setHargaJual(hargaJual);
        setHargaBeli(hargaBeli);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(int hargaBeli) {
        this.hargaBeli = hargaBeli;
    }
    
    public Barang (){
        
    }
}
