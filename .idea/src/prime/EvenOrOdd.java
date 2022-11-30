package prime;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");

        }else {
            System.out.println("odd");
        }

    }

}
