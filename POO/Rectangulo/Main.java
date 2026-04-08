package POO.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0.45, 45);
        System.out.println("Area : " + r1.calcularArea());
        System.out.println("Perimetro : " + r1.calcularPerimetro());
    }
}
