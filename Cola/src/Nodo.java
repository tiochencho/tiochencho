
import java.util.ArrayList;


public class Nodo {
    
    Object elem;
    Nodo siguiente;

    public Nodo(Object o) {
        elem = o;
        siguiente = null;
    }
    Nodo inicial;
    Nodo ultimo;
    int size;

    public Nodo() {
        ultimo = null;
        size = 0;
    }
//Método para ingresar un elemento
    public void enqueue(Object o) {
    Nodo nnodo = new Nodo(o);
    if ( inicial == null) {
      inicial = nnodo;
      ultimo = nnodo;
    } else {
      ultimo.siguiente = nnodo;
      ultimo = nnodo;
    }
    size++;
  };
    //Método para sacar el elemento que este enfrente
    public Object dequeue(){
        if (inicial == null) 
            return null;
            ;
            Object o = inicial.elem;
            inicial = inicial.siguiente;
            size--;
            return o;
    }
//Método para saber si esta vacia 
    public boolean isEmpty() {
        return (size == 0);
    }
    //Método para saber el tamaño de la cola 
    public int Length(){
        return size;
    }
public Object inicial() {
    if (inicial == null)
      return null;
    else
      return inicial.elem;
  }
/*@Override
    public String toString() {
        
    }*/

    String enqueue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

