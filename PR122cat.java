import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PR122cat {
    static Scanner sc = new Scanner(System.in); // System.in és global

    public static void main(String[] args) {
        PR122cat pr = new PR122cat();
        System.out.println("Ruta de l'arxiu: ");
        String opt = sc.nextLine();
        File text = new File(opt);
        System.out.println(text.getPath());

        if(text.isFile()) {
            pr.readFile(text);
        } else {
            System.out.println("El path no correspon a un arxiu, sinó a una carpeta");
        } 
    }

    public void readFile(File f){
        Scanner scRead;
        try {
            System.out.println("File: \n");
            scRead = new Scanner(f);
            while(scRead.hasNextLine()){
                String line = scRead.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
