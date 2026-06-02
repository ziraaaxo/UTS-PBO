import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n===== SISTEM PENDATAAN KARYAWAN =====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Karyawan");
            System.out.println("3. Update Karyawan");
            System.out.println("4. Hapus Karyawan");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    // tambah
    static void create() {
        System.out.println("\nJenis Karyawan:");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Pilih: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("ID       : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama     : ");
        String nama = input.nextLine();

        System.out.print("Divisi   : ");
        String divisi = input.nextLine();

        System.out.print("Jabatan  : ");
        String jabatan = input.nextLine();

        System.out.print("Gaji     : ");
        double gaji = input.nextDouble();

        if (jenis == 1) {
            System.out.print("Bonus    : ");
            double bonus = input.nextDouble();

            Karyawan k = new KaryawanTetap(id, nama, divisi, jabatan, gaji, bonus);
            dataKaryawan.add(k);
            k.infoKaryawan("berhasil ditambahkan.");

        } else if (jenis == 2) {
            System.out.print("Durasi Kontrak (bulan): ");
            int lama = input.nextInt();

            Karyawan k = new KaryawanKontrak(id, nama, divisi, jabatan, gaji, lama);
            dataKaryawan.add(k);
            k.infoKaryawan("berhasil ditambahkan.");

        } else {
            System.out.println("Jenis tidak valid.");
        }
    }

    // tampilkan
    static void read() {
        if (dataKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            System.out.println("\n===== DATA KARYAWAN =====");

            for (Karyawan k : dataKaryawan) {
                System.out.println("Jenis    : " + k.getInfo());

                k.read();

            }
        }
    }

    // update
    static void update() {
        System.out.println("\nPilih jenis karyawan:");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.print("Pilih: ");
        int jenis = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan ID karyawan: ");
        int id = input.nextInt();
        input.nextLine();

        for (Karyawan k : dataKaryawan) {

            if (jenis == 1 && k instanceof KaryawanTetap && k.getId() == id) {

                System.out.print("Nama baru     : ");
                k.setNama(input.nextLine());

                System.out.print("Divisi baru   : ");
                k.setDivisi(input.nextLine());

                System.out.print("Jabatan baru  : ");
                k.setJabatan(input.nextLine());

                System.out.print("Gaji baru     : ");
                k.setGaji(input.nextDouble());

                System.out.print("Bonus baru    : ");
                double bonus = input.nextDouble();
                ((KaryawanTetap) k).setBonus(bonus);

                System.out.println("Data berhasil diupdate.");
                return;
            }

            else if (jenis == 2 && k instanceof KaryawanKontrak && k.getId() == id) {

                System.out.print("Nama baru     : ");
                k.setNama(input.nextLine());

                System.out.print("Divisi baru   : ");
                k.setDivisi(input.nextLine());

                System.out.print("Jabatan baru  : ");
                k.setJabatan(input.nextLine());

                System.out.print("Gaji baru     : ");
                k.setGaji(input.nextDouble());

                System.out.print("Durasi kontrak baru: ");
                int durasi = input.nextInt();
                ((KaryawanKontrak) k).setDurasiKontrak(durasi);

                System.out.println("Data berhasil diupdate.");
                return;
            }
        }

        System.out.println("Data tidak ditemukan.");
    }

    // hapus
    static void delete() {
        System.out.print("Masukkan ID karyawan yang ingin dihapus: ");
        int id = input.nextInt();

        for (Karyawan k : dataKaryawan) {
            if (k.getId() == id) {
                dataKaryawan.remove(k);
                System.out.println("Data karyawan berhasil dihapus.");
                return;
            }
        }

        System.out.println("ID karyawan tidak ditemukan.");
    }
}