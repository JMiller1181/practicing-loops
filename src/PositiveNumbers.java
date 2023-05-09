import  java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("Number must be a positive number.");
            } else {
                System.out.println("The number is " + num);
            }
        }
    }
}
