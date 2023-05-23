class Arrays {
    static String[] model = new String[10];

    public static void main(String[] args) {
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
        // System.out.println(kelompok[0][1]);

        // arrays();
        testArray();
    }

    static void showData() {
        for (var i = 0; i < model.length; i++) {
            if (model[i] != null) {
                System.out.println(model[i]);
            }
        }
    }

    static void arrays(String data) {
        for (var i = 0; i < model.length; i++) {
            var todo = data;
            var no = i + 1;

            if (model[i] == null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    static void testArray() {
        arrays("Belajar Java");

        showData();
    }
}
