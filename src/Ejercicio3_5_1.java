import java.io.File;
import java.io.IOException;
import java.util.Arrays;

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

            /*3._ Mostrar el contenido del directorio copias, indicando para cada elemento
            si se trata de un fichero o de un directorio.*/
            File[] archivos=dirCopias.listFiles();
            if(archivos!=null){
                for(File archivo:archivos){
                    if(archivo.isDirectory()){
                        System.out.println("Directorio: "+archivo.getName());
                    }
                    if(archivo.isFile()){
                        System.out.println("Archivo: "+archivo.getName());
                    }
                }
            }



            /*4._ Modificar el programa anterior para eliminar el fichero config.txt.
            Comprobar qué ocurre al intentar eliminar posteriormente el directorio copias.*/
           /* if(archivos!=null){
                for(File archivo:archivos){
                    if(archivo.isDirectory()){

                        System.out.println("Directorio: "+archivo.getName());
                    }
                    if(archivo.isFile() ){
                        if(archivo.delete()){
                            System.out.println("El archivo  "+archivo.getName()+" a sido borrado correctamente");
                        }else{
                            System.out.println("No se ha podido borrar el archivo");
                        }
                    }
                }
                if(dirCopias.delete()){
                    System.out.println("El directorio ha sido borrado correctamente");
                }
            }*/


        }
        catch (IOException e){
            System.out.println("ERROR: No se ha podido crear el archivo");
        }

    }
}
