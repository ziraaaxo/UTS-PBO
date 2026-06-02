# Laporan Proyek -- Sistem Manajemen Karyawan

## Deskripsi Proyek

Sistem Manajemen Karyawan adalah aplikasi berbasis Java yang dibuat untuk mengelola data karyawan dalam sebuah perusahaan. Program ini menerapkan konsep Object Oriented Programming (OOP/PBO) dan menyediakan fitur CRUD (Create, Read, Update, Delete) melalui menu berbasis terminal.

Proyek ini dibuat untuk memenuhi UTS mata kuliah Pemrograman Berorientasi Objek (PBO).

---

## Fitur Program

### 1. Tambah Karyawan

Menambahkan data karyawan baru berdasarkan jenis karyawan:

* Karyawan Tetap
* Karyawan Kontrak

### 2. Tampilkan Data Karyawan

Menampilkan seluruh data karyawan yang tersimpan.

### 3. Update Data Karyawan

Mengubah informasi karyawan berdasarkan ID.

### 4. Hapus Data Karyawan

Menghapus data karyawan berdasarkan ID.

---

## Konsep PBO yang Digunakan

### 1. Encapsulation (Enkapsulasi)

Data disimpan dalam atribut class dan diakses menggunakan method getter dan setter.

Contoh:

```java
private double bonus;

public void setBonus(double bonus) {
    this.bonus = bonus;
}
```

---

### 2. Inheritance (Pewarisan)

Class `KaryawanTetap` dan `KaryawanKontrak` mewarisi class induk `Karyawan`.

```java
public class KaryawanTetap extends Karyawan
```

```java
public class KaryawanKontrak extends Karyawan
```

---

### 3. Abstraction (Abstraksi)

Class `Karyawan` dibuat sebagai abstract class sehingga tidak dapat dibuat objek secara langsung.

```java
abstract class Karyawan
```

Method abstract:

```java
public abstract void read();
public abstract String getInfo();
```

---

### 4. Interface

Program menggunakan interface `InfoTambahan` untuk mendefinisikan informasi tambahan yang dimiliki setiap jenis karyawan.

```java
public interface InfoTambahan {
    String getInfoTambahan();
    void tampilTambahan();
}
```

---

### 5. Polymorphism

Polymorphism diterapkan melalui penggunaan:

```java
ArrayList<Karyawan>
```

yang dapat menyimpan objek dari berbagai class turunan seperti:

* KaryawanTetap
* KaryawanKontrak

Contoh:

```java
for (Karyawan k : dataKaryawan) {
    k.read();
}
```

Method yang dijalankan akan menyesuaikan dengan jenis objek yang tersimpan.

---

### 6. Method Overloading

Method dengan nama yang sama tetapi parameter berbeda.

```java
public void setGaji(double gaji)
```

```java
public void setGaji(double gaji, double tambahan)
```

---

### 7. Method Overriding

Class turunan mengimplementasikan ulang method abstract dari class induk.

```java
@Override
public void read()
```

```java
@Override
public String getInfo()
```

---

## Struktur Class

```text
Karyawan (Abstract Class)
│
├── KaryawanTetap
│
├── KaryawanKontrak
│
└── InfoTambahan (Interface)
```

---

## Struktur Program

### Karyawan

Class induk yang menyimpan informasi dasar karyawan seperti:

* ID
* Nama
* Divisi
* Jabatan
* Gaji

### KaryawanTetap

Class turunan yang memiliki atribut tambahan:

* Bonus

### KaryawanKontrak

Class turunan yang memiliki atribut tambahan:

* Durasi Kontrak

### InfoTambahan

Interface yang digunakan untuk menampilkan informasi tambahan sesuai jenis karyawan.

### Main

Class utama yang berisi menu dan operasi CRUD.

---

## Perulangan yang Digunakan

### Do While

```java
do {
    ...
} while (pilihan != 5);
```

Digunakan untuk menampilkan menu secara berulang hingga pengguna memilih keluar.

### For Each

```java
for (Karyawan k : dataKaryawan)
```

Digunakan untuk menampilkan seluruh data karyawan.

---

## Percabangan yang Digunakan

### If Else

```java
if (jenis == 1)
```

```java
else if (jenis == 2)
```

Digunakan untuk menentukan jenis karyawan.

### Switch Case

```java
switch (pilihan)
```

Digunakan untuk menjalankan menu program.

---


## Output Program

Contoh tampilan menu:

```text
===== SISTEM PENDATAAN KARYAWAN =====
1. Tambah Karyawan
2. Tampilkan Karyawan
3. Update Karyawan
4. Hapus Karyawan
5. Exit
```

---

## Kesimpulan

Program Sistem Manajemen Karyawan berhasil menerapkan konsep-konsep utama Pemrograman Berorientasi Objek (PBO) seperti Encapsulation, Inheritance, Abstraction, Interface, Polymorphism, Overloading, dan Overriding. Selain itu, program juga menerapkan perulangan dan percabangan sesuai dengan ketentuan tugas yang diberikan.
