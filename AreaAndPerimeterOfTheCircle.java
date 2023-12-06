import java.util.Scanner;

public class AreaAndPerimeterOfTheCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pi = 3.14;
        double r, area, perimeter;
        
        System.out.print("Enter a radius of circle: ");
        r = input.nextDouble();

        area = (r*r)*pi;
        perimeter = 2*pi*r;

        System.out.println("Area:"+area+"\nPerimeter:"+perimeter);
    }
}
