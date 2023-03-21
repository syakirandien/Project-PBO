public class Pencacahan {
    private Keaktifan aktif;
    private StatusKunjungan statuskunjungan;

    public Pencacahan(Keaktifan aktif, StatusKunjungan statuskunjungan) {
        this.aktif = aktif;
        this.statuskunjungan = statuskunjungan;
    }

    public Keaktifan getAktif() {
        return aktif;
    }

    public StatusKunjungan getStatuskunjungan() {
        return statuskunjungan;
    }

    @Override
    public String toString() {
        return "Pencacahan{" + "aktif=" + aktif + ", statuskunjungan=" + statuskunjungan + '}';
    }
    
}
