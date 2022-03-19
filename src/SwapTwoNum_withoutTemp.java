import java.util.Scanner;

public class SwapTwoNum_withoutTemp {
    public static void main(String args[]) {
        System.out.println("Enter values of x and y");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int y = sc.nextInt();

        System.out.println("Before swapping numbers: X = " + x + " Y = " + y);

        x = x + y;

        y = x - y;

        x = x - y;

        System.out.println("After swapping: X = " + x + " Y = " + y);


    }
}
