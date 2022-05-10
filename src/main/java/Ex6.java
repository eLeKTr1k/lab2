import java.util.Scanner;

public class Ex6 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("6. Дано натуральное число n. Проверить, есть ли в записи числа три одинаковые цифры (n < 9999).");

        int n = 0;
        while (n>9999 || n<=0) {
            System.out.println("Введите натуральное число не превышающее 9999: ");
            n = s.nextInt();
        }

        if (n<100)
            System.out.println("Отстутствует");
        else {
            int a, b, c, d;

            a = n/1000;
            b = (n/100)%10;
            c = (n/10)%10;
            d = n%10;

            if (a==b && a==c) System.out.println("Имеется");
            else if (a==b && a==d) System.out.println("Имеется");
            else if (a==c && a==d) System.out.println("Имеется");
            else if (b==c && b==d) System.out.println("Имеется");
            else System.out.println("Отсутствует");
        }
    }
}
