
package organizacion;

import java.util.Arrays;

/**
 *
 * @Yael hp
 */
public class Arreglo {
    int longitud;
    Object arr[];

    public Arreglo(int tamanio) {
    longitud = tamanio;
    arr = new Object [tamanio];
    }
    public int getLongitud(){
     return longitud;
    }
    public void setElemento(int indice,Object objs){
        arr[indice]=objs;
        
    }
    public  Object getElemento (int indice){
        return arr[indice];
    }     
    
    public void limpiar (Object objs){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=objs;
            
        }
    }

    @Override
    public String toString() {
        return "longitud=" + longitud + ", arr=" + Arrays.toString(arr) + '}';
    }
    
}
