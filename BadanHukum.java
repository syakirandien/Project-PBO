public class BadanHukum {
    int kode;
    String nama;
    
    public BadanHukum() {
    }
    
    public BadanHukum(int kode, String nama) throws Exception {
        if (String.valueOf(kode).matches("[^0-9]")) {
            throw new Exception("Error : Kode harus berupa angka");
        } else {
            this.kode = kode;
            if (nama.matches("[^a-z|^A-Z|^ ]")) {
                throw new Exception("Error : Kode harus berupa angka");
            } else {
                this.nama = nama;
            }
        }
    }

    public int getKode() {
        return kode;
    }

    public String getNama() throws Exception {
        try{
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
                    nama = ("7. Commanditaire Venootschap (CV)");
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
            }
        } catch (Exception e){
            System.out.println("Type mismatch");
            throw new Exception("Key tidak valid");
        }
        return nama;
    }

    @Override
    public String toString() {
        return "BadanHukum{" + "kode=" + kode + ", nama=" + nama + '}';
    }

}
