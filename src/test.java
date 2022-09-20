import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#0.00");

        Vecteur3D vec1 = new Vecteur3D(3, 2, 5);
        System.out.println(vec1);
        System.out.println("norme v1 = " + df.format(vec1.getNorm()));

        Vecteur3D vec2 = new Vecteur3D(1, 2, 3);
        System.out.println(vec2);
        System.out.println("norme v2 = " + df.format(vec2.getNorm()));

        Vecteur3D somme = vec1.somme(vec2);
        double produit = vec1.produitScalaire(vec2);
        System.out.println("somme = " + somme);
        System.out.println("produit = " + produit);
    }
}




