package conjuntoadt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Yael
 */
public class ConjuntoADT {

    public ConjuntoADT() {
    }

    
    public static void main(String[] args) {
        
       HashSet<Constructor> union, interseccion, diferencia;
        
        Constructor<Integer> lk = new Constructor<>();
        HashSet<Integer> ls = new HashSet<>();
        
        lk.agregarDato(5);
        lk.agregarDato(6);
        lk.agregarDato(88);
        lk.agregarDato(11);
        lk.agregarDato(17);
        
        System.out.println(lk);
        
        lk.getLongitud();
        
        System.out.println("------------------------------------");
        System.out.println("   Revisamos que el parametro etá dentro del conjunto  ");
        lk.contiene(5);
        
        lk.eliminarDato(11);
        System.out.println("------------------------------------");
        System.out.println("  Conjunto con el número 11 eliminado     ");
        System.out.println(lk);
        
        //ls = lk;
        ls.add(3);
        ls.add(9);
        ls.add(11);
        ls.add(6);
        
        System.out.println("--------------------------");
        System.out.println("    Método esIgual   ");
        lk.esIgual(ls);
        
        System.out.println("------------------------");
        System.out.println("    Método esSubConjunto   ");
        lk.esSubConjunto(ls);
        
        System.out.println("--------------------------");
        System.out.println("   Método unión   ");
        lk.union(ls);
        
        System.out.println("--------------------------");
        System.out.println("    Método intersección    ");
        lk.interseccion(ls);
        
        System.out.println("--------------------------");
        System.out.println("   Método diferencia   ");
        lk.diferencia(ls);
        
        System.out.println("--------------------------");
        System.out.println("   Método iterador   ");
        lk.iterador();
        
        System.out.println("--------------------------");
        System.out.println("   Fin del programa  ");
        
    }
    
}
        
        
    
    

