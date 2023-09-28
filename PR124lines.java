import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class PR124lines {

    public static void main(String[] args) {
        File file = new File("./numeros.txt");

        if (file.exists()){
            System.out.println("L'arxiu numeros.txt ja existeix");
        } else {
            try {
                file.createNewFile();
                FileWriter fileWrite = new FileWriter(file, true);
                int cont = 0;
                // Omplir el arxiu amb numeros aleatoris
                do {
                    Random random = new Random();
                    int randomNum = random.nextInt(1000) + 1;
                    fileWrite.write(randomNum + "\n");
                    cont++;
                } while (cont != 10);
                
                fileWrite.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    
}
