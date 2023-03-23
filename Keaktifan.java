/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
public class Keaktifan {
    private String key;
    private String value;

    public Keaktifan(String key) throws Exception {
        if (Integer.parseInt(key) >= 10 | Integer.parseInt(key) < 0){
            throw new Exception ("");
        }
        this.key = key;
        this.value = getValue();
    }
    
    public String getKey() {
        return key;
    }

    public String getValue() {
            switch(key){
                case "1" -> {
                    value = ("Aktif");
                }
                case "2" -> {
                    value = ("Tutup Sementara/Tidak Ada Kegiatan");
                }
                case "3" -> {
                    value = ("Belum Berproduksi");
                }
                case "4" -> {
                    value = ("Tidak Bersedia Diwawancarai");
                }
                case "5" -> {
                    value = ("Alih Usaha ke Non Pertanian");
                }
                case "6" -> {
                    value = ("Tutup");
                }
                case "7" -> {
                    value = ("Tidak Ditemukan");
                }
                case "8" -> {
                    value = ("Baru");
                }
                case "9" -> {
                    value = ("Ganda");
                }
                
                default -> {
                    value = ("");
                }
            } 
        return value;
    }

    
    @Override
    public String toString() {
        return "\n<Keterangan Keaktifan>" + 
                "\nKey\t: " + key + 
                "\nValue\t: " + value;
    }
    
}
