
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdDataBase database = new BirdDataBase();
        
        UserInterface ui = new UserInterface(scan, database);
        
        ui.start();
    }

}
