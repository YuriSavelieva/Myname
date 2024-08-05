public class Task6 {
    public static void main(String[]args){
        int a = 1; int b = 2; int c=a;
        a=b;
        b=c;
        c=a;

        System.out.print("a="+a);
        System.out.println("b="+b);
    }
}
