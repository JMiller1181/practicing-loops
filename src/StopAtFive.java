import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();
            if (num == 5) {
                break;
            }
        }

    }
}
