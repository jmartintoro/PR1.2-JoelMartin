import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PR123append {

    public static void main(String[] args) {
        File file = new File("./frasesMatrix.txt");
        String salt = "\n";
         try {
            if (!file.exists()){
                file.createNewFile();
                salt = "";
            }
            // Append les frases a l'arxiu
            FileWriter fileWrite = new FileWriter(file, true);
            fileWrite.write(salt + " - \"Yo sólo puedo mostrarte la puerta\"\n - \"Tú eres quien la tiene que atravesar\"");
            fileWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
