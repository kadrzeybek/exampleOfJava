import java.util.Scanner;

class AverageCalculater {


public static void main(String[] args){
    float GC_score, GC_AKTS;
    float PE_score, PE_AKTS;
    float Cal_score, Cal_AKTS;
    float PH_score, PH_AKTS;
    float CP_score, CP_AKTS;
    float CPL_score, CPL_AKTS;
    float TL_score, TL_AKTS;
    float avarage;

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your General Chemistry Score and AKTS");
    System.out.print("General Chemistry Score: ");
    GC_score = input.nextFloat();
    System.out.print("General Chemistry AKTS: ");
    GC_AKTS = input.nextFloat();

    System.out.println("Enter Your Professional English Score and AKTS");
    System.out.print("Professional English Score: ");
    PE_score = input.nextFloat();
    System.out.print("Professional English AKTS: ");
    PE_AKTS = input.nextFloat();

    System.out.println("Enter Your Calculus Score and AKTS");
    System.out.print("Calculus Score: ");
    Cal_score = input.nextFloat();
    System.out.print("Calculus AKTS: ");
    Cal_AKTS = input.nextFloat();

    System.out.println("Enter Your Physics Score and AKTS");
    System.out.print("Physics Score: ");
    PH_score = input.nextFloat();
    System.out.print("Physics AKTS: ");
    PH_AKTS = input.nextFloat();

    System.out.println("Enter Your Computer Programming Score and AKTS");
    System.out.print("Computer Programming Score: ");
    CP_score = input.nextFloat();
    System.out.print("Computer Programming AKTS: ");
    CP_AKTS = input.nextFloat();

    System.out.println("Enter Your Computer Programming Lab Score and AKTS");
    System.out.print("Computer Programming Lab Score: ");
    CPL_score = input.nextFloat();
    System.out.print("Computer Programming Lab AKTS: ");
    CPL_AKTS = input.nextFloat();

    System.out.println("Enter Your Turkish Language Score and AKTS");
    System.out.print("Turkish Language Score: ");
    TL_score = input.nextFloat();
    System.out.print("Turkish Language AKTS: ");
    TL_AKTS = input.nextFloat();

    avarage = (GC_score*GC_AKTS+PE_score*PE_AKTS+Cal_score*Cal_AKTS+PH_score*PH_AKTS+CP_score*CP_AKTS+CPL_score*CPL_AKTS+TL_score*TL_AKTS)/30;

    System.out.printf("Your avarage: %.2f \n",avarage);

}
}