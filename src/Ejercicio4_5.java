import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4_5 {
    public static void main(String[] args) {

        /*1._ Desarrollar un programa que lea el fichero datos.txt y
        muestre por pantalla el número total de líneas que contiene.*/

        try(BufferedReader br=new BufferedReader(new FileReader("copias/datos.txt"))){
            String line;
            int contador=0;
            while((line=br.readLine())!=null){
                contador++;
            }
            System.out.println("El archivo tiene "+contador+" lineas escritas");
        }catch(IOException e){
            System.out.println("ERROR: No se ha podido leer el fichero");
        }

        /* 2._ Desarrollar un programa que solicite una palabra por teclado y muestre cuántas
        líneas del fichero datos.txt contienen dicha palabra. No es necesario distinguir entre
        mayúsculas y minúsculas.*/

        try(BufferedReader br=new BufferedReader(new FileReader("copias/datos.txt"))){
            Scanner sc=new Scanner(System.in);

            System.out.print("Introduzca palabra que desea buscar: ");
            String palabra= sc.next();

            int count=0;
            String line;
            String pa="";
            while((line=br.readLine())!=null){
                if(line.contains("Hola")){
                    count++;
                }
            }
            System.out.println("La palabra "+palabra+" aparece en "+count+" lineas");



        }catch (IOException e){
            System.out.println("ERROR: No se ha podido leer el fichero");
        }

    }
}
