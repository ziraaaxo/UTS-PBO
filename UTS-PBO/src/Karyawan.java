abstract class Karyawan {

    protected int id;
    protected String nama;
    protected String divisi;
    protected String jabatan;
    protected double gaji;

    public Karyawan(int id, String nama, String divisi, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.divisi = divisi;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // getter
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getDivisi() {
        return divisi;
    }
    public String getJabatan() {
        return jabatan;
    }
    public double getGaji() {
        return gaji;
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // overloading
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setGaji(double gaji, double tambahan) {
        this.gaji = gaji + tambahan;
    }

    public void infoKaryawan(String tambahan) {
        System.out.println("Data karyawan " + nama + " " + tambahan);
    }

    // nethod umum
    protected void tampilDataDasar() {
        System.out.println("ID       : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Divisi   : " + divisi);
        System.out.println("Jabatan  : " + jabatan);
        System.out.printf("Gaji     : %,.0f\n", gaji);
    }

    // abstract
    public abstract void read();
    public abstract String getInfo();
}