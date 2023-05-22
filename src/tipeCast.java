public class tipeCast {
    public static void main(String[] args) {
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
    }
}
