
public class Archive {
    private Item item;
    
    public Archive(Item item) {
        this.item = item;
    }
    
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)) {
            return false;
        }
        Archive otherArchive = (Archive) compared;
        Item comparedItem = otherArchive.item;
        
        if(this.item.getIdentifier().equals(comparedItem.getIdentifier())) {
            
            return true;
        }
        
        return false;
        
    }
    
    public String toString() {
        return this.item.getIdentifier() + ": " + this.item.getName();
    }
}
