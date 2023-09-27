import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static void main(String[] args) {
        String pattern = "0.00";
        DecimalFormat numberFormat = new DecimalFormat(pattern);
        Scanner scan = new Scanner(System.in);

        //Gets information from the user
        System.out.print("What was the total bill? ");
        double totalBill = scan.nextDouble();
        System.out.print("What is the percentage that you would like to tip? ");
        double tipPercentage = scan.nextInt();
        System.out.print("How many people are in your group? ");
        int totalPeople = scan.nextInt();

        //Calculates the outputs
        double tipAmount = totalBill * (tipPercentage / 100); //Finds out the amount the user has to tip
        double totalBillWithTip = totalBill + tipAmount;    //Calculates the total bill including tip
        double tipPerPerson = tipAmount / totalPeople;  //How much tip each person in the group has to pay
        double totalPaymentPerPerson = totalBillWithTip / totalPeople;  //How much in total does each person in the group have to pay
        //Prints the outputs

        System.out.println("Bill: $" + numberFormat.format(totalBill));
        System.out.println("Tip Percentage: " + tipPercentage + "%");
        System.out.println("Number of People: " + totalPeople);
        System.out.println("Tip Amount: $" + numberFormat.format(tipAmount + .005));    //Add .005 to the values to round the decimals correctly
        System.out.println("Total Bill (with Tip): $" + numberFormat.format(totalBillWithTip + .005));
        System.out.println("Tip Per Person: $" + numberFormat.format(tipPerPerson + .005));
        System.out.println("Total Per Person: $" + numberFormat.format(totalPaymentPerPerson + .005));
    }
}
