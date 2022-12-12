
package proyectofinal.Linked;

import java.util.LinkedHashMap;

public class Linked {
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
        //Metodo put para ingresar datos
        lh.put("a", 13 );
        lh.put("c", 16 );
        lh.put("l", 7 );
        lh.put("i", 8 );
        lh.put("t", 3 );
        System.out.println(lh);
        //Metodo para ver valor de esa llave
        //Un for para repetir las llaves y ordenarlas por orden alfabetico
        //keySet para obtener los llaves
        //Imprimimos get para tener acceso ordenado a la LinkedHashMap
        for(String palabra: lh.keySet()){
            System.out.println(lh.get(palabra));
        }
        //Metodo isEmpty para conocer si esta vacia o llena la Linked
        System.out.println("¿La LinkedHash esta vacia?: " + lh.isEmpty());
        //Metodo remove para eliminar un dato de la Linked
        System.out.println("Se elimino la llave i y valor "+lh.remove("i") + " de la linked");
        //Metodo para regresar el estado actual de la Linked
        System.out.println(lh.toString());
        
        
        
    }
}
