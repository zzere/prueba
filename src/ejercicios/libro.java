
package ejercicios;

/**
 *
 * @author sebas
 */
public class libro {
    
    private String titulo, autor;
    private int isbn, num_pag;
    
    
    public libro (String titulo, int isbn, String autor, int num_pag){
        
        this.titulo= titulo;
        this.isbn= isbn;
        this.autor= autor;
        this.num_pag= num_pag;
        
    }
    
    public void establece_titulo(String titulo){
        
        this.titulo= titulo;
        
    }
    
    public String dame_titulo(){
        
        return titulo;
        
    }
    
    public void establece_isbn(int isbn){
        
        this.isbn= isbn;
        
    }
    
    public int dame_isbn(){
        
        return isbn;
        
    }
    
    public void establece_autor(String autor){
        
        this.autor= autor;
        
    }
    
    public String dame_autor(){
        
        return autor;
        
    }
    
    public void establece_pag(int num_pag){
        
        this.num_pag= num_pag;
        
    }
    
    public int dame_pag(){
        
        return num_pag;
        
    }
    
    @Override
    public String toString(){
        return "El libro " + titulo + " , con ISBN " + isbn + " , creado por " + autor + " tiene " + num_pag + " paginas";
    }

}
