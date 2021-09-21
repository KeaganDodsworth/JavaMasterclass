package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isAnInt = true;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;

        while (isAnInt) {
            System.out.println("Enter a number ");
            isAnInt = scanner.hasNextInt();
            if (isAnInt) {

                int number = scanner.nextInt();

//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if (number < min){
                    min = number;
                }
                else if (number > max) {
                    max = number;
                }

            }else{
                break;
            }
            scanner.nextLine();

        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        scanner.close();


    }
}
