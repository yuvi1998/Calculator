
import java.util.Scanner;
import java.util.*;

public class SimpleCalculator{

    public static void main(String[]  args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no: ");
        String s1 = sc.nextLine();
        System.out.print("enter 1st no: ");
        String s2 = sc.nextLine();

        double a1 = Double.parseDouble(s1);
        double a2 = Double.parseDouble(s2);
  
        System.out.print("enter operation ( +,-,*,/ ) ");
        String op = sc.nextLine();

        double r=0;
        switch(op){
            case "+":
            r = a1+a2;
            System.out.println("output is " + r);
            break;
            case "-":
            r = a1-a2;
            System.out.println("output is " + r);
            break;
            case "/":
            r = a1/a2;
            System.out.println("output is " + r);
            break;
            case "*":
            r = a1*a2;
            System.out.println("output is " + r);
            break;
            default:
            System.out.println("invalied option" + op);
        }
        
    }
}