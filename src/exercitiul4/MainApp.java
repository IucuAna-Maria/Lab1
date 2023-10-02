package exercitiul4;
import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(30) + 1;
        int m = rand.nextInt(30) + 1;
        System.out.print("Cmmdc al numerelor " +n +" si " +m +" este: ");
        while (n != m)
            if (n > m)
                n -= m;
            else
                m -= n;
        System.out.println(n +".");
    }
}
