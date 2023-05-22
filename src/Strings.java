class Strings {
    public static void main(String[] args) {
        // Strings
        String text = "saya adalah andika seorang web develover";
        System.out.println("Panjang text : " + text.length()); // Mengambil panjang text
        System.out.println(text.toUpperCase()); // Mengubah text menjadi huruf besar
        System.out.println(text.toLowerCase()); // Mengubah text menjadi huruf kecil
        System.out.println(text.indexOf("andika")); // Cari posisi pada string

        // Concatenation
        String firstName = "Andika ", lastName = "Andi";
        System.out.println(firstName.concat(lastName));// Menggabungkan nilai string

        // Number dan String
        int a = 4, b = 5;
        String c = "6";
        String d = "10";
        System.out.println(a + b); // Menghasilkan output integer
        System.out.println(a + c); // Menghasilkan output gabungan data integer dan string
        System.out.println(c + d); // Menghasilkan output gabungan data string dan string

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

    }
}
