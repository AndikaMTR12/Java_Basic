class Variabel {
    public static void main(String[] args) {
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
    }
}
