public class Keaktifan {
    private String key;
    private String value;

    public Keaktifan(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }

    public String getValue() {
        try{
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
            } 
        } catch (Exception e){
            System.out.println("Type mismatch");
        }
        return value;
    }

    
    @Override
    public String toString() {
        return "Keaktifan{" + "key=" + key + ", value=" + value + '}';
    }
    
}
