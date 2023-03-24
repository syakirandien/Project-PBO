public class Company {
    // Properties
    private KIP kip; //KIP : Kode Identitas Perusahaan
    private String namaPerusahaan;
    private String alamat;
    private String noTelp;
    private String noFax;
    private BadanHukum badanHukum;
    private JUU jenisUsaha;
    private SubSektor subSektor; 
    private DPP pencacahan;

    public company (KIP kip, String namaPerusahaan, String alamat, String noTelp, String noFax, BadanHukum badanHukum, 
    JUU jenisUsaha, SubSektor subSektor, DPP pencacahan) {
        this.kip = kip;
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.noFax = noFax;
        this.badanHukum = badanHukum;
        this.jenisUsaha = jenisUsaha;
        this.subSektor = subSektor;
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
        return this.alamat;
    }

    public void setAlamatPerusahaan(String alamat) {
        this.alamat = alamat;
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

    public DPP getDPP() {
        return this.pencacahan;
    }

    public void setDPP(DPP pencacahan) {
        this.pencacahan = pencacahan;
    }

    public SubSektor getSubsek() {
        return this.subSektor;
    }

    public void setSubsek(SubSektor subSektor) {
        this.subSektor = subSektor;
    }

    public JUU getJUU() {
        return this.jenisUsaha;
    }

    public void setJUU(JUU jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    public String toString() {
        System.out.println("================================================");
        return 
              "\nKIP                   : "+getKIP()+
              "\nNama Perusahaan       : "+getNamaPerusahaan()+
              "\nAlamat                : "+getAlamatPerusahaan()+
              "\nTelepon               : "+getNoTelp()+
              "\nFax                   : "+getNoFax()+
              "\nBentuk Badan Hukum    : "+getBadanHukum().getValue()+
              "\nJenis Usaha Utama     : "+getJUU().getValue()+
              "\nSubsektor             : "+getSubsek().getKeyValueSet()+
              "\nPencacahan DPP        : "+getDPP().getKeyValueSet()+;
   }

}
