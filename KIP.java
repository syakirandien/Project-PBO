/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS
 */
public class KIP {
    private String kodeProv;
    private String kodeKab;
    private String kodeKec;
    private String KJU;
    private String noUrutKab;

    public KIP(String kodeProv, String kodeKab, String kodeKec, String KJU, String noUrutKab) throws Exception {
        if((Integer.parseInt(kodeProv) > 0) &&(Integer.parseInt(kodeProv) < 39)&&(kodeProv.matches("^[0-9]+")==true)){
            this.kodeProv=kodeProv;
            if (kodeKab.matches("[^0-9]")) {
                throw new Exception("");
            } 
            else {
                this.kodeKab = kodeKab;
                if (kodeKec.matches("[^0-9]")) {
                    throw new Exception("");
                } 
                else {
                    this.kodeKec = kodeKec;
                    if (KJU.matches("[^0-9]")) {
                        throw new Exception("");
                    } 
                    else {
                        this.KJU = KJU;
                        if (noUrutKab.matches("[^0-9]")) {
                            throw new Exception("");
                        } 
                        else {
                            this.noUrutKab = noUrutKab;
                        }
                    }
                }
            }
        }
        else{
            throw new Exception("");
        }
   
    }

    public KIP() {
    }

    public String getKodeProv() {
        return kodeProv;
    }

    public String getKodeKab() {
        return kodeKab;
    }

    public String getKodeKec() {
        return kodeKec;
    }

    public String getKJU() {
        return KJU;
    }

    public String getNoUrutKab() {
        return noUrutKab;
    }

    // public void setKodeProv(String kodeProv) {
    //     this.kodeProv = kodeProv;
    // }

    // public void setKodeKab(String kodeKab) {
    //     this.kodeKab = kodeKab;
    // }

    // public void setKodeKec(String kodeKec) {
    //     this.kodeKec = kodeKec;
    // }

    // public void setKJU(String KJU) {
    //     this.KJU = KJU;
    // }

    // public void setNoUrutKab(String noUrutKab) {
    //     this.noUrutKab = noUrutKab;
    // }

    @Override
    public String toString() {
        return "\n<Keterangan Kode Identitas Perusahaan>" + 
                "\nKode Provinsi\t: " + kodeProv + 
                "\nKode Kabupaten\t: " + kodeKab + 
                "\nKode Kecamatan\t: " + kodeKec + 
                "\nKJU\t\t: " + KJU + 
                "\nNoUrutKab\t: " + noUrutKab;
    }
    
    
}
