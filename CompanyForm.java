//package mform.form;

import mform.entity.Company;

/**
 * @author Kelompok 7 2KS6
 * 
 * Seizra Aulia Salsabila
 * Shofiatul Najmi
 * Soraya Afkarina Mumtazah	
 * Sultan Hadi Prabowo
 * Syakira Rizky Andini
 * Yoga Pratama
 */

public class CompanyForm extends Form {
    private String kodeProv;
    private String namaProv;
    private String kodeKab;
    private String namaKab;
    private String periodeData;
    private Company company;
    private int i = 1;

    public String getKodeProv() {
        return this.kodeProv;
    }

    public void setKodeProv(String kodeProv) {
        this.kodeProv = kodeProv;
    }

    public String getNamaProv() {
        return this.namaProv;
    }

    public void setNamaProv(String namaProv) {
        this.namaProv = namaProv;
    }

    public String getKodeKab() {
        return this.kodeKab;
    }

    public void setKodeKab(String kodeKab) {
        this.kodeKab = kodeKab;
    }

    public String getNamaKab() {
        return this.namaKab;
    }

    public void setNamaKab(String namaKab) {
        this.namaKab = namaKab;
    }

    public String getPeriodeData() {
        return this.periodeData;
    }

    public void setPeriodeData(String periodeData) {
        this.periodeData = periodeData;
    }

    public Company getCompany() {
        return this.company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean validate(){
        return true;
    }
    /*public boolean validate() {
        //Validasi objek company tersedia
        if (company == null) {
            super.addErrorMesssages("Objek Perusahaan tidak tersedia. Silakan buat terlebih dahulu!");
        }

        if (company.getKIP() == null) {
            super.addErrorMesssages("Kode Identitas Perusahaan tidak boleh kosong");
        }

        //Validasi panjang kodeProv, kodeKab, kodeKec
        if (this.getKodeProv().length() != 2 || this.getKodeKab().length() != 2 || company.getKIP().getKodeKec().length() != 3) {
            super.addErrorMesssages("Panjang kode daerah tidak sesuai");
        }

        //Validasi kode harus berupa angka
        if (!(this.getKodeProv().matches("[0-9]+"))) {
            super.addErrorMesssages("Kode provinsi harus berupa angka");
        }

        if (!(this.getKodeKab().matches("[0-9]+"))) {
            super.addErrorMesssages("Kode kabupaten harus berupa angka");
        }

        if (!(company.getKIP().getKodeKec().matches("[0-9]+"))) {
            super.addErrorMesssages("Kode kecamatan harus berupa angka");
        }

        //Validasi isKonfirm
        if (company.isKonfirm() == 0) {
            company.setStatus(0);
        }

        //Validasi input jenis usaha utama harus sesuai dengan KJU   
        if (!(company.getInputUsahaUtama().contains(company.getKIP().getKodeKJU()))) {
            super.addErrorMesssages("Kode KJU harus sesuai kode usaha utama");
        }
        
        //Validasi usaha utama apakah sudah sesuai dengan usaha utama yang sudah tersedia
        boolean check = false;
        
        for (String j : company.getUsahaUtama().keySet()) {
            if (j.equals(company.getInputUsahaUtama())) {
                check = true;
                break;
            }
        }

        if (check == false) {
                 super.addErrorMesssages("Jenis usaha utama tidak tersedia");
        }

        //validasi subsektor jika subsektor tanaman pangan, hortikultura, peternakan, kehutanan dan
        //perikanan harus memiliki nilai 0 atau 1, jika tidak maka inputan tidak valid
        for (String i: company.getSubsek().keySet()) {
            if (i.equals("Perkebunan")) {
                continue;
            } else {
                if(! (company.getSubsek().get(i).equals("1") || company.getSubsek().get(i).equals("0"))) {
                    super.addErrorMesssages("Subsektor tidak tersedia");
                }
            }
        }

        return super.getErrorMessages().isEmpty();
    }*/

    @Override
    public boolean save() {
        System.out.println("Save data...");
        return true;
    }
    
    @Override
    public void print() {
        System.err.println("Perusahaan ke - " + i);
        i++;
        System.out.println("-".repeat(50));
        System.out.println("Kode Provinsi \t\t: " + company.getKIP().getKodeProv());
        System.out.println("Kode Kabupaten \t\t: " + company.getKIP().getKodeKab());
        System.out.println("Kode Kecamatan \t\t: " + company.getKIP().getKodeKec());
        System.out.println("Kode KJU \t\t: " + company.getKIP().getKodeKJU());
        System.out.println("No Urut di Kab/Kota \t: " + company.getKIP().getNoUrutKab());
        System.out.println("-".repeat(50));
        System.out.println("Nama Perusahaan \t: " + company.getNamaPerusahaan());
        System.out.println("Alamat Perusahaan \t: " + company.getAlamatPerusahaan());
        System.out.println("Nomor Telepon \t\t: " + company.getNoTelp());
        System.out.println("Nomor Faksimile \t: " + company.getNoFax());
        System.out.println("Bentuk Badan Hukum \t: " + company.getBadanHukum().getValue()
            + " (" + company.getBadanHukum().getNama() + ")");
        
        System.out.println("Pencacahan dengan DPP \t: " + company.getDPP().getKeyValueSet());
        System.out.println("-".repeat(50));
        System.out.println("Subsektor");
        //Print Subsektor
        for (String i: company.getSubsek().keyValueSet()) {
                System.out.println(i + " \t\t: " + company.getSubsek().get(i));
        }
        
        System.out.println("Jenis Usaha Utama \t: " + company.getJUU().get(company.getValue()));

        System.out.println("=".repeat(50));
        System.out.println("=".repeat(50));
        System.out.println();
    }

    @Override
    public void reset() {
        this.company = null;
        this.kodeProv = null;
        this.namaProv = null;
        this.kodeKab = null;
        this.namaKab = null;
        this.periodeData = null;

        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public void headerForm() {
        System.out.println("=".repeat(50));
        System.out.println("Company Form");
        System.out.println("=".repeat(50));
        System.out.println("Kode Provinsi \t\t: " + this.getKodeProv());
        System.out.println("Nama Provinsi \t\t: " + this.getNamaProv());
        System.out.println("Kode Kabupaten \t\t: " + this.getKodeKab());
        System.out.println("Nama Kababupaten \t\t: " + this.getNamaKab());
        System.out.println("Periode Data \t\t: " + this.getPeriodeData());
        System.out.println("=".repeat(50));
    }   
}
