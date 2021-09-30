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
public class ListPenjualan {
    private double labaKotor;
    private int quantity;
    private String tanggalJual;

    public ListPenjualan(double labaKotor, int quantity,String tanggalJual) {
       setLabaKotor(labaKotor);
       setQuantity(quantity);
       setTanggalJual(tanggalJual);
    }

    public double getLabaKotor() {
        return labaKotor;
    }

    public void setLabaKotor(double labaKotor) {
        this.labaKotor = labaKotor;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTanggalJual() {
        return tanggalJual;
    }

    public void setTanggalJual(String tanggalJual) {
        this.tanggalJual = tanggalJual;
    }
    
}
