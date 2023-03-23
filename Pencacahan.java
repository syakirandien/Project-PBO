/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */


public class Pencacahan {
    private Keaktifan aktif;
    private StatusKunjungan statuskunjungan;


    public Pencacahan(Keaktifan aktif, StatusKunjungan statuskunjungan) {
        this.aktif = aktif;
        this.statuskunjungan = statuskunjungan;
    }

    public Pencacahan(Keaktifan aktif) {
        this.aktif = aktif;
    }

    public Pencacahan(StatusKunjungan statuskunjungan) {
        this.statuskunjungan = statuskunjungan;
    }

    public Pencacahan() {
    }
    
    public Keaktifan getKeaktifan() {
        return aktif;
    }

    public StatusKunjungan getStatuskunjungan() {
        return statuskunjungan;
    }

    @Override
    public String toString() {
        return "\n<Keterangan Pencacahan>" + 
                "\nKeaktifan\t: " + aktif.getValue() + 
                "\nStatus Kunjungan: " + statuskunjungan.getValue();
    }
    
}
