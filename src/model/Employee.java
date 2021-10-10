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
public class Employee extends Person{
    
    private String IDKerja;

    public Employee(String IDKerja, String name, String nomorTelepon, String alamat, String ttl) {
        super(name, nomorTelepon, alamat, ttl);
        setIDKerja(IDKerja);
    }

    public Employee() {
    }

    public String getIDKerja() {
        return IDKerja;
    }

    public void setIDKerja(String IDKerja) {
        this.IDKerja = IDKerja;
    }
    
}
