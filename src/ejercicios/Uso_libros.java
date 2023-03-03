
package ejercicios;

/**
 *
 * @author sebas
 */
public class Uso_libros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        libro book1 = new libro("El arte de la guerra", 7703289, "sun tzu", 300);
        libro book2 = new libro("Pensar rapido", 707034, "daniel khaneman", 600);
        
        //book2.establece_pag(30);
        
        System.out.println(book1);
        System.out.println(book2);
        
        if (book1.dame_pag()> book2.dame_pag()){
            System.out.println(book1.dame_titulo()+" tiene mayor cantidad de paginas");
        }else{
            System.out.println(book2.dame_titulo()+" tiene mayor cantidad de paginas");
        }
        
    }
    
}
