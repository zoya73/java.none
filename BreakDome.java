import java.util.*;
public class BreakDome  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to print :");
        do {
            int n = sc.nextInt();
            if (n % 10 == 0)
            { 
                 break;
            }
            System.out.println(n);
        } while (true);
        sc.close();
    }
}
