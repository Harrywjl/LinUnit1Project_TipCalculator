import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Gets information from the user
        System.out.print("What was the total bill? ");
        double totalBill = scan.nextDouble();
        System.out.print("What is the percentage that you would like to tip? ");
        int tipPercentage = scan.nextInt();
        System.out.print("How many people are in your group? ");
        int totalPeople = scan.nextInt();
        //Calculates the outputs
        double tipAmount = totalBill * tipPercentage / 100; //Finds out the amount the user has to tip
        double totalBillWithTip = totalBill + tipAmount;    //Calculates the total bill including tip
        double tipPerPerson = tipAmount / totalPeople;  //How much tip each person in the group has to pay
        double totalPaymentPerPerson = totalBillWithTip / totalPeople;  //How much in total does each person in the group have to pay
        //Prints the outputs
        System.out.println("Bill: " + totalBill);
        System.out.println("Tip Percentage: " + tipPercentage + "%");
        System.out.println("Number of People: " + totalPeople);
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Total Bill (with Tip): " + totalBillWithTip);
        System.out.println("Tip Per Person: " + tipPerPerson);
        System.out.println("Total Per Person: " + totalPaymentPerPerson);
    }
}
