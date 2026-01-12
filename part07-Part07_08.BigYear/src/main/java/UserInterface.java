
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdDataBase database;
    
    public UserInterface(Scanner scanner, BirdDataBase database) {
        this.scanner = scanner;
        this.database = database;
    }
    
    public void start() {
        while(true) {
            System.out.println("?");
            String command = this.scanner.nextLine();
            
            if(command.equals("Quit")) {
                break;
            }
            
            if(command.equals("Add")) {
                this.addABird();
            }
            
            if(command.equals("All")) {
                System.out.println(this.database);
            }
            
            if(command.equals("Observation")) {
                this.observeOrShow(command);
            }
            
            if(command.equals("One")) {
                this.observeOrShow(command);
            }
        }
    }
    
    private void addABird() {
        System.out.println("Name:");
        String nameEnglish = this.scanner.nextLine();
        System.out.println("Name in Latin:");
        String nameLatin = this.scanner.nextLine();
        this.database.addBird(nameEnglish, nameLatin);
    }
    
    private void observeOrShow(String command) {
        System.out.println("Bird?");
        String input = this.scanner.nextLine();
        this.database.observeOrShow(command, input);
    }
}
