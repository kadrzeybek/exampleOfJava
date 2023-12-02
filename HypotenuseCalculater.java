import java.util.Scanner;

public class HypotenuseCalculater {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y;
        double c;

        System.out.print("Enter the first side length: ");
        x = input.nextInt();

        System.out.print("Enter the first side length: ");
        y = input.nextInt();

        c = Math.sqrt((x*x)+(y*y));

        System.out.println("Hypotenuse: "+ c);
    }
}
