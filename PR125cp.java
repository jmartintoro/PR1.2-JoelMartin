import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PR125cp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Arxiu que vols copiar:");
        String f1 = sc.nextLine();
        File fileOrign = new File(f1);
        if (!fileOrign.exists()){
            System.out.println("L'arxiu no existeix");
            System.exit(0);
        }
        System.out.println("Destí de l'arxiu:");
        String f2 = sc.nextLine();
        File file2 = new File(f2);
        if (file2.exists()) {
            System.out.println("L'arxiu ja existeix");
            System.exit(0);  
        }
        // copia fileOrign -> fileDest
        Scanner scRead;
        try {
            FileWriter fileDest = new FileWriter(file2, true);
            scRead = new Scanner(fileOrign);
            while(scRead.hasNextLine()){
                String line = scRead.nextLine();
                fileDest.write(line + "\n");
                System.out.println(line);
            }
            fileDest.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
