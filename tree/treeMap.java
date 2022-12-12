
package proyectofinal.tree;

import java.util.Map;
import java.util.TreeMap;


public class treeMap {
    public static void main(String[] args) {
        Map<Integer, String> tm = new TreeMap<Integer, String>();
        
        //Método para itroducir igual es put
        //Introduciendo en un integer la llave y en string el valor
        tm.put(1, "Rojo");
        tm.put(2, "Verde");
        tm.put(3, "Azul");
        tm.put(5, "Morado");
        tm.put(8, "Rosa");
        tm.put(9, "Amarillo");
        // Imprimimos
        System.out.println(tm);
        //Metodo isEmpty para preguntar si esta vacío el Treemap
        System.out.println("¿El TreeMap esta vacia?: " + tm.isEmpty());
        //Metodo remove para eliminar un dato 
        System.out.println("Se elimino: " + tm.remove(9));
        //Metodo toString para regresar el valor actual 
        System.out.println("TreeMap actual: ");
        System.out.println(tm.toString());
        
                
     
        
        
        
        
        
        
    }

   
 
}
