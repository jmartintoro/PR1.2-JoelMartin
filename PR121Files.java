import java.io.File;
import java.io.IOException;
public class PR121Files {

    public static void main(String[] args) {
        File myFiles = new File("./myFiles");
            File file1 = new File("./myFiles/file1.txt");
            File file2 = new File("./myFiles/file2.txt");
        // Creacio del directori
        try {   
            if (myFiles.mkdir()) {
                System.out.println("Carpeta " + myFiles.getName() + " creada");
            } else {
                System.out.println("error");;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Creacio de file1.txt i file2.txt
        try {
            if (file1.createNewFile()) {
                System.out.println(file1.getName() + " creat");
            } else {
                System.out.println("error");
            }
            
            if (file2.createNewFile()) {
                System.out.println(file2.getName() + " creat");
            } else {
                System.out.println("error");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        

        // Renombrar l'arxiu file2.txt -> renamedFile.txt
        File renamedFile = new File("/myFiles/renamedFile.txt");
        if (file2.renameTo(renamedFile)) {
            System.out.println("l'arxiu file2.txt s'ha renombrat per renamedFile.txt");
        } else {
            System.out.println("error");
        }

        // Mostrar el llistat dels arxius de myFiles
        myFiles.
        // Eliminar el arxiu file1.txt
        if (file1.delete()) {
            System.out.println("L'arxiu file1.txt s'ha eliminat");
        } else {
            System.out.println("error");
        }
    }

}
