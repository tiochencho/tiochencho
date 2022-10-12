
/**
 *
 * @Yael hp
 */
public class Principal {
    
     public static void main(String[] args) {
       
        Listas<Integer> y = new Listas<>();
        
        System.out.println("------------------Método estaVacia()------------------"); 
        
        y.estaVacia();
        
        System.out.println("------------------Método getTamanio()------------------"); 
     
        y.getTamanio();
        
        System.out.println("------------------Método agregarAlFinal()------------------");
     
        y.agregarFinal(8);
        y.transversal();
        
        System.out.println("------------------Método agregarAlInicio()------------------");
    
        y.agregarInicio(23);
        y.transversal();
        
        System.out.println("------------------Método agregarDespuesDe()------------------");
       
        y.agregarSiguiente(8, 44);
        y.transversal();
        
       
        y.agregarInicio(117);
        y.agregarFinal(6);
        y.agregarFinal(9);
        y.agregarFinal(10);
        y.agregarFinal(14);
        y.agregarSiguiente(10, 21);
        System.out.println("------------------Agregamos más elementos a la lista------------------");
        y.transversal();
        
        System.out.println("------------------Método eliminar()------------------");
      
        y.eliminar(3);
        y.transversal();
        
        System.out.println("------------------Método eliminarElFinal()-------------------");
     
        y.eliminarFinal();
        y.transversal();
        
        System.out.println("------------------Método eliminarElPrimero()-------------------");
     
        y.eliminarInicio();
        y.transversal();
        
        System.out.println("------------------Método buscar()--------------------");
        
        y.buscador(6);
        
        System.out.println("------------------Método actualizar()------------------");
        
        y.actualizar(8, 1);
        
        System.out.println("------------------Método getTamanio()------------------");
      
        y.getTamanio();
        
        System.out.println("------------------Método transversal()------------------");
        
        y.transversal();
        
        System.out.println("------------------Método estaVacia()------------------"); 
        
        y.estaVacia();
        
    }
}
