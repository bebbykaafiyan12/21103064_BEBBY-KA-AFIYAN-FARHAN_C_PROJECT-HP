/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projecthp;

import java.util.Scanner;

/**
 *
 * @author YUNITA
 */
public class ProjectHP {

    public static void main(String[] args) {
        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone iphone12 = new iPhone();
        Phone SamsungNote = new Samsung();
        Phone OppoA57 = new Oppo();

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);
        PhoneUser bebby = new PhoneUser(iphone12);
        PhoneUser eva = new PhoneUser(SamsungNote);
        PhoneUser caca = new PhoneUser(OppoA57);
        
        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        int aksi; 
        int pilihan;
  
        do{
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[PIlihan Phone :");
            System.out.println("[1] Xiaomi");
            System.out.println("[2] iPhone");
            System.out.println("[3] Samsung");
            System.out.println("[4] Oppo");
            System.out.println("[0] Keluar");
            System.out.println("");
            System.out.println("Silahkan Masukkan Pilihan Anda");
            pilihan = input.nextInt();
            System.out.println("");
            switch (pilihan){
            case 1 :
                do{
                    System.out.println("");
                    System.out.println("Anda Memilih Xiaomi");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Perbesar Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[5] Ganti HP");
                    System.out.println("[0] Keluar");
                    System.out.println("------------------------");
                    System.out.println("Masukkan Pilihan Anda : ");
                    aksi=input.nextInt();
                    switch (aksi){
                        
                    case 1 :
                      dian.turnOnThePhone();
                      break;
                    case 2 :
                      dian.turnOffThePhone();
                      break;
                    case 3 :
                      dian.makePhoneLouder();
                      break;
                    case 4 :
                      dian.makePhoneSilent();
                    case 0 :
                   System.exit(0);
                   break;
                default :
                    System.out.println("");
            }
        }while(aksi != 5);
        break;
        case 2 :
                do{
                    System.out.println("");
                    System.out.println("Anda Memilih iPhone");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Perbesar Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[5] Ganti HP");
                    System.out.println("[0] Keluar");
                    System.out.println("------------------------");
                    System.out.println("Masukkan Pilihan Anda : ");
                    aksi=input.nextInt();
                    switch (aksi){
                        
                    case 1 :
                      bebby.turnOnThePhone();
                      break;
                    case 2 :
                      bebby.turnOffThePhone();
                      break;
                    case 3 :
                      bebby.makePhoneLouder();
                      break;
                    case 4 :
                      bebby.makePhoneSilent();
                    case 0 :
                   System.exit(0);
                   break;
                default :
                    System.out.println("");
            }
        }while(aksi != 5);
        break;
        case 3 :
                do{
                    System.out.println("");
                    System.out.println("Anda Memilih Samsung");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Perbesar Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[5] Ganti HP");
                    System.out.println("[0] Keluar");
                    System.out.println("------------------------");
                    System.out.println("Masukkan Pilihan Anda : ");
                    aksi=input.nextInt();
                    switch (aksi){
                        
                    case 1 :
                      eva.turnOnThePhone();
                      break;
                    case 2 :
                      eva.turnOffThePhone();
                      break;
                    case 3 :
                      eva.makePhoneLouder();
                      break;
                    case 4 :
                      eva.makePhoneSilent();
                    case 0 :
                   System.exit(0);
                   break;
                default :
                    System.out.println("");
            }
        }while(aksi != 5);
        break;
        case 4 :
                do{
                    System.out.println("");
                    System.out.println("Anda Memilih Oppo");
                    System.out.println("[1] Nyalakan HP");
                    System.out.println("[2] Matikan HP");
                    System.out.println("[3] Perbesar Volume");
                    System.out.println("[4] Kecilkan Volume");
                    System.out.println("[5] Ganti HP");
                    System.out.println("[0] Keluar");
                    System.out.println("------------------------");
                    System.out.println("Masukkan Pilihan Anda : ");
                    aksi=input.nextInt();
                    switch (aksi){
                        
                    case 1 :
                      caca.turnOnThePhone();
                      break;
                    case 2 :
                      caca.turnOffThePhone();
                      break;
                    case 3 :
                      caca.makePhoneLouder();
                      break;
                    case 4 :
                      caca.makePhoneSilent();
                    case 0 :
                   System.exit(0);
                   break;
                default :
                    System.out.println("");
            }
        }while(aksi != 5);
        break;
       }
    }while(pilihan != 0);
  }
}
  



 