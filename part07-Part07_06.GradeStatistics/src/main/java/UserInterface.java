
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private Grade grade;
    
    public UserInterface(Scanner scan, Grade grade) {
        this.scan = scan;
        this.grade = grade;
    }
    
    public void start(){
        System.out.println("Enter points totals, -1 stops: ");
              
        while(true) {
            int points = Integer.valueOf(this.scan.nextLine());
            
            if( points == -1) {
                break;
            }
            
            grade.addPoints(points);
            grade.addPassingPoints(points);
        }
    }
}
