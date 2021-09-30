/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Nicholas Russel
 */
public class PekerjaKebersihan extends Employee{
    
    private double gajiPerJam;
    private ArrayList<Kehadiran> listKehadiran = new ArrayList();

    public PekerjaKebersihan(double gajiPerJam, String NIK, String name, String nomorTelepon, String alamat, String ttl) {
        super(NIK, name, nomorTelepon, alamat, ttl);
        setGajiPerJam(gajiPerJam);
    }

    public PekerjaKebersihan() {
        
    }

    public double getGajiPerJam() {
        return gajiPerJam;
    }

    public void setGajiPerJam(double gajiPerJam) {
        this.gajiPerJam = gajiPerJam;
    }

    public ArrayList<Kehadiran> getListKehadiran() {
        return listKehadiran;
    }

    public void setListKehadiran(ArrayList<Kehadiran> listKehadiran) {
        this.listKehadiran = listKehadiran;
    }
    
}
