
import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numbers from 10 to 50:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
