import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
