// using the trenary opertor to check the status of the student marks
import java.util.*;
class trenary_operator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        int marks = scn.nextInt();
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("The student has: " + result);
        
    }
}       