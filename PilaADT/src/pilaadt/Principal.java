package pilaadt;

public class Principal {

    public static void main(String[] args) {

        PilADT<String> pil = new PilADT<String>();
        //Método push
        System.out.println("------------------------------");
        pil.push("Elemento");
        pil.push("Elemento1");
        pil.push("Elemento2");
        pil.push("Elemento3");
        System.out.print(pil);
        System.out.println("Se agrego el Elemento3");
        System.out.println("------------------------------");
        //Método para corroborar que esta vacia
        pil.isEmpty();
        System.out.println("¿La lista se encuentra vacía? : " + pil.isEmpty());
        System.out.println("------------------------------");

        //Método para regresar el numero de elementos en pila
        System.out.println("La pila tiene " + pil.getLength() + " elementos");
        System.out.println("------------------------------");
        //Método peek
        System.out.println("El elemento en el tope es: " + pil.tope);
        System.out.println("------------------------------");
        //Método pop
        System.out.println("El elemento a eliminar es: " + pil.pop());
        System.out.println("------------------------------");
        //Método peek despues del pop
        System.out.println("El elemento en el tope es: " + pil.tope);
        System.out.println("------------------------------");
       //isFull
       /* System.out.println("El limite de elementos es: " + pil.isFull());
       System.out.print("------------------------------");*/
        //toString 
        System.out.print("El estado actual  de la pila es el siguiente:\n"+ pil.toString());
        System.out.print("------------------------------");   
    }
}
