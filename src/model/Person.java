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
public abstract class Person {
    private String name;
    private String nomorTelepon;
    private String alamat;
    private String ttl;

    public Person(String name, String nomorTelepon, String alamat, String ttl) {
        setName(name);
        setNomorTelepon(nomorTelepon);
        setAlamat(alamat);
        setTtl(ttl);
    }
    public Person(){
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String toString(){
        return "\nName:\t\t"+getName()+
                "\nTTL:\t\t"+getTtl()+
                "\nAlamat:\t\t"+getAlamat()+
                "\nTelepon:\t"+getNomorTelepon();
    }
}
