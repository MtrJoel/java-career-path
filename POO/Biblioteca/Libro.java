package POO.Biblioteca;

public class Libro {
    // * Obtener titulo y autor
    private String titulo;
    private String autor;

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    // * Mostrar Infomarcion

    public void informacionLibro(){
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor del libro : " + autor);
    }
}
