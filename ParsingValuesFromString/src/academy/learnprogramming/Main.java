package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString " + numberAsString);

        //Double.parseDouble
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString " + numberAsString);
        System.out.println("Number " + number);
    }
}
