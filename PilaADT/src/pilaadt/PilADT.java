package pilaadt;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class PilADT <T>{
    ArrayList<T> datos;
    int longitud;
    int tope = -1;
    //int pilaNum[]= new int[5]; 
   
    public PilADT() {
        
    datos = new ArrayList<>();
   
    }
    public boolean isEmpty(){
        return datos.size()==0;
    }
    /*public boolean isFull(){
        return ((tope +1 ) % datos.size)== ;
    }*/
    public int getLength(){
        return datos.size();
        
    }
    public T pop(){
        T sacado = datos.remove(tope);
        tope -- ;
        return sacado;
    }
    public void peek (T dato){
         datos.equals(dato);
                  
    }
    public void push (T dato){
        datos.add(dato);
        tope = datos.size()-1;
    }
    @Override
    public String toString() {
        String edo ="";
        for (int i = datos.size()-1; i >= 0; i--) {
           edo += datos.get(i) +"\n"; 
        }
        
      
        return edo;
    }

    
   
}
