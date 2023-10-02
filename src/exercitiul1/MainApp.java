package exercitiul1;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("la = ");
        int la = scanner.nextInt();
        System.out.print("Lu = ");
        int Lu = scanner.nextInt();
        System.out.println("Ati introdus latimea " + la + " si lungimea " + Lu);
        System.out.println("P = " +2*(Lu+la));
        System.out.print("A = " +(Lu*la));
    }
}
