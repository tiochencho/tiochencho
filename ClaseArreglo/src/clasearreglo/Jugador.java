
package clasearreglo;

/**
 *
 * @Yael Rubio hp
 */

public class Jugador {
    public String nombre;
    public int edad;
    public int numeroCuenta;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, int numeroCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", numeroCuenta=" + numeroCuenta + '}';
    }

      
    
}
