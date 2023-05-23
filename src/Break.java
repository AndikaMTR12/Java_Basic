class Break {
    public static void main(String[] args) {
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

    }
}
