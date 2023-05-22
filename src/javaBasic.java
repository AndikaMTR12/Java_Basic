public class javaBasic {
    public static void main(String[] args) {
        // Output dan Syntax
        System.out.println("-------------------------------------------");
        System.out.println("|               DATA DIRI                 |");
        System.out.println("-------------------------------------------");
        System.out.println("| Nama     : Andika                       |");
        System.out.println("| TTL      : Kolaka, 30 Mei 2000          |");
        System.out.println("| Alamat   : Jl. Panglima Polim, Lrg PDAM |");
        System.out.println("| No HP    : 081240058671                 |");
        System.out.println("| Umur     : " + 23 + "                           |");
        System.out.println("| Email    : andiseven06@gmail.com        |");
        System.out.println("-------------------------------------------");
        System.out.println("|                SKILLS                   |");
        System.out.println("-------------------------------------------");
        System.out.println("| - HTML                                  |");
        System.out.println("| - CSS                                   |");
        System.out.println("| - Javascript                            |");
        System.out.println("| - PHP                                   |");
        System.out.println("| - Mysql                                 |");
        System.out.println("| - Laravel                               |");
        System.out.println("-------------------------------------------");
        System.out.println("|                PENDIDIKAN               |");
        System.out.println("-------------------------------------------");
        System.out.println("| 2018-2023                               |");
        System.out.println("| Universitas Halu Oleo                   |");
        System.out.println("| S1 Ilmu Komputer                        |");
        System.out.println("| 2015-2018                               |");
        System.out.println("| SMAN 1 Kolaka                           |");
        System.out.println("| Jurusan IPA                             |");
        System.out.println("-------------------------------------------");

        // Variabel
        String nama = "Andika";
        int umur = 23;
        int tinggi;
        tinggi = 170;
        int beratBadan = 60;
        beratBadan = 55; // menimpah nilai sebelumnya
        float ipk = 3.55f;
        final int ukuranKaki = 40;
        String firstName = "Andi ";
        String lastName = "Andika";
        String hobi = "Bola", skill = "Tidur";
        String fullName = firstName + lastName;
        // ukuranKaki = 20; //Eror karena tipe data final/const tidak dapat diubah
        System.out.println("Nama : " + nama);
        System.out.println("Nama Lengkap : " + fullName);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi Badan : " + tinggi);
        System.out.println("Berat Badan : " + beratBadan);
        System.out.println("Ukuran Kaki : " + ukuranKaki);
        System.out.println("IPK : " + ipk);
        System.out.println("Hobi : " + hobi);
        System.out.println("Skill : " + skill);

        // Tipe data
        // Primitif data type
        int bilBulat = 1; // Bilangan bulat
        float pecahan1 = 1.0f; // Bilangan pecahan floating
        double pecahan2 = 1.0d; // Bilangan pecahan double
        char karakter = 'D'; // Karakter
        char tes = 2; // Karakter
        boolean pembanding = true; // pembanding
        System.out.println(bilBulat);
        System.out.println(pecahan1);
        System.out.println(pecahan2);
        System.out.println(karakter);
        System.out.println(tes);
        System.out.println(pembanding);
        // Non primitif
        String nama1 = "Andika";
        Integer umur1 = 23;
        System.out.println(nama1);
        System.out.println(umur1);

        // Tipe casting
        // Widening Casting
        int ipk1 = 23; // nilai integer
        double ipk2 = ipk1; // mengubah nilai integer ke double

        System.out.println("WIDENING CASTING");// output nilai integer
        System.out.println("IPK1 : " + ipk1);// output nilai integer
        System.out.println("IPK2 : " + ipk2);// output nilai double

        // Narrowing Casting
        double ipk3 = 3.5d; // nilai double
        int ipk4 = (int) 4; // mengubha nilai double ke integer

        System.out.println("NARROWING CASTING");// output nilai integer
        System.out.println("IPK3 : " + ipk3);// output nilai double
        System.out.println("IPK4 : " + ipk4);// ouutput nilai integer

        // Operator
        int a = 10, b = 5, c = 1;
        boolean d = true;

        // Operator Aritmatika
        System.out.println(a + b);// Operator tambah(+)
        System.out.println(a - b);// Operator tambah(+)
        System.out.println(a * b);// Operator tambah(+)
        System.out.println(a / b);// Operator tambah(+)
        System.out.println(a % b);// Operator tambah(+)
        System.out.println(--c);// Operator tambah(+)
        System.out.println(++c);// Operator tambah(+)

        // Operator Assignment
        System.out.println(a += 10);// Menambahkan dirinya sendiri
        System.out.println(a -= 10);// Mengurangi dirinya sendiri
        System.out.println(a *= 10);// Mengalikan dirinya sendiri
        System.out.println(a /= 10);// Membagikan dirinya sendiri
        System.out.println(a %= 10);// Memodulus dirinya sendiri

        // Operator Comparison
        System.out.println(a > b); // membandingkan nilai a lebih besar dari b
        System.out.println(a < b); // membandingkan nilai a lebih kecil dari b
        System.out.println(a == b); // membandingkan nilai a kesamaan nilai dari b
        System.out.println(a != b); // membandingkan nilai a ketidaksama dengan dari b
        System.out.println(a >= b); // membandingkan nilai a lebih besar sama dengan dari b
        System.out.println(a <= b); // membandingkan nilai a lebih kecil sama dengan dari b

        // Operator Logical
        System.out.println(a > 4 && b < 7);// harus memenuhi kedua logic
        System.out.println(a > 4 || b < 7);// harus memenuhi salah satu logic
        System.out.println(!d);// kebalikan

        // String
        // Strings
        String text = "saya adalah andika seorang web develover";
        System.out.println("Panjang text : " + text.length()); // Mengambil panjang text
        System.out.println(text.toUpperCase()); // Mengubah text menjadi huruf besar
        System.out.println(text.toLowerCase()); // Mengubah text menjadi huruf kecil
        System.out.println(text.indexOf("andika")); // Cari posisi pada string

        // Concatenation
        String firstName1 = "Andika ", lastName1 = "Andi";
        System.out.println(firstName1.concat(lastName1));// Menggabungkan nilai string

        // Number dan String
        int a1 = 4, b1 = 5;
        String c1 = "6";
        String d1 = "10";
        System.out.println(a1 + b1); // Menghasilkan output integer
        System.out.println(a1 + c1); // Menghasilkan output gabungan data integer dan string
        System.out.println(c1 + d1); // Menghasilkan output gabungan data string dan string

        // Spesial Karakter
        String txt1 = "Saya sangat menyukai \"nasi goreng\" ";
        String txt2 = "Saya sangat menyukai \'nasi goreng\' ";
        String txt3 = "Saya sangat menyukai nasi goreng\\nasi uduk ";
        String txt4 = "Saya mau ke sana \n ke sini";
        String txt5 = "Saya \t mau";
        System.out.println(txt1);// Menampilkan Kutip dua("")
        System.out.println(txt2);// Menampilkan Kutip satu('')
        System.out.println(txt3);// Menampilkan backslash(\)
        System.out.println(txt4);// Menampilkan data baris baru
        System.out.println(txt5);// Menampilkan data tab

        // Math
        int min = Math.min(9, 12);
        int max = Math.max(26, 3);
        double akar = Math.sqrt(6);
        int mutlak = Math.abs(-4);
        int random = (int) (Math.random() * 101);

        System.out.println(min);// Nilai minimum
        System.out.println(max);// Nilai maksimum
        System.out.println(akar);// Nilai akar
        System.out.println(mutlak);// Nilai mutlak
        System.out.println(random);// Nilai random

        // Boolean
        boolean suka = true;
        boolean tidakSuka = false;
        int a2 = 1, b2 = 4;
        System.out.println("Saya sangat suka       : " + suka);
        System.out.println("Saya sangat tidak suka : " + tidakSuka);
        System.out.println(a2 < b2);// Hasilnya true karena a = 1 lebih kecil dari b = 4
        System.out.println(a2 > b2);// Hasilnya false karena a = 1 tidak lebih besar dari b = 4
        System.out.println(a2 == b2);// Hasilnya false karena nilai a = 1 tidak sama dengan nilai b = 4;
        System.out.println(a2 == 1);// Hasilnya true karena nilai a = 1 sama dengan nilai 1
    }
}
