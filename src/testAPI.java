import java.util.Random;

public class testAPI {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.random());
        Random mon_generateur = new Random();
        System.out.println(mon_generateur.nextInt(1, 4));
        int x1 = 2;
        int x2 = 3;
        System.out.println(Math.max(x1, x2));

        String n1 ="aaaaa";
        String n2 = "bbbbb";
        if (n1.compareTo(n2) == -1) {
            System.out.println(n1);
        }
        else {
            System.out.println(n2);
        }
    }
}
