
import java.util.ArrayList;

public class RecipeCollection {
    private ArrayList<Recipe> recipeCollection;
    
    public RecipeCollection() {
        this.recipeCollection = new ArrayList<>();
    }
    
    public void addRecipe(String recipe) {
        String[] strings = recipe.split("\n");
        
        String name = strings[0];
        int cookingTime = Integer.valueOf(strings[1]);
        ArrayList<String> ingredients = new ArrayList<>();        
        for(int i=2; i<strings.length; i++){
            ingredients.add(strings[i]);
        }
        
        this.recipeCollection.add(new Recipe(name, cookingTime, ingredients));
    }
    
    public void printRecipeList() {
        System.out.println("Recipes:");
        for(Recipe recipe : this.recipeCollection) {
            System.out.println(recipe);
        }
    }
    
    public void findRecipeByName(String nameToSearch) {
        System.out.println("Recipes:");
        for(Recipe recipe: this.recipeCollection) {
            if(recipe.getName().contains(nameToSearch)) {                
                System.out.println(recipe);
            }
        }
    }
    
    public void findRecipeByMaxtime(int maxTime) {
        System.out.println("Recipes:");
        for(Recipe recipe: this.recipeCollection) {
            if(recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findRecipeByIngredient(String ingredientToSearch) {
        System.out.println("Recipes:");
        
        for(Recipe recipe : this.recipeCollection) {
            for(String ingredients : recipe.getIngredients()) {
                if(ingredients.equals(ingredientToSearch)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
