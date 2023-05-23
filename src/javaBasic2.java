class javaBasic2 {
    public static void main(String[] args) {
        // If dan Else

        String aku = "Cinta kamu", kamu = "Tidak cinta kamu";

        // Example 1
        if (aku == kamu) {
            System.out.println("Kita pacaran yah!!!"); // Jika aku dan kamu memiliki nilai yang sama maka true
                                                       // menampilkan "Kita pacaran"
        } else {
            System.out.println("Aku jomblo!!!"); // JIka aku dan kamu memiliki nilai berlainan maka menampilkan "Aku
                                                 // jomblo"
        }

        // Example 2
        if (aku == kamu) {
            System.out.println("Kita pacaran yah!!!");// Jika aku dan kamu memiliki nilai yang sama maka true
            // menampilkan "Kita pacaran"
        } else if (aku != kamu) {
            System.out.println("Pacaran yuks!!!");// ika aku dan kamu memiliki nilai yang tidak sama maka true
            // menampilkan "Pcaran yuks"
        } else {
            System.out.println("Aku Jomblo!!!");// Jika aku dan kamu memiliki nilai berlainan maka menampilkan "Aku
            // jomblo"
        }

        // Example 3
        int waktu = 10;
        String hasil = (waktu <= 10) ? "Masih pagi!!!" : "Bangun sudah siang!!!";

        System.out.println(hasil);

        // Switch
        int pilihan = 2;
        String naspad = "Nasi Padang";

        switch (pilihan) {
            case 1:
                System.out.println("Nasi Goreng");
                break;

            case 2:
                System.out.println(naspad);
                break;

            case 3:
                System.out.println("Nasi Kuning");
                break;

            case 4:
                System.out.println("Nasi Kucing");
                break;

            default:
                break;
        }

        // While
        int nilaiAwal = 0, nilaiBatas = 10;
        while (nilaiAwal < nilaiBatas) {
            System.out.println("Perulangan WHILE : " + nilaiAwal);
            nilaiAwal++;
        }

        // Do while
        int nilaiPertama = 0;
        int nilaiAkhir = 10;
        do {
            System.out.println("Perulangan DO WHILE : " + nilaiPertama);
            nilaiPertama++;
        } while (nilaiPertama < nilaiAkhir);

        // For
        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan FOR : " + i);
        }

        // For nested
        for (int a = 0; a < 5; a++) {
            System.out.println("nilai a : " + a);
            for (int b = 0; b < a; b++) {
                System.out.println("nilai b : " + b);
            }
        }

        // For each
        String[] tampung = { "andika", "aco", "baco", "babang" };
        for (String nama : tampung) {
            System.out.println(nama);
        }

        // Break
        for (int a = 0; a < 5; a++) {
            if (a == 2) {
                break;
            }
            System.out.println("Nilai Urut : " + a);
        }

        // Continue
        for (int a = 0; a < 5; a++) {
            if (a == 2) {
                continue;
            }
            System.out.println("Nilai Urut : " + a);
        }

        String[] nama = { "andik", "andi", "ndik", "dik" };
        System.out.println(nama[1]);
        System.out.println(nama.length);

        // For
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

        // For each
        for (String penampungan : nama) {
            System.out.println(penampungan);
        }

        // Multi array
        String[][] kelompok = { { "andika", "andi", "adu" }, { "aldi", "adi" } };
        for (int a = 0; a < kelompok.length; a++) {
            for (int b = 0; b < kelompok[a].length; b++) {
                System.out.println(kelompok[a][b]);
            }
        }
    }
}
