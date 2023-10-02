package exercitiul5;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(21);
        int a = 1, b = 1, c = 0;
        if (n == 1)
            System.out.println("Numarul " +n +" face parte din sirul lui Fibonacci");
        else
        {
            while (a + b <= n)
            {
                c = a + b;
                a = b;
                b = c;
            }
            if (n == c && n != 0)
                System.out.println("Numarul " +n +" face parte din sirul lui Fibonacci");
            else
                System.out.println("Numarul " +n +" nu face parte din sirul lui Fibonacci");
        }
    }
}
