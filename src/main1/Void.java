/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class Void {
  int Siram;

void isi(){ //method isi
    Scanner input = new Scanner (System.in);
    System.out.println("Siram Kurang dari 1 kali                        = Sedih");
    System.out.println("Siram sama dengan 1 kali                        = Bahagia");
    System.out.println("Siram Lebih dari 1 kali atau sama dengan 3 kali = Sangat Bahagia");
    System.out.println("Siram lebih dari 3 kali                         = Kebanyakan Tuan");
    System.out.print("Berapa kali anda menyiram Bunga dalam ssehari : ");
    Siram = input.nextInt();
    // user menginput kan data

            }
void tampil(){ //method tampil dengan sistem percabangan dan perulangan
    System.out.println("=============================================");
    System.out.println("Saya menyiram bunga " +Siram+ " kali sehari");
        if (Siram <= 0)
    
        for (int i = 0; i < 5; i++) {
            System.out.println("Sedih");
        }
        else{
    if (Siram <= 1)
        for (int i = 0; i < 5; i++) {
                System.out.println("Bahagia");    
            }
    else{
        
    if (Siram <= 3)
        for (int i = 0; i < 5; i++) {
            System.out.println("Sangat Bahagia");
        }
    else{
        for (int i = 0; i < 5; i++) {
            System.out.println("Kebanyakan Tuan");  
        }
    
    }
            }
}
}
}
