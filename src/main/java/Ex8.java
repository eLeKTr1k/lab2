import java.util.Scanner;

public class Ex8 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("8. Дано натуральное число n и действительное а. Найти сумму n членов ряда ");

        double a = 0;
        int n = 0;

        while (n<1) {
            System.out.println("Введите натуральное n: ");
            n = s.nextInt();
        }

        System.out.println("Введите действительное a: ");
        a = s.nextInt();

        int i;
        double S = 0;

        for(i = 0; i < n; i++) {
            S = S + 1/Math.pow(a,2*(i+1)-2);
        }
        System.out.println("Результат: " + S);
    }
}