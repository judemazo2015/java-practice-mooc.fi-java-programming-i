
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase (int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if((this.totalWeight() + item.getWeight()) <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public String toString() {  
        int size = this.items.size();
        
        if(size == 0) {
            return "no items (0 kg)";
        }
        return  size + (size > 1 ? " items": " item") + " (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Item item: this.items) {
            sum += item.getWeight();
        }
        
        return sum;
    }
    
    public Item heaviestItem() {        
        if(this.items.size() == 0) {
            return null;
        }
        Item heaviest = this.items.get(0);
        
        for (Item item: this.items) {
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
