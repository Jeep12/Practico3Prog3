package punto3;

public class Main {

        //resultado = (Math.pow((p1.getX() + p2.getX()), 2)) + (Math.pow((p1.getY() + p2.getY()), 2));
        //resultadoRaiz = Math.sqrt(resultado);
    public void imprimirPuntos(Punto punto1,Punto punto2) {
        System.out.println("Punto1 =  (" + punto1.getX() + "," + punto1.getY() + ")");
        System.out.println("Punto2 =  (" + punto2.getX() + "," + punto2.getY() + ")");
    }
    public void imprimirRectangulo (Rectangulo r,Rectangulo r2){
        System.out.println("Area de rectangulo: " + r.calcularArea());
        System.out.println("Este: " + r.getNombre() +" es mayor? : " + r.esMayor(r2));
        System.out.println("Es cuadrado? " + r.esCuadrado());
        System.out.println("Largo del lado superior " + r.largoLadoSuperior() );
       System.out.println( r.paradoOascostado());
    }
    public static void main(String[] args) {
        Main m = new Main();
        //----------------------------------------------------------------------------------------------
        Punto punto1 = new Punto(5, 3, "Punto 1");
        Punto punto2 = new Punto(10, 7, "Punto 2");
        Punto punto3 = new Punto(1, 3, "Punto 1");
        Punto punto4 = new Punto(4, 7, "Punto 2");
        Rectangulo rectangulo = new Rectangulo (punto1,punto2,"Rectangulo");
        Rectangulo rectangulo2 = new Rectangulo(punto3,punto4,"Rectangulo 2");




        m.imprimirPuntos(punto1,punto2);
        m.imprimirRectangulo(rectangulo,rectangulo2);
        System.out.println("-------------------------------------------------------------");
        m.imprimirPuntos(punto3,punto4);
        m.imprimirRectangulo(rectangulo2,rectangulo);




        //rectangulo.desplazamientoX(4);
        //rectangulo.desplazamientoY(3);


    }
}
