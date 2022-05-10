import java.util.Scanner;
import org.apache.log4j.*;

public class Ex1 {

    private static final Logger log = Logger.getLogger(Ex1.class);

    public static void main (String [] args) {

        log.debug("Задание 1.");

        Scanner s = new Scanner(System.in);
        System.out.println("1. Вычислить значение выражения ");

        log.debug("1. Вычислить значение выражения ");

        System.out.println("Введите X: ");
        double x = s.nextDouble();

        System.out.println("Введите Y: ");
        double y = s.nextDouble();

        double res;
        res = (3 + Math.exp(y-1))/(1 + Math.pow(x,2) * Math.abs(y - Math.tan(x)));

        System.out.println("Результат: " + res);
    }
}