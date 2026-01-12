
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private File file;
    private RecipeCollection recipeCollection;
    
    public UserInterface(Scanner scanner, File file, RecipeCollection recipeCollection) {
        this.scanner = scanner;
        this.file = file;
        this.recipeCollection = recipeCollection;
    }
    
    public void start() {
        System.out.println("File to read: ");
        String fileName = this.scanner.nextLine();
        
        this.runFileReading(fileName);
        this.printOptions();
        
        while(true) {
            System.out.println("\nEnter command:");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")) {
                break;                
            }         
            
            if(command.equals("list")) {
                this.recipeCollection.printRecipeList();
            }
            
            if(command.equals("find name")) {
                this.recipeCollection.findRecipeByName(this.getName());
            }
            
            if(command.equals("find cooking time")) {
                this.recipeCollection.findRecipeByMaxtime(this.getMaxTime());
            }
            
            if(command.equals("find ingredient")) {
                this.recipeCollection.findRecipeByIngredient(this.getIngredient());
            }
        }
    }
    
    private void runFileReading(String fileName){
        file.readFile(fileName);
        String recipe = "";
        for(String line: file.getFileContent()) {
            if(!line.isEmpty()) {
                recipe += line + "\n";
            } else {
                this.recipeCollection.addRecipe(recipe);
                recipe = "";
            }
        }
        
        if(!recipe.isEmpty()) {
            this.recipeCollection.addRecipe(recipe);
        }
    }
    
    private void printOptions() {
        System.out.println("Commands:"
                + "\nlist - list the recipes"
                + "\nstop - stops the program"
                + "\nfind name - searches recipes by name"
                + "\nfind cooking time - searches recipes by cooking time"
                + "\nfind ingredient - searches recipes by ingredient");
    }
    
    private String getName() {
        System.out.println("Searched word:");
        String search = scanner.nextLine();
        
        return search;
    } 
    
    private int getMaxTime() {
        System.out.println("Max cooking time:");
        int maxTime = Integer.valueOf(scanner.nextLine());
        return maxTime;
    }
    
    private String getIngredient() {
        System.out.println("Ingredient:");
        String search = scanner.nextLine();
        
        return search;
    } 
}
