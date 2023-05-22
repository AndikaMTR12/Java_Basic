class Operator {
    public static void main(String[] args) {
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
    }
}
