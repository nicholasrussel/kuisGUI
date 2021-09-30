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
public class Admin extends Person {

    private double gaji;

    public Admin() {

    }

    public Admin(String name, String nomorTelepon, String alamat, String ttl, int gaji) {
        super(name, nomorTelepon, alamat, ttl);
        setGaji(gaji);
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

}
