import java.util.Scanner;

public class getLesson2 {
    public static void main(String[] args) {
        System.out.println("Введіте температуру на уліце:");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = -5;
        int b = -20;
        if (t > -5) {
            System.out.println("Warm");
        } else if (t > b) {
            System.out.println("Normal");
        } else if (b >= t) {
            System.out.println("Cold");

        }
    }
}


