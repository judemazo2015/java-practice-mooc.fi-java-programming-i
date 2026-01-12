
import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    
    
    public Grade() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();     
    }
    
    public ArrayList<Integer> getPoints() {
        return this.points;
    }
    
    public void addPoints(int points) {
        if(points > -1 && points < 101) {
            this.points.add(points);
        }        
    }
    
    public void addPassingPoints(int points) {
        if(points > 49 && points < 101) {
            this.passingPoints.add(points);
        }
    }
    
    public int getSum() {
        int sum = 0;
        
        for(int i=0; i<this.points.size(); i++) {
            sum += this.points.get(i);
        }
        
        return sum;        
    }
    
    public int getPassingSum() {
        int sum = 0;
        
        for(int i=0; i<this.passingPoints.size(); i++) {
            sum += this.passingPoints.get(i);
        }
        
        return sum;
    }
    
    public double getPercentage() {
        
        if(this.points.size() != 0) {
            return (1.0 * this.passingPoints.size() / this.points.size()) * 100;
        }
        return 0.0;
    }
    
    @Override
    public String toString() {
        int sum = this.getSum();
        int passingSum = this.getPassingSum();
        
        
        return "Point average (all): " + (sum * 1.0) / this.points.size()
                +"\nPoint average (passing): " 
                + (this.passingPoints.isEmpty() ?  "-" : (1.0 * passingSum) / this.passingPoints.size())
                +"\nPassing percentage: " +  this.getPercentage();
    }    
}