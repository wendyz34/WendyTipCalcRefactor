import java.util.Scanner;
public class main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to tip calculator!");
        System.out.println("Enter the total bill:");
        double totalBill = scan.nextDouble();
        System.out.println("How much people are there?");
        int numPeople = scan.nextInt();
        System.out.println("What's the tip percentage");
        int tipPercentage = scan.nextInt();
        TipCalculator info = new TipCalculator(numPeople,tipPercentage);
        info.totalBill();
        System.out.println( "Tip Percentage:" + info.getTipPercentage());
        info.getTipAmount();
        info.getPerPersonTipAmount();
        info.getTotalBillBeforeTip();
        info.getPerPersonTotalCost();




    }
}
