import java.util.Scanner;

public class Ex3 {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("3. На плоскости XOY задана своими координатами точка А. Указать, где она расположена: на какой оси или в каком координатном угле");

        System.out.println("Координата X: ");
        double x = s.nextDouble();

        System.out.println("Координата Y: ");
        double y = s.nextDouble();

        System.out.println("Точка расположена ");

        if(x==0 && y==0) System.out.println("в начале координат");
        else if (x==0 && y!=0) System.out.println("на оси Y");
        else if (x!=0 && y==0) System.out.println("на оси X");
        else if (x>0 && y>0) System.out.println("I четверть");
        else if (x<0 && y>0) System.out.println("II четверть");
        else if (x<0 && y<0) System.out.println("III четверть");
        else if (x>0 && y<0) System.out.println("IV четверть");
    }
}
