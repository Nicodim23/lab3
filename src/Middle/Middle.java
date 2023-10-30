package Middle;

import java.util.Scanner;
public class Middle {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Scrie ceva: ");
        String str = in.nextLine();
        System.out.print("Mijlocul este: " + middle(str)+"\n");
    }
    public static String middle(String str)
    {
        int poz;
        int lung;
        if (str.length() % 2 == 0)
        {
            poz = str.length() / 2 - 1;
            lung = 2;
        }
        else
        {
            poz = str.length() / 2;
            lung = 1;
        }
        return str.substring(poz, poz + lung);
    }
}
