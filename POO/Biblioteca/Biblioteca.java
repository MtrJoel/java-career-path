package POO.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros disponibles");
            return;
        }

        System.out.println("========  LIBROS DISPONIBLES ======");

        for(int i = 0; i < libros.size(); i++){

            Libro libroActual = libros.get(i);

            libroActual.informacionLibro();
        }
    }

    public Biblioteca(){
        libros = new ArrayList<>();
    }
}
