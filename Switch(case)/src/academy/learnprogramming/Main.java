package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("actually it was a "+ switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'G';
        switch(charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'D':case 'E':case 'F':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Couldnt find A, B, C, D or F");
                break;
        }
        String month = "JUNE";
        switch (month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}