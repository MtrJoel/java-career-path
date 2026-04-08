package POO.Libro;

public class Libro {
    // * Atributos

    private String titulo;
    private String autor;
    private int paginas;
    private double precioPagina;

    // * Getters y setters

   

    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    public int getPaginas(){
        return paginas;
    }

    public double getPrecioPorPagina(){
        return precioPagina;
    }

    // * Constructor
    public Libro(String titulo, String autor, int paginas, double precioPagina){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precioPagina = precioPagina;
    }


    // * Metedos

    public double imprimirPrecio(){
        double precioTotal = precioPagina * paginas;
        return precioTotal;
    }

    public void detallesLibro(){
        System.out.println("Titulo : " + titulo);
        System.out.println("autor : " + autor);
        System.out.println("paginas  : " + paginas);
    }
}
