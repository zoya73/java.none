import java.util.*;

class Main{
public static void main(String[] args){
    System.out.println("Enter the number of income: ");
    Scanner scn = new Scanner(System.in);
    int income = scn.nextInt();
    int tax ;
    if (income<500000){
        System.out.println("the tax on it zero %:");
        tax = 0;
    }
    else if (income<= 500000 && income <1000000){
        System.out.println("the tax on it 20%:");
        tax= (int)(income*0.2);
        System.out.println("the total amount:"+tax);
    
    }
    else{
        System.out.println("the tax on 30%: ");
        tax = (int)(income*0.3);
        System.out.println("the total amount:"+tax);
    }

}
}
