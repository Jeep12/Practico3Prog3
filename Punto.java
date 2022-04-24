package punto3;

public class Punto {
    private String nombre;
    private double x;
    private double y;

    public Punto() {
        this.nombre = " ";
        this.x = 0;
        this.y = 0;
    }
    public Punto(double x, double y, String nombre) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double calcularDistancia(Punto p2) {
        double resultadoTotal = 0.0, resultadoPotencia = 0.0;
        double x,y;
        x = (this.getX() - p2.getX());
        y = (this.getY() - p2.getY());
        resultadoPotencia = (Math.pow(x,2)) + (Math.pow(y,2));
        resultadoTotal = Math.sqrt(resultadoPotencia);

        return resultadoTotal;
    }
}
