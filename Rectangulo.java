package punto3;

public class Rectangulo {
    private String nombre;
    private Punto p1;
    private Punto p2;

    public Rectangulo() {
        this.nombre = "Rectangulo";
        this.p1 = null;
        this.p2 = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rectangulo(Punto p1, Punto p2, String nombre) {
        this.p1 = p1;
        this.p2 = p2;
        this.nombre = nombre;
    }

    public void desplazamientoX(double posicion) {
        double p1X, p2X;
        p1X = this.p1.getX();
        p2X = this.p2.getX();
        this.p1.setX(p1X + posicion);
        this.p2.setX(p2X + posicion);
    }

    public void desplazamientoY(double posicion) {
        double p1Y, p2Y;
        p1Y = this.p1.getY();
        p2Y = this.p2.getY();
        this.p1.setY(p1Y + posicion);
        this.p2.setY(p2Y + posicion);
    }

    public double calcularArea() {
        double alto, ancho, area;
        ancho = this.p2.getX() - this.p1.getX();
        alto = this.p2.getY() - this.p1.getY();
        area = ancho * alto;
        return area;
    }

    public int esMayor(Rectangulo r) {
        if (this.calcularArea() > r.calcularArea()) {
            return 1;
        } else if (this.calcularArea() == r.calcularArea()) {
            return 0;
        } else {
            return -1;
        }
    }
    public boolean esCuadrado (){
        double alto, ancho, area;
        ancho = this.p2.getX() - this.p1.getX();
        alto = this.p2.getY() - this.p1.getY();
        if (ancho == alto){
            return true;
        }
        return false;
    }
    public double largoLadoSuperior (){
        return  this.p2.getX() - this.p1.getX();
    }
    public String paradoOascostado(){
        double alto, ancho, area;
        ancho = this.p2.getX() - this.p1.getX();
        alto = this.p2.getY() - this.p1.getY();
        if (ancho > alto){
            return "Esta acostado";
        }else if (ancho < alto){
            return "Esta parado";
        }else {
            return "Es un cuadrado, no esta ni parado ni acostado";
        }
    }
}
