import java.util.Scanner; /**
 * Additional task
 * Напишите программу, где пользователь вводит любое целое положительное число. А
 * программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
 * числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
 * ввести некорректные данные
 */
public class LastTask{
public static void main(String[]args) {
    Scanner scanner=new Scanner(System.in);
        System.out.print("Введите любое целое положітельное число:");
    int maxNumber=scanner.nextInt();
    if (maxNumber<1){
        System.out.println("Данные введены некорректно");
        int sum = 0;
        for (int i = 1; i < maxNumber; i++){
            System.out.println(sum += i);

        }

    }

    }}
