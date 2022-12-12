package proyectofinal.Hash;

import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {

        HashMap<Integer, String> hs = new HashMap<>();
        //Método para introducir datos es put 
        //Put introduce un una llave int y un valor string
        //Ejemplo alumno, no. cuenta y nombre
        hs.put(319278712, "Gerardo");
        hs.put(317898832, "Alan");
        hs.put(347827182, "Evelin");
        hs.put(319938879, "Dana");
        hs.put(319299283, "Miriam");
        System.out.println(hs);

        //Metodo para remover es remove
        //Que agarra la llave para elimnarla
        hs.remove(319278712);
        System.out.println(hs);

        //Metodo para confirmar si  tiene ese valro el HashMap
        //Se usa containsKey
        if (hs.containsKey(319299283)) {
            System.out.println("Si contiene el indice y el valor es: ");
            System.out.println(hs.get(319299283));
        }
//De igual forma si no contiene el indice
//Igual se usa containsKey se hace de la siguiente manera
        if (hs.containsKey(83)) {
            System.out.println("Si contie el indice y el valor es: ");
            System.out.println(hs.get(83));
        } else {
            System.out.println("El hash no contiene el valor de ese indice.");
        }
//Metodo par saber si el HashMap esat vacio
//Se utiliza isEmpty()
        System.out.println("¿El HashMap se encuentra vacio?: " + hs.isEmpty());
//Y el toString para devolver lo que contiene el HashMap
        System.out.println(hs.toString());
    }
}
