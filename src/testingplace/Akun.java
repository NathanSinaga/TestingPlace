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
public class Akun {
    String username;
    String password;
    String nama;
    String email;
    String nikKTP;
    
    boolean member;
    int hargaMember = 120000;
    
    Akun next;
    
    //Baru...
    String merkKendaraan; //hashmap => key
    String genreKendaraan; //hashmap => key
    int indeksKendaraan ; //ArrayList => indeks
    //Baru...
    
    public Akun(){
        
    }
    public Akun(String username, String password, String nama, String email, String nikKTP){
        this.username =  username;
        this.password = password;
        this.nama = nama;
        this.email =  email;
        this.nikKTP = nikKTP;
        this.member = false;
        
    }
    
    public Akun(String password, String username, String nama){
        this.password = password;
        this.username = username;
        this.nama = nama;
    }
    
    //Baru...
    public void sewa(String merkKey, String genreKey, int indeksKey){
        this.merkKendaraan = merkKey;
        this.genreKendaraan = genreKey;
        this.indeksKendaraan = indeksKey;
    }
    
    public void sewaSelesai(){
        this.merkKendaraan = null;
        this.genreKendaraan = null;
        this.indeksKendaraan = 0;
    }
    //Baru...
    
    public void daftarMember(){
        this.member = true;
    }
}
