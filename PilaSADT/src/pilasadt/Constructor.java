package pilasadt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class Constructor {
//Creación del método 
    public String leerTxt(String direccion) { //Recibe la direccion del archivo

        String texto = "";
        try { //Se necesita try para validar o evitar errores
            //Declaración del objeto para abrir el archivo
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            //String temporal para guardar el texto 
            String temp = "";
            //Declarar que se va a leer un Bufread
            String bfRead;
            //Declaración para leer las lineas para que devuelva un string 
            while ((bfRead = bf.readLine()) != null) { 
                //Y se haga el ciclo bfRead aun contenga datos
                //Temp va a tener el valor de bfRead 
                temp = temp + bfRead;

            }
            //Se le asigna a texto lo que hay en temp, ya que este solo tiene 
            //función en el try
            texto = temp;

        } catch (Exception e) {//Excepción si es que no hay texto existente
            System.out.println("No se encontro archivo");
        }
        //Se retorna un texto
        return texto;
    }
}
