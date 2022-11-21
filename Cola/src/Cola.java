
import java.io.BufferedReader;
import java.io.FileReader;

public class Cola {

    public static void main(String[] args) {
       
        Nodo tail = new Nodo();
        Object Elemento1 = 11;
        Object Elemento2 = 24;
        Object Elemento3 = 30;
        tail.enqueue(Elemento3);
        tail.enqueue(Elemento2);
        tail.enqueue(Elemento1);
        System.out.println("El ultimo elemento es: ");
        System.out.println(Elemento1);
        // tail.Length();
        System.out.println("El número de elementos en la cola es: " + tail.Length());
        System.out.println("------------------------------");
        // tail.isEmpty();
        System.out.println("¿La cola esta vacia?: " + tail.isEmpty());
        //tail.enqueue
        System.out.println("------------------------------");
        System.out.println("El elemento que salio es: " + tail.dequeue());
        System.out.println("------------------------------");
        
        
         
        
        

    }
}
