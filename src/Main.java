import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Inputs
        System.out.println("Total: ");
        double totalBill = input.nextDouble();
        System.out.println("Tip Percentage in Whole Number: ");
        double tip = input.nextInt();
        System.out.println("Number of People: ");
        int numberOfPeople = input.nextInt();
        //Calculations
        double tipPercentage = tip/100;
        double totalTip = tipPercentage * totalBill;
        double tipPerPerson = totalTip/numberOfPeople;
        double finalBill = totalBill + totalTip;
        double finalBillPerPerson = finalBill/numberOfPeople;
        //Rounding
        double roundedTip = ((int)(tipPerPerson*100.0+0.5))/100.0;
        double roundedBillPP = ((int)(finalBillPerPerson*100.0+0.5))/100.0;
        //Print results
        System.out.println("Tip Per Person: " + roundedTip);
        System.out.println("Total Per Person: " + roundedBillPP);
    }
}
