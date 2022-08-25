
package clasearreglo;

import java.util.ArrayList;

/**
 *
 * @Yael Rubio hp
 */

public class  ClaseArreglo {
    //int [] Jugador = new int [23];
    
    public static void main(String[] args) {
        //Método Arreglo (construtor)
        ArrayList<String> Jugador = new ArrayList<String>();
       // Jugador j1 = new Jugador("Gabozex",19,3198293);
        
        Jugador.add(0,"José C., 20 años, 319283484");
        Jugador.add(1,"Benito H., 22 años, 318237488");
        Jugador.add(2,"Roberto R., 19 años, 318343453 ");
    // System.out.println(j1);
    
        //Método int getLenght
         Jugador.size();
         
         System.out.println(Jugador.size());
        for (int i=0; i<3; i++) {
            System.out.println( Jugador.get(i));
        
        }
        //Método setElement 
        Jugador.set(2, "Yael R., 21 años, 31927872");
            for (int i=0; i<3; i++) {
            System.out.println( Jugador.get(i));
        
        }
            
//Jugador.get(3);// Método getElement
        System.out.println(Jugador.get(1));
       
//Método clear
        Jugador.clear();
        System.out.println(Jugador);
        
//Método toString
  
        System.out.println(Jugador.toString());
//Regresa el valor actual que es clear 
        
}

   
   
        
    

    

   
    

   
    
}
     
      

          
          
    
   
    

    
    
   
    
    

