public class Vecteur3D {
    private double x;
    private double y;
    private double z;

    public Vecteur3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vecteur3D(){
        x = 0;
        y = 0;
        z = 0;
    }

    public double getNorm(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    public double produitScalaire(Vecteur3D vec) {
        return (x*vec.x + y*vec.y + z*vec.z);
    }

    public Vecteur3D somme(Vecteur3D vec){
        Vecteur3D somme = new Vecteur3D();
        somme.setX(x + vec.x);
        somme.setY(y + vec.y);
        somme.setZ(z + vec.z);
        return somme;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Vecteur3D{" +
                "<" + x +
                ", " + y +
                ", " + z +
                ">}";
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
}
