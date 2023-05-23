class Pengkondisian {
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
    }
}
