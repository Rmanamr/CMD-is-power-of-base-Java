/*Check whether the input number is a power the base number or not*/

import java.util.Scanner;

public class IsPowerOfBase{
    public static void main(String[] args){
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            System.out.print("Enter a base number: ");
            int base = input.nextInt();
            if (isPowerOfBaseChecker(number, base)){
                System.out.println(number + " is a power of " + base + ".");
            } else{
                System.out.println(number + " is not a power of " + base + ".");
            }
        }
    }

    public static boolean isPowerOfBaseChecker(int number, int base){
        if (number <= 0 || base <=0){
            return false;
        }
        while(number > 1){
            if (number % base != 0){
                return false;
            }
            number /= base;
       }
       return true;
    }
}


// by Arman Azarnik
// armanazarnik@gmail.com