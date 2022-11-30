package even;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args)

    {
//        everything seems fine configuration problem i think
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a nu8mbere");
        int num = scanner.nextInt();
        if (num % num == 0 || num % 1 == 0) {
            System.out.println("prime");

        }else {
            System.out.println("not prime");
        }
    }
}
