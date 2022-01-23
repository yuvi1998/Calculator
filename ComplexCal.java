
import java.util.Scanner;
import java.util.*;

public class ComplexCal{

    public static void main(String[]  args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no: ");
        String s1 = sc.nextLine();
        System.out.print("enter 1st no: ");
        String s2 = sc.nextLine();
        System.out.print("enter operation ( +,-,*,/ ) ");
        String op = sc.nextLine();
        double r =0;
       
        try {
            double a1 = Double.parseDouble(s1);
            double a2 = Double.parseDouble(s2);
        
        switch(op){
            case "+":
            r = a1+a2;;
            break;

            case "-":
            r = a1-a2;
            break;

            case "/":
            r = a1/a2;
            break;

            case "*":
            r = a1*a2;
            break;

            default:
            System.out.println("invalied option" + op);
            return;
        }
        System.out.println("result is : " + r); 
    } 
    catch (Exception e) {
        System.out.println("Not a valid Number" + e.getMessage());
    }
}   
        }