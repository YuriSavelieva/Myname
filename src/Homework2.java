

import java.util.Scanner; /**
 * Task 4
 * Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */
public class Homework2 {
    public static void main(String[] args) {
        int c = 1;
        while (c <= 98) {
            System.out.println(c+=6);
            if (c>99){
                break;}
             c++;
        }
    }
}


