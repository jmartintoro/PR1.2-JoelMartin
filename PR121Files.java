import java.io.File;
import java.io.IOException;
public class PR121Files {

    public static void main(String[] args) {
        File myFiles = new File("./myFiles");
            File file1 = new File("./myFiles/file1.txt");
            File file2 = new File("./myFiles/file2.txt");
        if (myFiles.mkdir()) {
            System.out.println("Carpeta " + myFiles.getName() + " creada");
        } else {
            System.out.println("error, la carpeta no s'ha creat");
        }
                // Creacio de file1.txt i file2.txt
        try {
            if (file1.createNewFile()) {
                System.out.println(file1.getName() + " creat");
            } else {
                System.out.println("error, l'arxiu no s'ha creat");
            }
            
            if (file2.createNewFile()) {
                System.out.println(file2.getName() + " creat");
            } else {
                System.out.println("error, l'arxiu no s'ha creat");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Renombrar l'arxiu file2.txt -> renamedFile.txt
        File renamedFile = new File("./myFiles/renamedFile.txt");
        System.out.println("\n");
        System.out.println(file2.getPath()+"\n");
        if (file2.renameTo(renamedFile)) {
            System.out.println("l'arxiu file2.txt s'ha renombrat per" + renamedFile.getName());
        } else {
            System.out.println("error, l'arxiu no s'ha renombrat");
        }

        // Mostrar el llistat dels arxius de myFiles
        File[] arxius = myFiles.listFiles();
        System.out.println("Els arxius de la carpeta son:");
        if (arxius.length != 0) {
            for (File arxiu : arxius) {
                System.out.println("- " + arxiu.getName());
            }
        } else {
            System.out.println("El directori está buit");
        }

        // Eliminar el arxiu file1.txt
        if (file1.delete()) {
            System.out.println("L'arxiu file1.txt s'ha eliminat");
        } else {
            System.out.println("error, l'arxiu no s'ha eliminat");
        }

        // Mostrar el llistat dels arxius de myFiles
        arxius = myFiles.listFiles();
        System.out.println("Els arxius de la carpeta son:");
        if (arxius.length != 0) {
            for (File arxiu : arxius) {
                System.out.println("- " + arxiu.getName());
            }
        } else {
            System.out.println("El directori está buit");
        }
    }

}
