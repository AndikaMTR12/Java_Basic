class Perulangan {
    public static void main(String[] args) {
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

    }
}
