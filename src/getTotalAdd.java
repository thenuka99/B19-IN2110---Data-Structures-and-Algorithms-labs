import java.util.Scanner;
public class getTotalAdd {
    public static void main(String[] args) {
        int number;
        //get the input from the user
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        //convert string into an integer
        number = input.nextInt();

        //call the method
        int total = getTotal(number);
        System.out.println("Sum = " + total);
        //close the scanner instance
        input.close();
    }
    public static int getTotal(int number) {
        //check whether the number not equals to zero
        if (number != 0) {
            //recursively calling the function
            return number + getTotal(number - 1);
        }
        //return the total when the number becomes zero
        else {
            return number;
        }
    }
}
