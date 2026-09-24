import java.io.File;

public class Ejercicio3_5_1 {
    public static void main(String[] args) {
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
    }
}
