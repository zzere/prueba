
package ejercicios;

/**
 *
 * @author sebas
 */
public class Raices {
    
    private double a, b, c;
    
    public Raices(int a, int b, int c) {
        
        this.a= a;
        this.b= b;
        this.c= c;
        
    }
    
    public void obtenerRaices(){
        
        double x1= ((-b)+getDiscriminante())/(2*a);
        System.out.println("x1= "+x1);
        double x2= ((-b)-getDiscriminante())/(2*a);
        System.out.println("x2= "+x2);
        
    }
    
    public void obtenerRaiz(){
        
        double x= ((-b))/(2*a);
        System.out.println(x);
        
    }
    
    public double getDiscriminante(){
        
        return Math.pow(b, 2)-(4*a*c);
        
    }
    
    public boolean tieneRaices(){
        
        return getDiscriminante() >= 0;
        
    }
    
    public boolean tieneRaiz(){
        
        return getDiscriminante() == 0;
        
    }
    
    public void calcular(){
        
        if (tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene solucion");
        }
        
        
    }

}
