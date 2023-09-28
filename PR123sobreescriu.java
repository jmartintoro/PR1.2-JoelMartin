import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PR123sobreescriu {

    public static void main(String[] args) {
        File file = new File("./frasesMatrix.txt");

        if (file.exists()){
            file.delete();
        }
        try {
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            fileWrite.write(" - \"Yo sólo puedo mostrarte la puerta\"\n - \"Tú eres quien la tiene que atravesar\"");
            fileWrite.close();
            } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
