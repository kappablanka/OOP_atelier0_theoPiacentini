public class Robot {
    private String reference;
    private String nom;
    private int x;
    private int y;
    private int orientation;
    private static int nb_robot;



    public Robot(String nom, int x, int y, int orientation){
        this.nom = nom;
        nb_robot += 1;
        reference = "ROB" + nb_robot;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public Robot(String nom){
        nb_robot += 1;
        reference = "ROB" + nb_robot;
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.orientation = 1;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void deplacer() {
        switch (orientation) {
            case 1 -> y += 1;
            case 2 -> y -= 1;
            case 3 -> x += 1;
            case 4 -> x -= 1;
        }
        if (x < 0) {x = 0;}
        if (y < 0) {y = 0;}
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getOrientation() {
        return orientation;
    }

    public static int getNb_robot() {
        return nb_robot;
    }

    public String toString(){
        return String.format("nom = %s, reference = %s, x = %d, y = %d, orientation = %d\n", nom, reference,
                x, y, orientation);
    }
    public void afficheToi() {
        System.out.printf(toString());
    }
}










