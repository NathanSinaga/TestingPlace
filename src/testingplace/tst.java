/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingplace;

/**
 *
 * @author Nathan Sinaga
 */
public class tst {

    public static class Penumpang{
        String nama = "";
        int usia = 0;
        String kotaAsal = "";
        String kotaTujuan = "";
        int biaya = 0;
    }
    
    public static class Kereta{
        int jumlahPenumpang = 0;
        Penumpang[] kursi = new Penumpang[10]; 
    }
    
    public static double hitungDiskon(int usia){
        double diskon = 0;
        if(usia > 60){
            diskon = 0.20;
        } else if(usia > 40){
            diskon = 0.15;
        } else if(usia > 20){
            diskon =  0;
        } else if(usia > 10){
            diskon = 0.20;
        } else {
            diskon = 0.50;
        }
        
        return diskon;
    }
    
    public static int cityStringToIndex(String kota){
        kota.toLowerCase();
        int index = 0;
        switch(kota){
            case "jakarta":
                index = 0;
                break;
            case "bogor":
                index = 1;
                break;
            case "bandung":
                index = 2;
                break;
            case "tangerang":
                index = 3;
                break;
        }
        
        return index;
    }
    
    public static int srcTicketPrice(String in, String out){
        int[][] price = 
        {
            {0, 200000, 250000, 350000},
            {200000, 0, 100000, 200000},
            {250000, 150000,0, 200000},
            {375000, 250000, 150000, 0}
        };
        
        return price[cityStringToIndex(in)][cityStringToIndex(out)];
    }
    
    public static int totalIncome(Kereta kereta){
        int total = 0;
        for(int x = 0; x < kereta.jumlahPenumpang; x++){
            total += kereta.kursi[x].biaya;
        }
        
        return total;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
