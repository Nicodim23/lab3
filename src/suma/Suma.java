package suma;

import java.util.Scanner;
public class Suma {
    public static void main(String[] args)
    {
        int sum = 0;
        int x = 0;
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Adauga numerele: ");
        n = in.nextInt();
        while(n > 0)
        {
            x = n % 10;
            sum = sum + x;
            n = n/10;

        }
    System.out.println("Suma este: " + sum);

    }
}

