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
public class TopUp {
    private double pajakTopUp;
    private double harga;
    private String tipeTopUp;

    public TopUp(){
    
    }
    public TopUp(double pajakTopUp, double harga, String tipeTopUp) {
        setPajakTopUp(pajakTopUp);
        setHarga(harga);
        setTipeTopUp(tipeTopUp);
    }

    public double getPajakTopUp() {
        return pajakTopUp;
    }

    public void setPajakTopUp(double pajakTopUp) {
        this.pajakTopUp = pajakTopUp;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getTipeTopUp() {
        return tipeTopUp;
    }

    public void setTipeTopUp(String tipeTopUp) {
        this.tipeTopUp = tipeTopUp;
    }
    
}
