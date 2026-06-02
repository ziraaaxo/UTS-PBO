public class KaryawanTetap extends Karyawan implements InfoTambahan {

    private double bonus;

    public KaryawanTetap(int id, String nama, String divisi, String jabatan, double gaji, double bonus) {
        super(id, nama, divisi, jabatan, gaji);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void read() {
        tampilDataDasar();
        tampilTambahan();
        System.out.println("---------------------------");
    }

    @Override
    public String getInfo() {
        return "Karyawan Tetap";
    }

    // interface
    @Override
    public String getInfoTambahan() {
        return "Bonus";
    }

    @Override
    public void tampilTambahan() {
        System.out.printf("Bonus    : %,.0f\n", bonus);

        double total = gaji + bonus;
        System.out.printf("Total    : %,.0f\n", total);
    }
}