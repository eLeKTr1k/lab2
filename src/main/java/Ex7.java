import java.util.Scanner;

public class Ex7 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("7. Покажите что равенство верно ");

        System.out.println("Введите n: ");
        double n = s.nextDouble();
        int i;
        double res1 = 0, res2 = 0;


        for(i = 0; i < n; i++) {
            res1 = res1 + (Math.pow(i+1,5))+(Math.pow(i+1,7));
            res2 = res2 + (i+1);
        }
        res2 = 2*Math.pow(res2,4);
        System.out.println("Результат: " + res1 + " = " + res2);
    }
}