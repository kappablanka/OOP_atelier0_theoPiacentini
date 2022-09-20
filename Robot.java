public class Robot {
    private String reference;
    private String nom;
    private int x;
    private int y;
    private int orientation;
    private static int nb_robot;

    public void (String nom, int x, int y, int orientation){
        this.nom = nom;
        this.nb_robot += 1;
        this.reference = "ROB" + nb_robot
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.nb_robot += 1;
    }

    public void (String nom){
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.orientation = 1;
        this.nb_robot += 1;
    }

    public void setOrientation(int orientation) {
        this.orientation = oriente;
    }

    public void deplacer() {
        switch(orientation) {
            case 1: y += 1; break;
            case 2: y -= 1; break;
            case 3: x += 1; break;
            case 4: x -= 1; break;
            };
        if (x < 0) {x = 0};
        if (y < 0) {y = 0};
        }
    }





}

