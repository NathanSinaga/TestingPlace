/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingplace;

import java.util.Scanner;

/**
 *
 * @author Nathan Sinaga
 */
public class Fibonachi {

    public static int fibonachi(int urutan, int prev1, int prev2){
        System.out.print(prev2 + " ");
        if(urutan == 1){
            return prev2;
        } else if (prev2 == 0){
            return fibonachi(urutan-1, 0, 1);
        } else {
            return fibonachi(urutan-1, prev2, prev2+prev1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean cari = true;
        while(cari){
            System.out.println("Urutan Fibonachi Ke?: (int)");
            int urutan = scan.nextInt();
            
            System.out.println("Bilangan yang anda cari adalah: " + fibonachi(urutan, 0,0));
            System.out.println("Masih Mau Mencari? (true/false)");
            cari = scan.nextBoolean();
        }
        
        System.out.println("Sampai Jumpa!!!");
    }
    
}
