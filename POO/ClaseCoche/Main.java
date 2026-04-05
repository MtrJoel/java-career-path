package POO.ClaseCoche;

public class Main {
    public static void main(String[] args){
        Coche c1 = new Coche("Honda", "CR-V");
        Coche c2 = new Coche("Toyota", "Corrolla");

        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());
    }
}
