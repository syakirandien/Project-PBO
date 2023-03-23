/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */

public class BadanHukum {
    int kode;
    String nama;
    
    public BadanHukum() {
    }
    
    public BadanHukum(int kode) throws Exception {
        if (kode > 10 | kode < 0) {
            throw new Exception("");
        } else {
            this.kode = kode;
            this.nama = getNama();
        }
    }

    public int getKode() {
        return kode;
    }

    public String getNama(){
            switch (kode){
                case 1 ->{
                    nama = ("Perusahaan Negara(PN)");
                }
                case 2 ->{
                    nama = ("Perusahaan Daerah (PD)");
                }
                case 3 ->{
                    nama = ("Persero");
                }
                case 4 ->{
                    nama = ("Perum");
                }
                case 5 ->{
                    nama = ("Perseroan Terbatas(PT)");
                }
                case 6 ->{
                    nama = ("Naamloze Vennootschap(NV)");
                }
                case 7 ->{
                    nama = ("Commanditaire Venootschap (CV)");
                }
                case 8 ->{
                    nama = ("Firma");
                }
                case 9 ->{
                    nama = ("Koperasi/KUD");
                }
                case 10 ->{
                    nama = ("Yayasan");
                }

                default -> {
                    nama = "Key Tidak Ditemukan";
                }
            }
            
        return nama;
    }

    @Override
    public String toString() {
        return "\n<Keterangan Badan Hukum>" + "\nKode: " + kode + "\nNama: " + nama;
    }

}
