import java.util.Scanner;

public class KDV_Calculater {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final double KDV = 0.18;
        double price;

        System.out.print("Enter the price of product: ");
        price = input.nextFloat();

        System.out.printf("Your products KDV is %.2f TL \n",price*KDV);
    }
}
