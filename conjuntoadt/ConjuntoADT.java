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
        
        Constructor<Integer> dat = new Constructor<>();
        HashSet<Integer> elem = new HashSet<>();
        
        dat.agregarDato(5);
        dat.agregarDato(6);
        dat.agregarDato(88);
        dat.agregarDato(11);
        dat.agregarDato(17);
        
        System.out.println(dat);
        
        dat.getLongitud();
        
        System.out.println("------------------------------------");
        System.out.println("   Revisamos que el parametro etá dentro del conjunto  ");
        dat.contiene(5);
        
        dat.eliminarDato(11);
        System.out.println("------------------------------------");
        System.out.println("  Conjunto con el número 11 eliminado     ");
        System.out.println(dat);
        
        //ls = lk;
        elem.add(3);
        elem.add(9);
        elem.add(11);
        elem.add(6);
        
        System.out.println("--------------------------");
        System.out.println("    Método esIgual   ");
        dat.esIgual(elem);
        
        System.out.println("------------------------");
        System.out.println("    Método esSubConjunto   ");
        dat.esSubConjunto(elem);
        
        System.out.println("--------------------------");
        System.out.println("   Método unión   ");
        dat.union(elem);
        
        System.out.println("--------------------------");
        System.out.println("    Método intersección    ");
        dat.interseccion(elem);
        
        System.out.println("--------------------------");
        System.out.println("   Método diferencia   ");
        dat.diferencia(elem);
        
        System.out.println("--------------------------");
        System.out.println("   Método iterador   ");
        dat.iterador();
        
        System.out.println("--------------------------");
        System.out.println("   Fin del programa  ");
        
    }
    
}
        
        
    
    

