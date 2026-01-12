
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File();
        RecipeCollection recipeCollection = new RecipeCollection();
        
        UserInterface ui = new UserInterface(scanner, file, recipeCollection);
        ui.start();        
    }

}
