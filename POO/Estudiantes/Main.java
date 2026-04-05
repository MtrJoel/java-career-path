package POO.Estudiantes;

public class Main {
    public static void main(String[] args){
        Notas nt1 = new Notas();
        nt1.setNombre("Joel");
        nt1.agregarNotas(25);
        nt1.agregarNotas(28.4);
        nt1.agregarNotas(2.45);
        nt1.mostrarInfo();

        Notas nt2 = new Notas();
        nt2.setNombre("Rosa");
        nt2.agregarNotas(45.5565);
        nt2.agregarNotas(4.897);
        nt2.agregarNotas(50.98);
        nt2.mostrarInfo();
    }
}
