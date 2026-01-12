
import java.util.ArrayList;

public class BirdDataBase {
    private ArrayList<Bird> birds;
    
    public BirdDataBase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String nameEnglish, String nameLatin) {
        this.birds.add(new Bird(nameEnglish, nameLatin));
    }
    
    public void observeOrShow(String command, String name) {
        boolean isABird = false;
        
        for(Bird bird : this.birds) {
            if(bird.getNameEnglish().equals(name)) {
                isABird = true;
                
                if(command.equals("Observation")){
                    bird.addObservation();
                } else if(command.equals("One")) {
                    System.out.println(bird);
                }
            }
        }
        
        if( isABird == false) {
            System.out.println("Not a bird!");
        }
    }
    
    @Override
    public String toString() {
        String string = "";
        boolean first = true;
        
        for(Bird bird: this.birds) {
            if(!first) {
                string += "\n";
            }
            string += bird;
            first = false;
        }
        
        return string;
    }
}
