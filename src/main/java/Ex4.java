import java.util.Scanner;

public class Ex4 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("4. Дан круг радиуса R. Определить, поместится ли правильный треугольник со стороной A в этом круге");

        System.out.println("Введите радиус окружности: ");
        double r = s.nextDouble();

        System.out.println("Введите сторону дреугольника: ");
        double a = s.nextDouble();

        if (r<=a*Math.sqrt(3)/3)
            System.out.println("Не поместится");
        else System.out.println("Поместится");
    }
}
