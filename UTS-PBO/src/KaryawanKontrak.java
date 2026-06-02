public class KaryawanKontrak extends Karyawan implements InfoTambahan {

    private int durasiKontrak;

    public KaryawanKontrak(int id, String nama, String divisi, String jabatan, double gaji, int durasiKontrak) {
        super(id, nama, divisi, jabatan, gaji);
        this.durasiKontrak = durasiKontrak;
    }

    public void setDurasiKontrak(int durasiKontrak) {
        this.durasiKontrak = durasiKontrak;
    }

    @Override
    public void read() {
        tampilDataDasar();
        tampilTambahan();

        System.out.println("---------------------------");
    }

    @Override
    public String getInfo() {
        return "Karyawan Kontrak";
    }

    // interface
    @Override
    public String getInfoTambahan() {
        return "Durasi Kontrak";
    }

    @Override
    public void tampilTambahan() {
        System.out.println("Kontrak  : " + durasiKontrak + " bulan");
    }
}