package POO.Biblioteca;

public class Main {
    public static void main(String[] args){
        Libro l1 = new Libro("The bible", "Dios");
        Biblioteca biblioteca = new Biblioteca();
        

        biblioteca.agregarLibro(l1);
        biblioteca.mostrarLibros();

    }
}
