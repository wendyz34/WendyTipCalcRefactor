import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to tip calculator!");
        System.out.println("Enter the total bill before tip:");
        double totalBillBeforeTip = scan.nextDouble();
        System.out.println("How much people are there?");
        int numPeople = scan.nextInt();
        System.out.println("What's the tip percentage");
        int tipPercentage = scan.nextInt();
        TipCalculator info = new TipCalculator(numPeople,tipPercentage);
        System.out.println( "Tip Percentage:" + info.getTipPercentage());
        System.out.println("Total Bill Before Tip:" + info.getTotalBillBeforeTip());
        info.totalBill();
        info.getTipAmount();
        info.getPerPersonTipAmount();
        info.getPerPersonTotalCost();




    }
}
