package exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int i, contor = 1;
        if(n == 1)
            System.out.println("Numarul " +n +" nu este nici numar prim, nici numar compus.");
        else
        {
            System.out.print("Divizorii lui " +n +" sunt: ");
            for(i = 1; i <= n/2; i++)
            {
                if(n % i == 0)
                {
                    System.out.print(i +", ");
                    contor++;
                }
            }
            System.out.println(n +".");
            if(contor == 2)
                System.out.println("Numarul " +n +" este prim.");
        }
    }
}
