
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class File {
    private String fileName;
    private ArrayList<String> fileContent;
    
    public File() {
        this.fileName = "";
        this.fileContent = new ArrayList<>();
    }
    
    public void readFile(String fileName) {
        this.fileName = fileName;
        this.readLines();
    }
    
    private void readLines() {
        try (Scanner file = new Scanner(Paths.get(this.fileName))) {
            while(file.hasNextLine()) {
                this.fileContent.add(file.nextLine());
            }
            
        } catch(Exception e) {
            System.out.println("Error file: " + e);
        }
   
    }
    
    public ArrayList<String> getFileContent() {
        return this.fileContent;
    }
    
    public String toString() {
        String string = "";
        boolean first = true;
        
        for(String line: this.fileContent) {
            if(!first) {
                string += "\n";
            }
            string += line;
            first = false;
        }
        
        return string;
    }
}
