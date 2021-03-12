//Author: Santigie Sankoh
//Author: Pacifique Linda IKIREZI

import java.util.Scanner;
//Declaration of a class
class Numbers{
//Declaration of main method
    public static void main(String[] args){
        int number = 0;
        int reversenumber = 0;
        System.out.print("PLEASE ENTER A NUMBER AND CLICK ENTER: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
//While Loop is for reversing entered number
        while( number != 0 ){
            reversenumber = reversenumber * 10;
            reversenumber = reversenumber + number % 10;
            number = number / 10;
        }
        System.out.println("THE REVERSE OF YOUR INPUT IS: " + reversenumber);
    }
}
