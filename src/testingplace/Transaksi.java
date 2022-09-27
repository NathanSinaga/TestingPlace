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
public class Transaksi {
    int seri;
    String username;
    String nama;
    String kendaraan;
    int masaSewa;
    int diskon;
    int total;
    
    public Transaksi(){
        
    }
    public Transaksi(int seri, String username, String nama, String merk, int masaSewa,int diskon, int total){
        this.seri = seri;
        this.username = username;
        this.nama =  nama;
        this.kendaraan = merk + "-" + "model";
        this.masaSewa = masaSewa;
        this.diskon = diskon;
        this.total = total;
        
    }
    
    public int hitungDiskon(int masaSewa, int hargaKendaraan){
        int Diskon = 0;
        if (masaSewa > 168) { // jika diatas seminggu
            Diskon = 250000;
        }else if (masaSewa > 120) { // jika diatas 5 hari
            Diskon = 175000;
        }else if(masaSewa > 24){ // jika lebih dari 1 hari
            Diskon = 80000;
        }
        
        return Diskon;
    }
}
