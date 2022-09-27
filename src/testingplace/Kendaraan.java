/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesSdat_REV;

/**
 *
 * @author Nathan Sinaga
 */
public class Kendaraan {
    String merk;
    String model;
    int tahunBuat;
    int noSeri;
    String noPlat;
    
    int hargaPerHari;
    //int hargaPerBulan;
    
    char kondisi = 'A';
    
    boolean tersedia;
    
    
    public Kendaraan(String merk, String model, int tahunBuat, int noSeri, int hargaPerHari, String noPlat, boolean tersedia){
        this.merk = merk;
        this.model = model;
        this.tahunBuat = tahunBuat;
        this.noSeri =  noSeri;
        this.hargaPerHari = hargaPerHari;
        this.noPlat = noPlat;
        this.tersedia = tersedia;
        //this.hargaPerBulan = (int) (hargaPerHari * 30 * 0.8);
    }
    
    //saat mobil dipesan
    public void boolTerseedia(boolean _tersedia){
        this.tersedia = _tersedia;
    }
}
