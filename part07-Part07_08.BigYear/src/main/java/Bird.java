
public class Bird {
    
    private String nameEnglish;
    private String nameLatin;
    private int numberOfObservation;
    
    public Bird(String nameEnglish, String nameLatin) {
        this.nameEnglish = nameEnglish;
        this.nameLatin = nameLatin;
        this.numberOfObservation = 0;
    }
    
    public String getNameEnglish() {
        return this.nameEnglish;
    }
    
    public String getNameLatin() {
        return this.nameLatin;
    }
    
    public int getNumberOfObservation() {
        return this.numberOfObservation;
    }
    
    public void addObservation() {
        this.numberOfObservation++;
    }
    @Override
    public String toString() {
        return this.nameEnglish + " (" + this.nameLatin + "): " + this.numberOfObservation 
                + (this.numberOfObservation != 1 ? " observations": " observation");
    }
}
