import java.util.Scanner;

public class Ex2 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("2. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел");

        System.out.println("Введите первое число: ");
        double x = s.nextDouble();

        System.out.println("Введите второе число: ");
        double y = s.nextDouble();

        double res;

        res = (Math.pow(x,3) + Math.pow(y,3))/2;
        System.out.println("Среднее арифметическое кубов этих чисел = " + res);

        res = Math.sqrt(Math.abs(x*y));
        System.out.println("Среднее геометрическое модулей этих чисел = " + res);
    }
}
