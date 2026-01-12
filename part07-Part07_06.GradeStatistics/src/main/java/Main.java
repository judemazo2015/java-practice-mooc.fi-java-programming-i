
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grade grade = new Grade();
        UserInterface ui = new UserInterface(scanner, grade);
        ui.start();
        
        System.out.println(grade);
        
        GradeDistribution gd = new GradeDistribution(grade.getPoints());
        System.out.println(gd);
    }
}
