/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesSdat_REV;



import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan Sinaga Class utama / Main
 */
public class StrukDatTugasBesar {

    public static String checkIfNull(String input){
        if(input != null){
            return input;
        } else {
            return "NULL";
        }
    }
    
    public static int checkIntNull(int input){
        String temp = "" + input;
        if(temp != null){
            return -1;
        } else {
            return input;
        }
    }
    public static void main(String[] args) {
        //112043-Nathan Sinaga
            //Admin & Pelanggan
                //Admin
                    //Laporan Kendaraan, Keuangan, Resmi
                        //Iterasi menggunakan HashMap, LinkedList & ArryList untuk mengeluarkan data
                //Pelanggan
                    //Register
                        //Menggunakan HashMap untuk membuat akun
        //1121042-Hegya Rifandy Sukatendel
            //Admin
                //Tambah, Hapus, Update Kendaraan
                    //Iterasi menggunakan HashMap, LinkedList & ArryList untuk mengeluarkan, menambah & mengganti data
        //1121039-Juan Nathaniel
            //Pelanggan
                //Pemesanan
                    //Menggunakan HashMap Akun untuk Login dan HashMap, LinkedList & ArryList untuk memilih data untuk memesan kendaraan
                    
                    
        //Struktur Java Collection
        //Daftar Akun: Akun 1, Akun 2, ...
        //Daftar Kendaraan: Daftar Merk => Pilih Merk => Daftar Kendaraan Per Merk => Pilih Genre Kendaraan => Daftar Kendaraan Per Merk Per Genre => Kendaraan 1, Kendaraan 2, ...
        //Daftar Transaksi: Transaksi 1, Transaksi 2, ...
        //Daftar Merk(HashMap) => Daftar Genre(HashMap) => Kendaraan(ArrayList)

        //Daftar Akun, Daftar Kendaraan & Daftar Transaksi Menggunakan Java Collection HashMap & LinkedList
        //DaftarAkun <Username, Objek Akun>
        HashMap<String, Akun> DaftarAkun = new HashMap<String, Akun>(); //Contoh: Daftar Akun
        LinkedList<Transaksi> DaftarTransaksi = new LinkedList<Transaksi>();

        //Merk:
        HashMap<String, ArrayList<Kendaraan>> Toyota = new HashMap<String, ArrayList<Kendaraan>>(); //Daftar Kendaraan Per Merk
        HashMap<String, ArrayList<Kendaraan>> Mercedes = new HashMap<String, ArrayList<Kendaraan>>(); //Daftar Kendaraan Per Merk
        HashMap<String, ArrayList<Kendaraan>> Wuling = new HashMap<String, ArrayList<Kendaraan>>(); //Daftar Kendaraan Per Merk

        Akun Admin = new Akun("admin", "Admin", "admin");
        DaftarAkun.put("Admin", Admin);

        //Kendaraan:
        ArrayList<Kendaraan> ToyotaSEDAN = new ArrayList<Kendaraan>(); //Daftar Kendaraan Per Merk Per Genre
        Kendaraan Vios = new Kendaraan("Toyota", "Vios", 2009, 5137819, 250000, "D7890", true);
        ToyotaSEDAN.add(Vios);
        Kendaraan Camry = new Kendaraan("Toyota", "Camry", 2013, 51716819, 300000, "D7866", true);
        ToyotaSEDAN.add(Camry);

        ArrayList<Kendaraan> ToyotaSUV = new ArrayList<Kendaraan>();//Daftar Kendaraan Per Merk Per Genre
        Kendaraan LandCruiser = new Kendaraan("Toyota", "Land Cruiser", 2015, 7167819, 120000, "D5676", true);
        ToyotaSUV.add(LandCruiser);
        Kendaraan Fortuner = new Kendaraan("Toyota", "Fortunerr", 2019, 5467819, 210000, "D6567", true);
        ToyotaSUV.add(Fortuner);

        Toyota.put("Sedan", ToyotaSEDAN);
        Toyota.put("SUV", ToyotaSUV);

        ArrayList<Kendaraan> MercedesSEDAN = new ArrayList<Kendaraan>();//Daftar Kendaraan Per Merk Per Genre
        Kendaraan SL200 = new Kendaraan("Mercedes", "SL200", 2019, 5190819, 200000, "D3256", true);
        MercedesSEDAN.add(SL200);
        Kendaraan SL300 = new Kendaraan("Mercedes", "SL300", 2018, 7890819, 230000, "D6780", true);
        MercedesSEDAN.add(SL300);

        ArrayList<Kendaraan> MercedesSUV = new ArrayList<Kendaraan>();//Daftar Kendaraan Per Merk Per Genre
        Kendaraan C200 = new Kendaraan("Mercedes", "C200", 2020, 7167819, 270000, "D6740", true);
        MercedesSUV.add(C200);
        Kendaraan C500 = new Kendaraan("Mercedes", "C500", 2022, 7145019, 240000, "D1468", true);
        MercedesSUV.add(C500);

        Mercedes.put("Sedan", MercedesSEDAN);
        Mercedes.put("SUV", MercedesSUV);

        ArrayList<Kendaraan> WulingSEDAN = new ArrayList<Kendaraan>();//Daftar Kendaraan Per Merk Per Genre
        Kendaraan Cortez = new Kendaraan("Wuling", "Cortez", 2021, 5137819, 500000, "D3190", true);
        WulingSEDAN.add(Cortez);
        Kendaraan Confero = new Kendaraan("Wuling", "Cofero", 2019, 5189819, 400000, "D2879", true);
        WulingSEDAN.add(Confero);

        ArrayList<Kendaraan> WulingSUV = new ArrayList<Kendaraan>();//Daftar Kendaraan Per Merk Per Genre
        Kendaraan Almaz = new Kendaraan("Wuling", "Almaz", 2021, 7167819, 700000, "D5876", true);
        WulingSUV.add(Almaz);
        Kendaraan Formo = new Kendaraan("Wuling", "Formo", 2020, 7167568, 750000, "D0975", true);
        WulingSUV.add(Formo);

        Wuling.put("Sedan", WulingSEDAN);
        Wuling.put("SUV", WulingSUV);

        HashMap<String, HashMap<String, ArrayList<Kendaraan>>> DaftarMerk = new HashMap<String, HashMap<String, ArrayList<Kendaraan>>>();//Daftar Merk
        //DaftarMerk(Merk => Key,  Daftar Kendaraan Per Merk => Value )
        DaftarMerk.put("Toyota", Toyota);
        DaftarMerk.put("Mercedes", Mercedes);
        DaftarMerk.put("Wuling", Wuling);
        
        
        //Tanggal
        Date dt = new Date();
        
        //Nama Perusahaan
        String namaPT = "PT. Senjaya Motors Rental";
        
        
        
        
        //Pilihan Menu Pengguna
        String[] optionUser = {"Admin", "Pelanggan", "Keluar"};
        String[] optionAdmin = {"Tambah Kendaraan", "Hapus Kendaraan", "Update Kendaraan", "Laporan Kendaraan", "Laporan Keuangan", "Laporan Resmi", "Keluar"};
        String[] optionPelanggan = {"Masuk", "Registrasi", "Keluar"};
        String[] optionUpdate = {"Model", "Tahun Buat","No Seri", "No Plat", "Harga Per Hari", "Kondisi", "Tersedia"};
        String[] optionKondisi = {"A", "B", "C", "D", "E"};
        String[] optionTersedia = {"Tersedia", "Tidak Tersedia"};

        
        
        
        
        //Pesan Kepada Pengguna
        String pesanBerhasilRegistrasi = "Pembuatan Akun Berhasil, Selamat Datang ";
        String pesanGagalRegistrasi1 = "Gagal Registrasi Akun Baru \nPenyebab:\nUsername sudah ada";
        String pesanGagalRegistrasi2 = "Gagal Registrasi Akun Baru \nPenyebab:\nKategori di tinggal kosong";
        String pesanBerhasilMasuk = "Selamat Datang ";
        String pesanGagalMasuk1 = "Gagal Masuk Akun\nPeneybab:\nUsername tidak ditemukan";
        String pesanGagalMasuk2 = "Gagal Masuk Akun\nPeneybab:\nPassword salah";
        String pesanGagalPilihMerk = "Gagal Pilih Merk\nInput Salah!";
        String pesanGagalPilihGenre = "Gagal Pilih Genre\nInput Salah!";
        String pesanGagalPilihKendaraan = "Gagal Pilih Kendaraan\nInput Sslah!";

        
        
        
        
        String user;
        
            user = (String) JOptionPane.showInputDialog(null, "User:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionUser, optionUser[1]);
            user = checkIfNull(user);
        
        while ((!user.equals("Keluar")) && (!user.equals("NULL"))) {
            switch (user) {
                //Admin_...
                case "Admin":
                    String admin =""; 
                    
                        admin= (String) JOptionPane.showInputDialog(null, "Admin:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionAdmin, optionAdmin[2]);
                        admin = checkIfNull(admin);
                    
                    while ((!admin.equals("Keluar"))&&(!admin.equals("NULL"))) {
                        String listMerk = "Merk:\n";
                        for (HashMap.Entry<String, HashMap<String, ArrayList<Kendaraan>>> set : DaftarMerk.entrySet()) {
                            listMerk += set.getKey() + "\n";
                        }
                        listMerk += "Pilihan Anda:";
                        switch (admin) {
                            //Hegya
                            case "Hapus Kendaraan":
                                String merkSearch = JOptionPane.showInputDialog(null, listMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                merkSearch = checkIfNull(merkSearch);
                                if ((DaftarMerk.containsKey(merkSearch)) && (!merkSearch.equals("NULL"))) {
                                    //Berhasil Pilih Merk
                                    HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(merkSearch);
                                    String listGenre = "Genre:\n";
                                    for (HashMap.Entry<String, ArrayList<Kendaraan>> set : DaftarPerMerk.entrySet()) {
                                        listGenre += set.getKey() + "\n";
                                    }
                                    listGenre += "Pilihan Anda: ";
                                    String genre = JOptionPane.showInputDialog(null, listGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    genre = checkIfNull("NULL");
                                    if ((DaftarPerMerk.containsKey(genre))&&(!genre.equals("NULL"))) {
                                        //Berhasil Pilih Genre
                                        ArrayList<Kendaraan> DaftarPerGenre = DaftarPerMerk.get(genre);
                                        String listKendaraan = "Kendaraan:\n";
                                        for (int noUrut = 0; noUrut < DaftarPerGenre.size(); noUrut++) {
                                            listKendaraan += "No Urut          : " + noUrut + "\nModel             : " + DaftarPerGenre.get(noUrut).model + "\nKondisi          : " + DaftarPerGenre.get(noUrut).kondisi + "\nTahun Buat   : " + DaftarPerGenre.get(noUrut).tahunBuat + "\nNo Plat           : " + DaftarPerGenre.get(noUrut).noPlat + "\nTersedia       : " + DaftarPerGenre.get(noUrut).tersedia + "\n\n";
                                        }
                                        listKendaraan += "Masukan No Urut Kendaraan yang Dihapus:";
                                        String temp = JOptionPane.showInputDialog(null, listKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                        temp = checkIfNull(temp);
                                        if(!temp.equals("NULL")){
                                            int nomor = Integer.parseInt(temp);
                                            if(nomor > -1 && nomor <  DaftarPerGenre.size()){
                                                //Berhasil Pilih Kendaraan
                                                String infoKendaraan = "Kendaraan dengan Plat: " + DaftarPerGenre.get(nomor).noPlat + "Telah Di Hapus!";
                                                DaftarPerGenre.remove(nomor);
                                                JOptionPane.showMessageDialog(null, infoKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);

                                            } else {
                                                //Gagal Pilih Kendaraan
                                                JOptionPane.showMessageDialog(null, pesanGagalPilihKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }
                                    } else {
                                        //Gagal Pilih Genre
                                        JOptionPane.showMessageDialog(null, pesanGagalPilihGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    //Gagal Pilih Merk
                                    JOptionPane.showMessageDialog(null, pesanGagalPilihMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            case "Tambah Kendaraan":
                                String merkCari = JOptionPane.showInputDialog(null, listMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                merkCari = checkIfNull(merkCari);
                                if ((DaftarMerk.containsKey(merkCari)) && (!merkCari.equals("NULL"))) {
                                    //Berhasil Pilih Merk
                                    HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(merkCari);
                                    String listGenre = "Genre:\n";
                                    for (HashMap.Entry<String, ArrayList<Kendaraan>> set : DaftarPerMerk.entrySet()) {
                                        listGenre += set.getKey() + "\n";
                                    }
                                    listGenre += "Pilihan Anda: ";
                                    String genre = JOptionPane.showInputDialog(null, listGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    if (DaftarPerMerk.containsKey(genre)) {
                                        //Berhasil Pilih Genre
                                        ArrayList<Kendaraan> DaftarPerGenre = DaftarPerMerk.get(genre);
                                        String modelKendaraan = JOptionPane.showInputDialog(null, "Model Kendaraan:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                        modelKendaraan = checkIfNull(modelKendaraan);
                                        if((!modelKendaraan.equals(""))&&(!modelKendaraan.equals(" ")&&(!modelKendaraan.equals("NULL")))){
                                            String tahun = JOptionPane.showInputDialog(null, "Tahun buat Kendaraan:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                            tahun = checkIfNull(tahun);
                                            if(!tahun.equals("NULL")){
                                                int tahunBuat = Integer.parseInt(tahun);
                                                if(tahunBuat > 1886 && tahunBuat <= (dt.getYear()+1900)){
                                                    String nomor = JOptionPane.showInputDialog(null, "Nomor Seri Kendaraan:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                    nomor = checkIfNull(nomor);
                                                    if((!nomor.equals(""))&&(!nomor.equals(" "))&&(!nomor.equals("NULL"))){  
                                                        int noSeri = Integer.parseInt(nomor);//
                                                        String noPlat = JOptionPane.showInputDialog(null, "Nomor Plat Kendaraan Kendaraan:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                        noPlat = checkIfNull(noPlat);
                                                        if(((!noPlat.equals(""))&&(!modelKendaraan.equals(" ")))&&(!modelKendaraan.equals("NULL"))){
                                                            String harga = JOptionPane.showInputDialog(null, "Harga Per Hari Kendaraan:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                            harga = checkIfNull(harga);
                                                            if(!harga.equals("NULL")){
                                                                int hargaPerHari = Integer.parseInt(harga);//
                                                                if(hargaPerHari > 0){
                                                                   Kendaraan newKendaraan = new Kendaraan(merkCari, modelKendaraan, tahunBuat, noSeri, hargaPerHari, noPlat, true);
                                                                   DaftarPerGenre.add(newKendaraan);
                                                                   JOptionPane.showMessageDialog(null, "Selamat, Kendaraan Anda Telah Ditambah!", namaPT, JOptionPane.INFORMATION_MESSAGE);

                                                                } else {
                                                                    //Gagal Input Harga Per Hari
                                                                    JOptionPane.showMessageDialog(null, "Gagal Masukan Input Harga Per Hari!", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                                }
                                                            }
                                                        } else {
                                                            //Gagal Input No Plat
                                                            JOptionPane.showMessageDialog(null, "Gagal Masukan Input No Plat!", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                        }
                                                    } else {
                                                        //Gagal Input Nomor Seri
                                                        JOptionPane.showMessageDialog(null, "Gagal Masukan Input Nomor Seri!", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                    }
                                                } else {
                                                    //Gagal Input Tahun Buat
                                                    JOptionPane.showMessageDialog(null, "Gagal Masukan Input Tahun Buat!", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            }
                                        } else {
                                            //Gagal Input Model
                                            JOptionPane.showMessageDialog(null, "Gagal Masukan Input Model!", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                        }
                                        
                                    } else {
                                        //Gagal Pilih Genre
                                        JOptionPane.showMessageDialog(null, pesanGagalPilihGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    //Gagal Pilih Merk
                                    JOptionPane.showMessageDialog(null, pesanGagalPilihMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                }
                                
                                break;
                            case "Update Kendaraan":
                                String merkSearch_ = JOptionPane.showInputDialog(null, listMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                merkSearch_ = checkIfNull(merkSearch_);
                                if ((DaftarMerk.containsKey(merkSearch_)) && (!merkSearch_.equals("NULL"))) {
                                    //Berhasil Pilih Merk
                                    HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(merkSearch_);
                                    String listGenre = "Genre:\n";
                                    for (HashMap.Entry<String, ArrayList<Kendaraan>> set : DaftarPerMerk.entrySet()) {
                                        listGenre += set.getKey() + "\n";
                                    }
                                    listGenre += "Pilihan Anda: ";
                                    String genre = JOptionPane.showInputDialog(null, listGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                    genre = checkIfNull(genre);
                                    if ((DaftarPerMerk.containsKey(genre)) && (!genre.equals("NULL"))) {
                                        //Berhasil Pilih Genre
                                        ArrayList<Kendaraan> DaftarPerGenre = DaftarPerMerk.get(genre);
                                        String listKendaraan = "Kendaraan:\n";
                                        for (int noUrut = 0; noUrut < DaftarPerGenre.size(); noUrut++) {
                                            listKendaraan += "No Urut          : " + noUrut + "\nModel             : " + DaftarPerGenre.get(noUrut).model + "\nKondisi          : " + DaftarPerGenre.get(noUrut).kondisi + "\nTahun Buat   : " + DaftarPerGenre.get(noUrut).tahunBuat + "\nNo Plat           : " + DaftarPerGenre.get(noUrut).noPlat + "\nTersedia       : " + DaftarPerGenre.get(noUrut).tersedia + "\n\n";
                                        }
                                        listKendaraan += "Masukan No Urut Kendaraan yang DiUpdate:";
                                        String temp = JOptionPane.showInputDialog(null, listKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                        temp = checkIfNull(temp);
                                        if(!temp.equals("NULL")){
                                            int nomor = Integer.parseInt(temp);
                                            if(nomor > -1 && nomor <  DaftarPerGenre.size()){
                                                //Pilih Elemen yang ingin diupdate
                                                String update = (String) JOptionPane.showInputDialog(null, "User:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionUpdate, optionUpdate[0]);//
                                                update = checkIfNull(update);
                                                switch(update){
                                                    case "Model":
                                                        String temp_ = JOptionPane.showInputDialog(null, "Model Sebelum:" + DaftarPerGenre.get(nomor).model + "\nMenjadi:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                        temp_ = checkIfNull(temp_);
                                                        if(!temp_.equals("NULL")){
                                                            DaftarPerGenre.get(nomor).model = temp_;
                                                        }
                                                        break;
                                                    case "Tahun Buat":
                                                        String tahun = JOptionPane.showInputDialog(null, "Tahun Buat Sebelum:" + DaftarPerGenre.get(nomor).tahunBuat + "\nMenjadi:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                        tahun = checkIfNull(tahun);
                                                        if(!tahun.equals("NULL")){
                                                            int tahunBuat = Integer.parseInt(tahun);
                                                            if(tahunBuat > 1886 && tahunBuat <= (dt.getYear()+1900)){
                                                                DaftarPerGenre.get(nomor).tahunBuat = tahunBuat;
                                                            }
                                                        }
                                                        break;
                                                    case "No Seri":
                                                        String no = JOptionPane.showInputDialog(null, "No Seri Sebelum:" + DaftarPerGenre.get(nomor).noSeri + "\nMenjadi:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                        no = checkIfNull(no);
                                                        if(!no.equals("NULL")){
                                                            int nomorSeri = Integer.parseInt(no);//
                                                            DaftarPerGenre.get(nomor).noSeri = nomorSeri;
                                                        }
                                                        break;
                                                    case "No Plat":
                                                        String temp__ = JOptionPane.showInputDialog(null, "Nomor Plat Sebelum:" + DaftarPerGenre.get(nomor).noPlat + "\nMenjadi:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                        temp__ = checkIfNull(temp__);
                                                        if(!temp__.equals("NULL")){
                                                            DaftarPerGenre.get(nomor).noPlat  = temp__;
                                                        }
                                                        break;
                                                    case "Harga Per Hari":
                                                        String rate = JOptionPane.showInputDialog(null, "Tahun Buat Sebelum:" + DaftarPerGenre.get(nomor).tahunBuat + "\nMenjadi:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                        rate = checkIfNull(rate);
                                                        if(!rate.equals("NULL")){
                                                            int hargaPerHari = Integer.parseInt(rate);
                                                            DaftarPerGenre.get(nomor).hargaPerHari = hargaPerHari;
                                                        }
                                                        break;
                                                    case "Kondisi":
                                                        String tKondisi = (String) JOptionPane.showInputDialog(null,"Kondisi Sebelum:" + DaftarPerGenre.get(nomor).kondisi + "\nMenjadi:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionKondisi, optionKondisi[0]);//
                                                        tKondisi = checkIfNull(tKondisi);
                                                        if(!tKondisi.equals("NULL")){
                                                            char kondisi = tKondisi.charAt(0);
                                                            DaftarPerGenre.get(nomor).kondisi = kondisi;
                                                        }
                                                        break;
                                                    case "Tersedia":
                                                        String tersedia = (String) JOptionPane.showInputDialog(null, "Ketersedian Sebelum:" + DaftarPerGenre.get(nomor).tersedia + "\nMenjadi:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionTersedia, optionTersedia[0]);//
                                                        tersedia = checkIfNull(tersedia);
                                                        if(tersedia.equals("Tersedia")){
                                                            DaftarPerGenre.get(nomor).tersedia = true;
                                                        } else {
                                                            DaftarPerGenre.get(nomor).tersedia = false;
                                                        }
                                                        break;
                                                }
                                            } else {
                                                //Gagal Pilih Kendaraan
                                                JOptionPane.showMessageDialog(null, pesanGagalPilihKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        }
                                    } else {
                                        //Gagal Pilih Genre
                                        JOptionPane.showMessageDialog(null, pesanGagalPilihGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    //Gagal Pilih Merk
                                    JOptionPane.showMessageDialog(null, pesanGagalPilihMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            //Hegya
                            //Nathan
                            case "Laporan Kendaraan":
                                String merk = JOptionPane.showInputDialog(null, listMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                merk = checkIfNull(merk);
                                if ((DaftarMerk.containsKey(merk)) && (!merk.equals("NULL"))) {
                                    //Berhasil Pilih Merk
                                    HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(merk);
                                    String listGenre = "Genre:\n";
                                    for (HashMap.Entry<String, ArrayList<Kendaraan>> set : DaftarPerMerk.entrySet()) {
                                        listGenre += set.getKey() + "\n";
                                    }
                                    listGenre += "Pilihan Anda: ";
                                    String genre = JOptionPane.showInputDialog(null, listGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                    genre = checkIfNull(genre);
                                    if ((DaftarPerMerk.containsKey(genre)) && (!DaftarPerMerk.equals("NULL"))) {
                                        //Berhasil Pilih Genre
                                        ArrayList<Kendaraan> DaftarPerGenre = DaftarPerMerk.get(genre);
                                        String listKendaraan = "Kendaraan:\n";
                                        for (int noUrut = 0; noUrut < DaftarPerGenre.size(); noUrut++) {
                                            listKendaraan += "No Urut          : " + noUrut + "\nModel             : " + DaftarPerGenre.get(noUrut).model + "\nKondisi          : " + DaftarPerGenre.get(noUrut).kondisi + "\nTahun Buat   : " + DaftarPerGenre.get(noUrut).tahunBuat + "\nNo Plat           : " + DaftarPerGenre.get(noUrut).noPlat + "\nTersedia       : " + DaftarPerGenre.get(noUrut).tersedia + "\n\n";
                                        }
                                        JOptionPane.showMessageDialog(null, listKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        //Gagal Pilih Genre
                                        JOptionPane.showMessageDialog(null, pesanGagalPilihGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    //Gagal Pilih Merk
                                    JOptionPane.showMessageDialog(null, pesanGagalPilihMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            case "Laporan Keuangan":
                                int i = 0;
                                int max = 0;
                                String laporanKeuangan = "Laporan Keuangan\n" + namaPT + "\n\nDaftar Transasksi:\nNo.|Username|Total\n";
                                while(i<DaftarTransaksi.size()){
                                    max += DaftarTransaksi.get(i).total;
                                    laporanKeuangan +=  (i+1) +".|" + DaftarTransaksi.get(i).username + "|" + DaftarTransaksi.get(i).total + "\n\n";
                                    i++;
                                }
                                
                                laporanKeuangan += "\nTotal Jumlah Transaksi: " + DaftarTransaksi.size() + "\nTotal Pendapatan: " + max; 
                                JOptionPane.showMessageDialog(null, laporanKeuangan, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                break;
                            case "Laporan Resmi":
                                String laporanResmi = "Laporan Resmi\n" + namaPT + "\n\nKendaraan:";
                                int total = 0;
                                int x = 0;
                                while(x<DaftarTransaksi.size()){
                                    total += DaftarTransaksi.get(x).total;
                                    x++;
                                }
                                
                                
                                for (HashMap.Entry<String, HashMap<String, ArrayList<Kendaraan>>> set : DaftarMerk.entrySet()) {
                                    laporanResmi += "   "+set.getKey() + ":\n";
                                    HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(set.getKey());
                                    for (HashMap.Entry<String, ArrayList<Kendaraan>> set2 : DaftarPerMerk.entrySet()) {
                                        laporanResmi += "      " + set2.getKey() + ":\n";
                                        ArrayList<Kendaraan> DaftarPerGenre = DaftarPerMerk.get(set2.getKey());
                                        for (int noUrut = 0; noUrut < DaftarPerGenre.size(); noUrut++) {
                                            laporanResmi += "         " + DaftarPerGenre.get(noUrut).model + "\n";
                                            laporanResmi += "         " + DaftarPerGenre.get(noUrut).noPlat + "\n\n";
                                        }
                                    }
                                }
                                
                                laporanResmi += "\n\n\nTotal Jumlah Transaksi: " + DaftarTransaksi.size() + "\nTotal Pendapatan: " + total; 
                                JOptionPane.showMessageDialog(null, laporanResmi, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                break;
                            //Nathan
                        }
                        admin = (String) JOptionPane.showInputDialog(null, "Admin:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionAdmin, optionAdmin[2]);
                        admin = checkIfNull(admin);
                    }
                    
                    break;
                //Pelanggan_...
                case "Pelanggan":
                    Akun newAkun = new Akun();
                    String pelanggan = (String) JOptionPane.showInputDialog(null, "Pelanggan:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionPelanggan, optionPelanggan[0]);//
                    pelanggan = checkIfNull(pelanggan);
                    while ((!pelanggan.equals("Keluar")) && (!pelanggan.equals("NULL"))) {
                        switch (pelanggan) {
                            //Masuk_...
                            
                            case "Masuk":
                                //Coba masuk dengan username: Admin & password: admin
                                //Memasukkan username
                                String usernameMasuk = JOptionPane.showInputDialog(null, "Masuk Akun\nUsername:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                usernameMasuk = checkIfNull(usernameMasuk);
                                //Mencari akun dengan usernameMasuk
                                if ((DaftarAkun.containsKey(usernameMasuk)) && (!usernameMasuk.equals("NULL"))) {
                                    //Menemukan Akun
                                    Akun akunMasuk = (Akun) DaftarAkun.get(usernameMasuk);
                                    int percobaan = 0;
                                    String passwordMasuk = JOptionPane.showInputDialog(null, "Masuk Akun\nPassword:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                    passwordMasuk = checkIfNull(passwordMasuk);
                                    //Memeriksa PasswordMasuk
                                    //Percobaan sampai 3 kali
                                    if(!passwordMasuk.equals("NULL")){
                                        while (percobaan < 3) {
                                            if (akunMasuk.password.equals(passwordMasuk)) {
                                                //Berhasil Masuk Akun...
                                                JOptionPane.showMessageDialog(null, pesanBerhasilMasuk + akunMasuk.nama, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                //Juan...
                                                boolean exit = false;
                                                while (!exit) {
                                                    String menuPelanggan = JOptionPane.showInputDialog(null, "Masukkan menu 1/2\n1. Pesan Kendaraan \n2. Selesai sewa \n3. Daftar Membership \n4. Log Out", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                    menuPelanggan = checkIfNull(menuPelanggan);
                                                    if(!menuPelanggan.equals("NULL")){
                                                        switch (menuPelanggan) {
                                                            case "1":

                                                                if (akunMasuk.genreKendaraan == null) {
                                                                    String listMerk = "";
                                                                    for (HashMap.Entry<String, HashMap<String, ArrayList<Kendaraan>>> set : DaftarMerk.entrySet()) {
                                                                        listMerk += set.getKey() + "\n";
                                                                    }
                                                                    String pilihMerk = JOptionPane.showInputDialog(null, "Masukkan pilihan : \n" + listMerk, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                                    pilihMerk = checkIfNull(pilihMerk);
                                                                    if ((DaftarMerk.containsKey(pilihMerk)) && (!pilihMerk.equals("NULL"))) {
                                                                        //Berhasil Pilih Merk
                                                                        HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(pilihMerk);
                                                                        String listGenre = "Genre:\n";
                                                                        for (HashMap.Entry<String, ArrayList<Kendaraan>> set : DaftarPerMerk.entrySet()) {
                                                                            listGenre += set.getKey() + "\n";
                                                                        }
                                                                        listGenre += "Pilihan Anda: ";
                                                                        String genre = JOptionPane.showInputDialog(null, listGenre, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                                        genre = checkIfNull(genre);
                                                                        if ((DaftarPerMerk.containsKey(genre)) && (!genre.equals("NULL"))) {
                                                                            //Berhasil Pilih Genre
                                                                            ArrayList<Kendaraan> DaftarPerGenre = DaftarPerMerk.get(genre);
                                                                            String listKendaraan = "Kendaraan:\n";
                                                                            for (int noUrut = 0; noUrut < DaftarPerGenre.size(); noUrut++) {
                                                                                listKendaraan += "No Urut               : " + noUrut + "\nModel                  : " + DaftarPerGenre.get(noUrut).model + "\nKondisi               : " + DaftarPerGenre.get(noUrut).kondisi + "\nTahun Buat       : " + DaftarPerGenre.get(noUrut).tahunBuat + "\nNo Plat               : " + DaftarPerGenre.get(noUrut).noPlat + "\nHarga PerHari  : " + DaftarPerGenre.get(noUrut).hargaPerHari + "\nTersedia            : " + DaftarPerGenre.get(noUrut).tersedia + "\n\n";
                                                                            }
                                                                            //input pilihan
                                                                            int pilihan = 0;
                                                                            boolean cekIndex = false;
                                                                            while (!cekIndex) {
                                                                                String pilihann = JOptionPane.showInputDialog(null, "Masukkan No.Urut pilihan : \n" + listKendaraan, namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                                                pilihann = checkIfNull(pilihann);
                                                                                if ((pilihann.equals("")) || (pilihann.equals("NULL"))) {
                                                                                    JOptionPane.showMessageDialog(null, "Null / Isi dengan No.Urut yang benar", namaPT, JOptionPane.WARNING_MESSAGE);
                                                                                } else {
                                                                                    pilihan = Integer.parseInt(pilihann);
                                                                                    if (pilihan >= 0 && pilihan < DaftarPerGenre.size()) {
                                                                                        cekIndex = true;
                                                                                    }
                                                                                }
                                                                            }

                                                                            //cek status mobil
                                                                            if (!DaftarPerGenre.get(pilihan).tersedia) {
                                                                                JOptionPane.showMessageDialog(null, "Mobil tidak tersedia saat ini", namaPT, JOptionPane.WARNING_MESSAGE);
                                                                            } else {
                                                                                String temp= JOptionPane.showInputDialog(null, "Lama sewa (jam) : ", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                                                temp = checkIfNull(temp);
                                                                                if(!temp.equals("NULL")){
                                                                                    int lamaSewa = Integer.parseInt(temp);
                                                                                    int seriMobil = DaftarPerGenre.get(pilihan).noSeri;
                                                                                    String usernameUser = usernameMasuk;
                                                                                    String namaUser = akunMasuk.nama;
                                                                                    String mobilPilihan = DaftarPerGenre.get(pilihan).model;
                                                                                    int benefitMember = 0;
                                                                                    if (akunMasuk.member) {
                                                                                        benefitMember = 50000;
                                                                                    }

                                                                                    Transaksi transaksi = new Transaksi();
                                                                                    //hitung diskon
                                                                                    int diskon = transaksi.hitungDiskon(lamaSewa, DaftarPerGenre.get(pilihan).hargaPerHari);
                                                                                    int total = (DaftarPerGenre.get(pilihan).hargaPerHari * lamaSewa) - diskon - benefitMember;

                                                                                    String textKonfirmasi = "Nama              : " + akunMasuk.nama + "\nSeri Mobil      : " + seriMobil + "\nModel Mobil  : " + mobilPilihan + "\nMasa sewa   : " + lamaSewa + " Jam" + "\nDiskon           : " + diskon + "\nMembership: " + benefitMember + "\nTotal bayar   : " + total;
                                                                                    int konfirmasi = JOptionPane.showConfirmDialog(null, textKonfirmasi, "Konfirmasi Pesanan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);//
                                                                                    //konfirmasi = checkIntNull(konfirmasi);
                                                                                    if (konfirmasi == JOptionPane.YES_OPTION) {
                                                                                        JOptionPane.showMessageDialog(null, "Pesanan dikonfirmasi", namaPT, JOptionPane.INFORMATION_MESSAGE);

                                                                                        //pembayaran
                                                                                        boolean bayar = false;
                                                                                        while (!bayar) {
                                                                                            String pembyrn = JOptionPane.showInputDialog(null, "Bayar sejumlah : " + total, "Pembayaran", JOptionPane.INFORMATION_MESSAGE);//
                                                                                            pembyrn = checkIfNull(pembyrn);
                                                                                            if(!pembyrn.equals("NULL")){
                                                                                                if (pembyrn.equals("")) {
                                                                                                    JOptionPane.showMessageDialog(null, "Masukkan uang sesuai jumlah", "Pembayaran", JOptionPane.WARNING_MESSAGE);
                                                                                                }
                                                                                                    int pembayaran = Integer.parseInt(pembyrn);
                                                                                                    if (pembayaran < total) {
                                                                                                        JOptionPane.showMessageDialog(null, "Uang tidak cukup", "Pembayaran", JOptionPane.WARNING_MESSAGE);
                                                                                                    } else if (pembayaran >= total) {
                                                                                                        int kembalian = pembayaran - total;
                                                                                                        JOptionPane.showMessageDialog(null, "Pembayaran diselesaikan \nKembalian uang : " + kembalian, "Pembayaran", JOptionPane.INFORMATION_MESSAGE);
                                                                                                        bayar = true;
                                                                                                    }
                                                                                                
                                                                                            }
                                                                                        }
                                                                                        //pesanan di masukkan ke class akun
                                                                                        newAkun.sewa(pilihMerk, genre, pilihan);
                                                                                        //ubah status class kendaraan mobil menjadi false
                                                                                        DaftarPerGenre.get(pilihan).boolTerseedia(false);
                                                                                        //masukkan ke class tranksaksi
                                                                                        transaksi = new Transaksi(seriMobil, usernameUser, namaUser, mobilPilihan, lamaSewa, diskon, total);
                                                                                        //masukkan ke linkedlist tranksaksis
                                                                                        DaftarTransaksi.add(transaksi);

                                                                                    } else {
                                                                                        JOptionPane.showMessageDialog(null, "Pesanan Dibatalkan", namaPT, JOptionPane.WARNING_MESSAGE);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            //Gagal Pilih Genre
                                                                            JOptionPane.showMessageDialog(null, "Genre Invalid", namaPT, JOptionPane.WARNING_MESSAGE);
                                                                        }
                                                                    } else {
                                                                        //Gagal Pilih Merk
                                                                        JOptionPane.showMessageDialog(null, "Merk Invalid", namaPT, JOptionPane.WARNING_MESSAGE);
                                                                    }
                                                                } else {
                                                                    JOptionPane.showMessageDialog(null, "Sewa mobil anda masih berlangsung", namaPT, JOptionPane.WARNING_MESSAGE);
                                                                }

                                                                break;
                                                            case "2":
                                                                if (newAkun.genreKendaraan == null) {
                                                                    JOptionPane.showMessageDialog(null, "Belum ada mobil yang disewa", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                                } else {
                                                                    HashMap<String, ArrayList<Kendaraan>> DaftarPerMerk = DaftarMerk.get(akunMasuk.merkKendaraan);
                                                                    ArrayList<Kendaraan> DaftarMobil = DaftarPerMerk.get(akunMasuk.genreKendaraan);
                                                                    String textSewa = "Nama User            : " + akunMasuk.nama + "\nMerk Kendaraan  : " + akunMasuk.merkKendaraan + "\nGenre Kendaraan : " + akunMasuk.genreKendaraan + "\nModel Kendaraan : " + DaftarMobil.get(akunMasuk.indeksKendaraan).model;
                                                                    int endSewa = JOptionPane.showConfirmDialog(null, textSewa, "Selesaikan sewa", JOptionPane.INFORMATION_MESSAGE);//
                                                                    
                                                                    //endSewa = checkIntNull(endSewa);
                                                                    if (endSewa == JOptionPane.YES_OPTION) {
                                                                        //class akun sewa menjadi kosong
                                                                        newAkun.sewaSelesai();
                                                                        //ubah status class kendaraan mobil menjadi false
                                                                        DaftarMobil.get(akunMasuk.indeksKendaraan).boolTerseedia(true);

                                                                        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Memakai Layanan Kami >_<", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                                    } else {
                                                                        JOptionPane.showMessageDialog(null, "Penyelesaian Sewa Dibatalkan", "Selesaikan sewa", JOptionPane.WARNING_MESSAGE);
                                                                    }
                                                                }
                                                                break;
                                                            case "3":
                                                                if (!newAkun.member) {
                                                                    int daftarMember = JOptionPane.showConfirmDialog(null, "Konfirmasi daftar dengan biaya " + akunMasuk.hargaMember, "Daftar Membership", JOptionPane.INFORMATION_MESSAGE);
                                                                    //daftarMember = checkIntNull(daftarMember);
                                                                    if (daftarMember == JOptionPane.YES_OPTION) {
                                                                        String bayarMem = JOptionPane.showInputDialog(null, "Masukkan uang sejumlah : " + akunMasuk.hargaMember, "Daftar Membership", JOptionPane.INFORMATION_MESSAGE);
                                                                        //bayarMem = checkIfNull(bayarMem);
                                                                        if ((bayarMem.equals("")) && (!bayarMem.equals("NULL"))) {
                                                                            JOptionPane.showMessageDialog(null, "Isi biaya terlebih dahulu \nDaftar dibatalkan!", "Daftar Membership", JOptionPane.WARNING_MESSAGE);
                                                                        } else {
                                                                            //parse to Integer
                                                                            int bayarMember = Integer.parseInt(bayarMem);
                                                                            if (bayarMember < akunMasuk.hargaMember) {
                                                                                JOptionPane.showMessageDialog(null, "Uang tidak mencukupi syarat \nPembayaran dibatalkan", "Daftar Membership", JOptionPane.WARNING_MESSAGE);
                                                                            } else if (bayarMember > akunMasuk.hargaMember) {
                                                                                int kembalian = 0;
                                                                                kembalian = bayarMember - akunMasuk.hargaMember;
                                                                                JOptionPane.showMessageDialog(null, "pembayaran selesai \nKembalian : " + kembalian);
                                                                                akunMasuk.daftarMember();
                                                                            } else {
                                                                                JOptionPane.showMessageDialog(null, "Pembayaran selesai", "Daftar Membership", JOptionPane.INFORMATION_MESSAGE);
                                                                                akunMasuk.daftarMember();
                                                                            }
                                                                        }

                                                                    } else {
                                                                        JOptionPane.showMessageDialog(null, "Dibatalkan", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                                    }
                                                                } else {
                                                                    JOptionPane.showMessageDialog(null, "Anda sudah membership", namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                                }
                                                                break;
                                                            case "4":
                                                                exit = true;
                                                                break;
                                                            default:
                                                                JOptionPane.showMessageDialog(null, "Menu Invalid", namaPT, JOptionPane.WARNING_MESSAGE);

                                                        }
                                                    }
                                                }
                                                //Pesan Kendaraan => Ambil Kendaraan
                                                //Balikan Kendaraan    
                                                //Daftar Membership
                                                //Juan...
                                                //Berhasil Masuk Akun...
                                                percobaan = 3;
                                            } else {
                                                JOptionPane.showMessageDialog(null, pesanGagalMasuk2, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                percobaan++;
                                                passwordMasuk = JOptionPane.showInputDialog(null, "Masuk Akun\nPassword:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                passwordMasuk = checkIfNull(passwordMasuk);
                                            }
                                        }
                                }
                                } else {
                                    //PENGUMUMAN
                                    //Gagal Masuk Akun
                                    JOptionPane.showMessageDialog(null, pesanGagalMasuk1, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            //Registrasi_SELESAI

                            case "Registrasi":
                                //Tambah Membership...(Membership Belum)
                                
                                String usernameRegistrasi = JOptionPane.showInputDialog(null, "Registrasi Akun\nUsername:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                usernameRegistrasi = checkIfNull(usernameRegistrasi);
                                if ((!DaftarAkun.containsKey(usernameRegistrasi)) && (!usernameRegistrasi.equals("NULL"))) {
                                    String passwordRegistrasi = JOptionPane.showInputDialog(null, "Registrasi Akun\nPassword:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                    passwordRegistrasi = checkIfNull(passwordRegistrasi);
                                    if ((!passwordRegistrasi.equals("")) && (!passwordRegistrasi.equals("NULL"))) {
                                        String namaRegistrasi = JOptionPane.showInputDialog(null, "Registrasi Akun\nNama Lengkap:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                        namaRegistrasi = checkIfNull(namaRegistrasi);
                                        if ((!namaRegistrasi.equals("")) && (!namaRegistrasi.equals("NULL"))) {
                                            String emailRegistrasi = JOptionPane.showInputDialog(null, "Registrasi Akun\nE-Mail:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                            emailRegistrasi = checkIfNull(emailRegistrasi);
                                            if ((!emailRegistrasi.equals("")) && (!emailRegistrasi.equals("NULL"))) {
                                                String nikKTPRegistrasi = JOptionPane.showInputDialog(null, "Registrasi Akun\nNIK:", namaPT, JOptionPane.INFORMATION_MESSAGE);//
                                                nikKTPRegistrasi = checkIfNull(nikKTPRegistrasi);
                                                if ((!nikKTPRegistrasi.equals("")) && (!nikKTPRegistrasi.equals("NULL"))) {
                                                    newAkun = new Akun(usernameRegistrasi, passwordRegistrasi, namaRegistrasi, emailRegistrasi, nikKTPRegistrasi);
                                                    DaftarAkun.put(usernameRegistrasi, newAkun);
                                                    JOptionPane.showMessageDialog(null, pesanBerhasilRegistrasi, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                } else {
                                                    JOptionPane.showMessageDialog(null, pesanGagalRegistrasi2, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, pesanGagalRegistrasi2, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, pesanGagalRegistrasi2, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, pesanGagalRegistrasi2, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } else {
                                    //Gagal Buat Akun Baru
                                    JOptionPane.showMessageDialog(null, pesanGagalRegistrasi1, namaPT, JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                        }

                        pelanggan = checkIfNull((String) JOptionPane.showInputDialog(null, "Pelanggan:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionPelanggan, optionPelanggan[0]));
                    }
                    break;
            }

            user = (String) JOptionPane.showInputDialog(null, "User:", namaPT, JOptionPane.QUESTION_MESSAGE, null, optionUser, optionUser[1]);
            user = checkIfNull(user);
        }
        
        JOptionPane.showMessageDialog(null, "Terima Kasih \nSampai Jumpa!", namaPT, JOptionPane.QUESTION_MESSAGE);
        
    }

}
