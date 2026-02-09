
import java.util.Scanner;
public class FunWithMethods {
    public static void main(String[] args) {
        
        int num1= getAnIntFromTheUser();
        int num2= getAnIntFromTheUser();
        compareTwoInts(num1,num2);

        int sum= sumTwoInts(num1, num2);
        System.out.println("The sum of the two is "+sum);

    }
    public static int getAnIntFromTheUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        return number;
        
    }
    public static void compareTwoInts(int a, int b){
        if (a>b){
            System.out.println(a+" is larger than " + b);
        }
            else if (b>a){
                System.out.println(b+" is larger than " + a);
            }
            else {
                System.out.println("The numbers are the same.");
            }

        
    }
    public static int sumTwoInts(int a, int b){
        int sum=a+b;
        return sum;

        
    }
}
