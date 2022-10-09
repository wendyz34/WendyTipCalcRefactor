public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;



    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;

    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;

    }

    public double getTipPercentage() {
        return tipPercentage;
    }



    public void getTipAmount() {
        double tipAmount = (((tipPercentage * 0.01) )* totalBillBeforeTip);
        System.out.println("Tip Amount: " + tipAmount);
    }

    public void totalBill() {
        double totalBill = ((totalBillBeforeTip + (totalBillBeforeTip * (tipPercentage * 0.01))));
        System.out.println( "Total Bill: " + totalBill);
    }

    public void getPerPersonTipAmount() {
        double perPersonTipAmount = ((totalBillBeforeTip * (tipPercentage * 0.01)/numPeople));
        System.out.println("Tip Per Person: " + perPersonTipAmount);
    }

    public void getPerPersonTotalCost() {
        double perPersonTotalCost =((totalBillBeforeTip * (tipPercentage * 0.01) / numPeople) + (totalBillBeforeTip / numPeople));
        System.out.println( "Total Cost Per Person: " + perPersonTotalCost);
    }
}
