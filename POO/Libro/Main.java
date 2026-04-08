package POO.Libro;

public class Main {
    public  static void main(String[] args){
        Libro l1 = new Libro("La bella y la bestia", "Tonick Star", 500, 0.05);
        l1.detallesLibro();

        System.out.format("Por %d paginas a un precio de %.2f USD x paginas debes pagar $%.2f", l1.getPaginas(), l1.getPrecioPorPagina(), l1.imprimirPrecio());

    }
}
