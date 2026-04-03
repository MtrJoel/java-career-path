package POO.ClaseCoche;

public class Main {
    public static void main(String[] args){
        Coche c1 = new Coche("Honda", "");
        Coche c2 = new Coche("Toyota", "");

        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());
    }
}
