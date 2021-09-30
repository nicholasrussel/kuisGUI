/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class StokBarang {
    private String namaBarang;
    private String kodeBarang;
    private double hargaJual;
    private double hargaBeli;
    private int quantity;

    public StokBarang(String namaBarang, String kodeBarang, double hargaJual, double hargaBeli, int quantity) {
       setNamaBarang(namaBarang);
       setKodeBarang(kodeBarang);
       setHargaJual(hargaJual);
       setHargaBeli(hargaBeli);
       setQuantity(quantity);
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

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
