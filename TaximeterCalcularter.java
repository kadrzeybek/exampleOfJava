import java.util.Scanner;

public class TaximeterCalcularter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final double priceOfKm = 2.20;
        final int startingPrice = 20;
        double distance,price;


        System.out.println("How many kilometers did you go?");
        distance = input.nextDouble();
        if (distance > 0){
            price = startingPrice + (distance*priceOfKm);
            System.out.printf("Your debt is %.2f Tl\n", price);
        }else if (distance == 0 ){
            System.out.println("You don't have any debt");

        }
        else{
            System.out.println("Please enter a current value!");

        }

        


    }
}
