
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            
            if(id.isEmpty()) {
                break;
            }
            
            System.out.println("Name?");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            } else {
                Archive archItem = new Archive(new Item(id, name));
            
                if(!(archive.contains(archItem))) {
                    archive.add(archItem);
                }                
            }          
        }
        
        for (Archive content: archive) {
            System.out.println(content);
        }
    }
}
