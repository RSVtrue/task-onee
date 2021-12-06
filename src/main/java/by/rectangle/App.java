package by.rectangle;




import com.AreaLibrary.Area;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String... args ) {
        Area ar = new Area();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(ar.area(a,b));
        scanner.close();
    }
}
