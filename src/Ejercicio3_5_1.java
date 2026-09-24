import java.io.File;
import java.io.IOException;

public class Ejercicio3_5_1 {
    public static void main(String[] args) {
        try{
            /*1._ Crear un programa que cree un directorio llamado copias
            en la carpeta del proyecto. Si el directorio ya existe, mostrar
            un mensaje informando de ello.*/

            File dirCopias=new File("C:\\Users\\Robert\\Desktop\\DAM" +
                    "\\2º\\ACCESO A DATOS\\Ejercicios\\Ejercicios_Ficheros\\copias");

            if(dirCopias.mkdir()){
                System.out.println("Directorio creado correctamente");
            }
            else {
                System.out.println("El directorio "+dirCopias.getName()+" ya existe");
            }

            /*2._ Crear un fichero llamado config.txt dentro del directorio copias.
            Si el fichero ya existe, indicarlo por pantalla.*/

            File config=new File("copias/config.txt");
            if(config.createNewFile()){
                System.out.println("Archivo creado correctamente");
            }
            else{
                System.out.println("El archivo no ha podido ser creado");
            }

        }
        catch (IOException e){
            System.out.println("No se ha podido crear el archivo");
        }

    }
}
