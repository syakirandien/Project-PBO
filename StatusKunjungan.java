public class StatusKunjungan {
    private String key;
    private String value;

    public StatusKunjungan(String key) {
        this.key = key;
    }
    
    public String getKey() {
        return key;
    }

    public String getValue() throws Exception {
        try{
            switch(key){
                case "1"->{
                    value = ("Sudah dikunjungi/ mendapatkan informasi dari pihak lain(dinas,dll)");
                }
                case"0" -> {
                    value = ("Belum dikonfirmasi keberadaannya");
                }

                default ->{
                    value = ("Type Mismatch,");
                }
            }
        } catch (Exception e){
            System.out.println("Type mismatch");
            throw new Exception("Key tidak valid");
        } 
        return value;
    }

    @Override
    public String toString() {
        return "StatusKunjungan{" + "key=" + key + ", value=" + value + '}';
    }
}
