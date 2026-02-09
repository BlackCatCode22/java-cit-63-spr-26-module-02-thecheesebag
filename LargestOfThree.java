import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.print("Enter third number: ");
        int third = input.nextInt();
        
        int biggest;

        if (first > second) {
            if (first > third) {
                biggest = first;
            } else {
                biggest = third;
            }
        } else {
            if (second > third) {
                biggest = second;
            } else {
                biggest = third;
            }
        }

        System.out.println("The largest number is " + biggest);
    }
}
