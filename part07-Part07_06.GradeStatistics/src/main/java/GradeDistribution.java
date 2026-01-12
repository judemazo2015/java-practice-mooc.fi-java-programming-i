
import java.util.ArrayList;

public class GradeDistribution {
    private ArrayList<Integer> points;
    private int numberOfFives;
    private int numberOfFours;
    private int numberOfThrees;
    private int numberOfTwos;
    private int numberOfOnes;
    private int numberOfZeros;

    public GradeDistribution(ArrayList<Integer> points) {
        this.points = points;
        this.numberOfFives = 0;
        this.numberOfFours = 0;
        this.numberOfThrees = 0;
        this.numberOfTwos = 0;
        this.numberOfOnes = 0;
        this.numberOfZeros = 0;
        
        distributePoints();
    }
    
    private void distributePoints() {
        for (int i=0; i<this.points.size(); i++) {
            int points = this.points.get(i);
            if(points < 50) {
                this.numberOfZeros ++;
            } else if (points < 60) {
                this.numberOfOnes++;
            } else if (points < 70) {
                this.numberOfTwos++;
            } else if (points < 80) {
                this.numberOfThrees++;
            } else if (points < 90) {
                this.numberOfFours++;
            } else {
                this.numberOfFives++;
            }
        }
    }
    
    private String stars(int number) {        
        String stars = "";
        
        for(int i=0; i<number; i++) {
            stars += "*";
        }
        
        return stars;
    }
    
    @Override
    public String toString() {
        return "Grade distribution:"
                + "\n5: " + this.stars(this.numberOfFives)
                + "\n4: " + this.stars(this.numberOfFours)
                + "\n3: " + this.stars(this.numberOfThrees)
                + "\n2: " + this.stars(this.numberOfTwos)
                + "\n1: " + this.stars(this.numberOfOnes)
                + "\n0: " + this.stars(this.numberOfZeros);
    }
}
