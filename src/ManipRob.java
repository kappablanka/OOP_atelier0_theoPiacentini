public class ManipRob {
    public static void main (String[] args){
        Robot toto = new Robot("Toto", 10, 20, 2);
        Robot titi = new Robot("Titi");
        toto.deplacer();
        System.out.println(toto.getY());
        titi.setOrientation(3);
        titi.deplacer();
        System.out.println(titi.getX());
        toto.afficheToi();
        titi.afficheToi();
        System.out.println(titi);
    }
}



