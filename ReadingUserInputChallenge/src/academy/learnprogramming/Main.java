package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while (counter <= 10){
            System.out.println("Enter number #" + counter);

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                sum +=  number;


            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();
            counter ++;
        }
        System.out.println("Sum " + sum);
        scanner.close();

    }
}
