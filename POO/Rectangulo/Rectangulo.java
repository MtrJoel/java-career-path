package POO.Rectangulo;

public class Rectangulo {
    private double base;
    private double altura;

    // * Metodos 
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
}
