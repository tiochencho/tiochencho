package pilasadt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Stack;

public class PilaSADT {

    public static void main(String[] args) {
        Constructor c = new Constructor();
        Scanner sn = new Scanner(System.in);
        //Llamando al metodo para leer el texto1
        String t1 = c.leerTxt("C:\\Users\\hp\\Downloads\\texto1.txt");
        System.out.println(t1);
        sn = new Scanner(t1);

        String entrada = t1;
         //Pila de tipo caracter 
        Stack<Character> pila = new <Character> Stack();
        int i = 0;
        int tamanio = entrada.length();
        while (i < tamanio) {
            if (entrada.charAt(i) == '(') {
                pila.push(')');
            } else {
                if (pila.isEmpty()) {
                    break;
                } else {
                    pila.pop();
                }
            }

            i++;
        }
        if (pila.isEmpty() & i == tamanio) {
            System.out.println("Esta llena");
        } else {
            System.out.println("Está vacia");
        }
        Constructor c1 = new Constructor();
        Scanner sc = new Scanner(System.in);
        //Llamando al metodo para leer el texto2
        String t2 = c1.leerTxt("C:\\Users\\hp\\Downloads\\texto2.txt");
        System.out.println(t2);
        sc = new Scanner(t2);
        
        String entrada1 = t2;

        Stack<Character> pila1 = new <Character> Stack();
        int i1 = 0;
        int tamanio1 = entrada1.length();
        while (i1 < tamanio1) {
            if (entrada1.charAt(i1) == '(') {
                pila1.push(')');
            } else {
                if (pila1.isEmpty()) {
                    break;
                } else {
                    pila1.pop();
                }
            }

            i1++;
        }
        if (pila1.isEmpty() & i1 == tamanio1) {
            System.out.println("Esta llena");
        } else {
            System.out.println("Está vacia");
        }

    }

}
