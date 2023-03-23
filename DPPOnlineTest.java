/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class DPPOnlineTest {
    public static void main(String[] args){
    boolean quit = false;
    do{
        System.out.print("\033[H\033[2J");
        System.out.println("///Cuma Ngetes///\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("BADAN HUKUM");
        System.out.print("Kode\t: "); 
        
        try{
        int kodeB = scan.nextInt();
        BadanHukum bahu1 = new BadanHukum(kodeB);
        System.out.println(bahu1);
        } catch (Exception e) {
            System.out.println("Input harus berupa angka di rentang 1 - 10");
        }
        
        System.out.println("\nKode Identitas Perusahaan");
        try{
        System.out.print("Kode Provinsi\t: ");
        String k1 = scan.next();
        System.out.print("Kode Kabupaten\t: ");
        String k2 = scan.next();
        System.out.print("Kode Kecamatan\t: ");
        String k3 = scan.next();
        System.out.print("KJU\t\t: ");
        String k4 = scan.next();
        System.out.print("Nomor Urut\t: ");
        String k5 = scan.next();
        KIP kip1 = new KIP(k1, k2, k3, k4, k5);
        System.out.println(kip1);
        } catch (Exception e) {
          System.out.println("""
                             Terjadi Error! Mohon Perhatikan hal berikut: 
                             1. Kode Provinsi harus ada di rentang 1 - 38
                             2. Kode Kabupaten, Kecamatan, KJU, dan Nomor Urut harus berupa Angka""");
        }
        
//        System.out.println("\nKEAKTIFAN");
//        System.out.print("Kode\t: ");
//        try{
//            String a = scan.next();
//            Keaktifan aktif1 = new Keaktifan(a);
//            System.out.println(aktif1);
//        } catch(Exception e){
//            System.out.println("Input Angka dengan Indeks 1 - 9!");
//        }
//
//        System.out.println("\nSTATUS KUNJUNGAN");
//        System.out.print("Kode\t: ");
//        try{
//            String s = scan.next();
//            StatusKunjungan sk1 = new StatusKunjungan(s);
//            System.out.println(sk1);
//        } catch(Exception e){
//            System.out.println("Input Angka dengan Indeks 0 atau 1!");
//        }
        
        System.out.println("\nPENCACAHAN");
        try{
            System.out.println("\n1. KEAKTIFAN");
            System.out.print("Kode\t: ");
            String a = scan.next();
            Keaktifan aktif1 = new Keaktifan(a);
        //    System.out.println(aktif1);
            System.out.println("2. STATUS KUNJUNGAN");
            System.out.print("Kode\t: ");
            String s = scan.next();
            StatusKunjungan sk1 = new StatusKunjungan(s);
        //    System.out.println(sk1);
            Pencacahan p1 = new Pencacahan(aktif1, sk1);
            System.out.println(p1);
        } catch(Exception e){
            System.out.println("Terjadi Kesalahan Input!");
        }
        
        }while(!quit);
    }
    
}
