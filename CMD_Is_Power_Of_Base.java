import java.util.Scanner;

/**Java CMD program for checking whether the input number is a power of base or not.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Is_Power_Of_Base{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");

            /** reading the next integer number and storing it in number integer variable */
            int number = input.nextInt();
            System.out.print("Please enter your base number: ");

            /** reading the next integer number and storing it in base_Number integer variable */
            int base_Number = input.nextInt();
            if (is_Power_Of_Base_Checker(number, base_Number)){
                System.out.println(number + " is a power of " + base_Number + ".");
            } else{
                System.out.println(number + " is not a power of " + base_Number + ".");
            }
            System.out.println("************************************************************");
        }
    }

    public static boolean is_Power_Of_Base_Checker(int number, int base){
    /** 
     * method for checking whether the input number is a power of base or not.
     * @param number  integer number
     * @param base  integer number
     * @return  boolean
     * <pre>
     *      is_Power_Of_Base_Checker(8, 2); // Output: true
     *      is_Power_Of_Base_Checker(15, 3); // Output: flase
     * </pre>
    */
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