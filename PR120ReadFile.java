import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PR120ReadFile {
   public static void main(String args[]) {
       int lineNumber = 1;
       File text = new File("./PR120ReadFile.java");
       Scanner sc;
       try {
           sc = new Scanner(text);
           while(sc.hasNextLine()){
               String line = sc.nextLine();
               System.out.println(lineNumber + ": " + line);
               lineNumber++;
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }
}
