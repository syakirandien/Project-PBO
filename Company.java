package mform.entity;
import java.util.HashMap;


public class Company {
    // Properties
    private KIP kip; //KIP : Kode Identitas Perusahaan
    private String namaPerusahaan;
    private String alamatPerusahaan;
    private String noTelp;
    private String noFax;
    private BadanHukum badanHukum;
    private JUU jenisUsaha;
    private Subsek subsek; 
    private DPP pencacahan;

    public company (KIP kip, String namaPerusahaan, String alamatPerusahaan, String noTelp, String noFax, BadanHukum badanHukum, 
    JUU jenisUsaha, Subsek subsek, DPP pencacahan) {
        this.kip = kip;
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.noTelp = noTelp;
        this.noFax = noFax;
        this.badanHukum = badanHukum;
        this.jenisUsaha = jenisUsaha;
        this.subsek = subsek;
        this.pencacahan = pencacahan;
    }

    // Method 
    public KIP getKIP() {
        return this.kip;
    }

    public void setKIP(KIP kip) {
        this.kip = kip;
    }

    public String getNamaPerusahaan() {
        return this.namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return this.alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    
    public String getNoFax() {
        return this.noFax;
    }

    public void setNoFax(String noFax) {
        this.noFax = noFax;
    }

    public BadanHukum getBadanHukum() {
        return this.badanHukum;
    }

    public void setBadanHukum(BadanHukum badanHukum) {
        this.badanHukum = badanHukum;
    }

    public BadanHukum getDPP() {
        return this.pencacahan;
    }

    public void setDPP(DPP pencacahan) {
        this.pencacahan = pencacahan;
    }

    public BadanHukum getSubsek() {
        return this.subsek;
    }

    public void setSubsek(Subsek subsek) {
        this.subsek = subsek;
    }

    public BadanHukum getJUU() {
        return this.jenisUsaha;
    }

    public void setJUU(JUU jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    public String toString() {
        System.out.println("================================================");
        return 
              "\nKIP                   : "+getKIP()+
              "\nNama                  : "+getNamaPerusahaan()+
              "\nAlamat                : "+getAlamatPerusahaan()+
              "\nTelepon               : "+getNoTelp()+
              "\nFax                   : "+getNoFax()+
              "\nBentuk Badan Hukum    : "+getBadanHukum().getValue()+
              "\nJenis Usaha Utama     : "+getJUU().getValue()+
              "\nSubsektor             : "+getSubsek().getKeyValueSet()+
              "\nPencacahan DPP        : "+getDPP().getKeyValueSet()+;
   }

}
