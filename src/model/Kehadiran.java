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
public class Kehadiran {
    private int status;
    private String tanggal;
    private int totalJamMasuk;

    public Kehadiran(int status, String tanggal, int totalJamMasuk) {
        setStatus(status);
        setTanggal(tanggal);
        setTotalJamMasuk(totalJamMasuk);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getTotalJamMasuk() {
        return totalJamMasuk;
    }

    public void setTotalJamMasuk(int totalJamMasuk) {
        this.totalJamMasuk = totalJamMasuk;
    }
    
    
}
