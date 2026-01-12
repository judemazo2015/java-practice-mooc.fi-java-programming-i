
import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold (int maximumWeight) {
        this.maximumWeight = maximumWeight; 
        this.suitcases = new ArrayList<>();
    }
    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : this.suitcases) {
            sum += suitcase.totalWeight();
        }
        
        return sum;
    }
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int size = this.suitcases.size();
        if(size == 0) {
            return "no items (0 kg)";
        }
        
        return size + (size > 1 ? " suitcases" : " suitcase") + "(" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for(Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
