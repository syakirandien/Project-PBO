public class KIP {
    private String kodeProv;
    private String kodeKab;
    private String kodeKec;
    private String KJU;
    private String noUrutKab;

    public KIP(String kodeProv, String kodeKab, String kodeKec, String KJU, String noUrutKab) throws Exception{
        if((kodeProv.length()==2)& (kodeProv.compareTo("00")>0) &(kodeProv.compareTo("35")<0)&(kodeProv.matches("[0-9]+")==true)){
            this.kodeProv=kodeProv;
            if (kodeKab.matches("[^0-9]")) {
                throw new Exception("Error : Kode harus berupa angka");
            } else {
                this.kodeKab = kodeKab;
                if (kodeKec.matches("[^0-9]")) {
                    throw new Exception("Error : Kode harus berupa angka");
                } else {
                    this.kodeKec = kodeKec;
                    if (KJU.matches("[^0-9]")) {
                        throw new Exception("Error : Kode harus berupa angka");
                    } else {
                        this.KJU = KJU;
                        if (noUrutKab.matches("[^0-9]")) {
                            throw new Exception("Error : Kode harus berupa angka");
                        } else {
                            this.noUrutKab = noUrutKab;
                        }
                    }
                }
            }
        }
        else{
            throw new Exception("Kode Provinsi terdiri dari 2 digit angka antara 1 - 34");
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
        return "KIP{" + "kodeProv=" + kodeProv + ", kodeKab=" + kodeKab + ", kodeKec=" + kodeKec + ", KJU=" + KJU + ", noUrutKab=" + noUrutKab + '}';
    }
    
    
}
