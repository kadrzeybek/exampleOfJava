import java.util.Scanner;

public class BodyMassIndexCalculater {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double mass,height,index;

        System.out.print("Enter your mass(kg): ");
        mass = input.nextDouble();

        System.out.print("Enter your height(m): ");
        height = input.nextDouble();

        index = mass/(height*height);

        System.out.printf("Your body mass index:%.2f\n",index);


    }
}