
/**
 *
 * @Yael hp
 */
public class Principal {
    
     public static void main(String[] args) {
       
        Listas<Integer> h = new Listas<>();
        
        System.out.println("------------------Método estaVacia()------------------"); 
        
        h.estaVacia();
        
        System.out.println("------------------Método getTamanio()------------------"); 
     
        h.getTamanio();
        
        System.out.println("------------------Método agregarAlFinal()------------------");
     
        h.agregarFinal(8);
        h.transversal();
        
        System.out.println("------------------Método agregarAlInicio()------------------");
    
        h.agregarInicio(23);
        h.transversal();
        
        System.out.println("------------------Método agregarDespuesDe()------------------");
       
        h.agregarSiguiente(8, 44);
        h.transversal();
        
       
        h.agregarInicio(117);
        h.agregarFinal(6);
        h.agregarFinal(9);
        h.agregarFinal(10);
        h.agregarFinal(14);
        h.agregarSiguiente(10, 21);
        System.out.println("------------------Agregamos más elementos a la lista------------------");
        h.transversal();
        
        System.out.println("------------------Método eliminar()------------------");
      
        h.eliminar(3);
        h.transversal();
        
        System.out.println("------------------Método eliminarElFinal()-------------------");
     
        h.eliminarFinal();
        h.transversal();
        
        System.out.println("------------------Método eliminarElPrimero()-------------------");
     
        h.eliminarInicio();
        h.transversal();
        
        System.out.println("------------------Método buscar()--------------------");
        
        h.buscador(6);
        
        System.out.println("------------------Método actualizar()------------------");
        
        h.actualizar(8, 1);
        h.transversal();
        
        System.out.println("------------------Método getTamanio()------------------");
      
        h.getTamanio();
        
        System.out.println("------------------Método transversal()------------------");
        
        h.transversal();
        
        System.out.println("------------------Método estaVacia()------------------"); 
        
        h.estaVacia();
        
    }
}
