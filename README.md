# Praktikum-PBO-
 Program ini merupakan aplikasi Java sederhana untuk mengelola data atlet. Pengguna dapat memasukkan nama, umur, dan memilih cabang olahraga (basket atau voli). Program menerapkan konsep OOP yaitu encapsulation melalui penggunaan getter dan setter, inheritance dengan superclass Atlet serta subclass AtletBasket dan AtletVoli, serta overriding pada method tampilkanInfo() agar informasi yang ditampilkan sesuai cabang olahraga masing-masing.
 
**Menu dari program ini:**

Operasi CRUD:

Create → tambah data atlet.

Read → lihat daftar atlet.

Update → ubah data atlet.

Delete → hapus data atlet.

Penerapan konsep OOP:

Encapsulation dengan getter dan setter.

Inheritance (superclass Atlet, subclass AtletBasket & AtletVoli).

Overriding pada method tampilkanInfo().

Fitur pencarian data atlet (search) sebagai nilai tambah.

**1.Tambah Atlet**

<img width="562" height="248" alt="image" src="https://github.com/user-attachments/assets/92dc1134-0fc7-4061-973e-dcf9f2af32ba" />


Menu ini dipakai untuk menambahkan data atlet baru ke dalam daftar.
Saat user memilih menu 1, program akan meminta input:
Nama atlet,Cabang olahraga (cabor) dan Umur atlet

**2. Lihat Daftar Atlet**

<img width="788" height="443" alt="image" src="https://github.com/user-attachments/assets/3d181e5b-270d-4029-bd2f-cc9f3afd264c" />


Menu ini digunakan untuk menampilkan semua data atlet yang sudah tersimpan di dalam ArrayList.

**3. Ubah Data Atlet**

<img width="731" height="411" alt="image" src="https://github.com/user-attachments/assets/4194fd86-e46d-4573-8f18-65dbde7cbcdb" />

Fitur ini memungkinkan pengguna memperbarui data atlet dengan mudah, sehingga informasi yang tersimpan tetap akurat dan sesuai kebutuhan.

**4. Hapus Atlet**

<img width="753" height="423" alt="image" src="https://github.com/user-attachments/assets/5bb89106-994b-47c4-8922-ec74d5c45d9c" />

Dengan adanya fitur hapus, pengguna dapat mengelola data dengan lebih baik, terutama ketika ada data yang tidak relevan atau salah input.

**5. Cari Atlet**

<img width="683" height="384" alt="image" src="https://github.com/user-attachments/assets/21e2f24f-33a5-4b15-a5a7-10342d1a317b" />

Program menyediakan fitur search untuk mencari data atlet berdasarkan cabang olahraga.

**0. Keluar**

<img width="517" height="291" alt="image" src="https://github.com/user-attachments/assets/f53efb15-f3f3-4ac3-aa72-29e23088ddf8" />

Menu ini berfungsi untuk menghentikan jalannya program. Dengan memilih menu ini, pengguna dapat keluar dari aplikasi setelah selesai melakukan pengelolaan data atlet.


**Encapsulation (Getter dan Setter)**

<img width="704" height="559" alt="image" src="https://github.com/user-attachments/assets/a439de5d-d3c2-4634-a23c-71986cf5f784" />

Getter dan Setter digunakan untuk mengatur akses terhadap atribut yang bersifat private. Dalam program ini, atribut nama dan umur pada kelas Atlet dibuat private, sehingga tidak bisa diakses langsung dari luar kelas. Untuk itulah dibuat getter dan setter.


**inheritance**

<img width="199" height="120" alt="image" src="https://github.com/user-attachments/assets/5f1e7f3e-9964-49a6-8399-9924d46ba76a" />

Dalam sistem ini, Atlet.java berperan sebagai supperclass, sedangkan AtletBasket dan AtletVoli berperan sebagai subclass.


**Abstraction**

<img width="445" height="200" alt="image" src="https://github.com/user-attachments/assets/8f678a05-7d43-419e-a6f5-cdd82f5e0c9a" />
<img width="575" height="95" alt="image" src="https://github.com/user-attachments/assets/3bb5d1ce-eff3-4487-8b9a-d0cd1ac4618a" />


Kelas Atlet dijadikan abstrak untuk menjadi kerangka dasar semua atlet. Metode tampilkanInfo() dibuat abstrak agar wajib diimplementasikan berbeda oleh kelas turunan seperti AtletBasket dan AtletVoli.

**Inheritance (Pewarisan)**

<img width="645" height="183" alt="image" src="https://github.com/user-attachments/assets/70f24a8e-411e-4a63-b7a2-ba0fa7485328" />

Kelas AtletBasket mewarisi (extends) kelas Atlet sehingga otomatis memiliki atribut nama dan umur, serta dapat mengimplementasikan metode tampilkanInfo() sesuai kebutuhan.

**Polymorphism (Overriding & Overloading)**

- OVERRIDING
  
<img width="723" height="198" alt="image" src="https://github.com/user-attachments/assets/ff253a03-1d20-447e-849d-0d2c3a9effb2" />


Method `tampilkanInfo()` pada `AtletBasket` adalah contoh **overriding**, yaitu menulis ulang method dari superclass (`Atlet`) agar sesuai dengan kebutuhan subclass. Walaupun nama method sama, isinya berbeda. Dengan ini tercapai **polymorphism**, karena `tampilkanInfo()` bisa menghasilkan output berbeda tergantung objeknya (Basket atau Voli).

- OVERLOADING

  <img width="671" height="268" alt="image" src="https://github.com/user-attachments/assets/785743c3-f50f-4a5f-aa47-ce378fe6ead8" />

Constructor Atlet termasuk overloading karena memiliki dua versi dengan parameter berbeda. Hal ini memberi fleksibilitas: objek bisa dibuat hanya dengan nama & umur, atau dengan tambahan cabang olahraga.

**interface**

<img width="395" height="199" alt="image" src="https://github.com/user-attachments/assets/7916e000-f7fb-4f22-a238-2b8c2597f1c8" />

Interface Latihan berfungsi sebagai kontrak yang mewajibkan setiap class yang mengimplementasikannya untuk memiliki method latihan(), dengan isi yang dapat berbeda sesuai kebutuhan masing-masing class.



**Class baru**

- TampilData.java

  Class ini dibuat untuk menampilkan data dari tabel database menggunakan Statement (bukan PreparedStatement).

  berikut ssan singkat kode nya
![WhatsApp Image 2025-10-10 at 22 56 52_8b5eb16e](https://github.com/user-attachments/assets/e4eb2ba1-901e-4f35-92bc-98773ff3fd3b)


  - SimpleORM.java

    Class ini berfungsi sebagai ORM (Object Relational Mapping) sederhana,
yang secara otomatis membuat query INSERT dari objek Java tanpa perlu menulis SQL manual.

berikut sedikit ssan kode nya

![WhatsApp Image 2025-10-10 at 22 55 53_3e89290a](https://github.com/user-attachments/assets/bc8c5e8a-ea0d-4eff-a6c7-328ae82123b5)


