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
public class Kehadiran implements InterfaceKehadiran{
    private int id_person;
    private String tanggal;
    private int jumlahHari;
    private int status;
    public Kehadiran(){
    
    }
    
    public Kehadiran(int status, String tanggal, int jumlahHari,int id_person) {
        setId_person(id_person);
        setStatus(status);
        setTanggal(tanggal);
        setJumlahHari(jumlahHari);
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String toString(){
        return "\nTanggal:\t"+getTanggal()+
                "\nId Person:\t"+getId_person()+
                "\njumlah hari:\t"+getJumlahHari()+
                "\nStatus:\t\t"+selectKehadiran(status);
    }

    @Override
    public String selectKehadiran(int status) {
        switch(status) {
            case HADIR :
                return "hadir";
            case ALPHA :
                return "alpha";
        }
        return "";
    }
    
    
}
