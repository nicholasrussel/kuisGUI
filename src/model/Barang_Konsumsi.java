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
public class Barang_Konsumsi extends Barang{
    
    private String kadaluarsa;
    private String bpom;
    public Barang_Konsumsi(String namaBarang, String kodeBarang, int quantity, int hargaJual, int hargaBeli, String kadaluarsa, String bpom) {
        super(namaBarang, kodeBarang, quantity, hargaJual, hargaBeli);
        setKadaluarsa(kadaluarsa);
        setBpom(bpom);
    }
    
    public Barang_Konsumsi(){
        
    }
    public String getKadaluarsa() {
        return kadaluarsa;
    }

    public void setKadaluarsa(String kadaluarsa) {
        this.kadaluarsa = kadaluarsa;
    }

    public String getBpom() {
        return bpom;
    }

    public void setBpom(String bpom) {
        this.bpom = bpom;
    }
    
}
