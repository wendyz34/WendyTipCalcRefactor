public class TipCalculator {
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;


public TipCalculator(int numPeople, int tipPercentage){
    this.numPeople = numPeople;
    this.tipPercentage = tipPercentage;
    totalBillBeforeTip = 0.0;
}
public double getTotalBllBeforeTip() {
    return totalBillBeforeTip;
}
public double getTipPercentage(){
    return tipPercentage;
}
public void addMeal(double cost){
   totalBillBeforeTip += cost;
}
public double getTipAmount(){
    double tipAmount =( (tipPercentage*0.01)*totalBillBeforeTip);
    return tipAmount;
}
public double totalBill(){
    double totalBill =((totalBillBeforeTip+ (totalBillBeforeTip  * (tipPercentage*0.01))));
    return totalBill;
}
public double perPersonTipAmount(){
    double perPersonTipAmount = ((totalBillBeforeTip*(tipPercentage*0.01)));
    return perPersonTipAmount;
}
public double perPersonTotalCost(){
    double perPersonTotalCost = ((totalBillBeforeTip*(tipPercentage*0.01)/numPeople) +(totalBillBeforeTip/numPeople))));
    return perPersonTotalCost;
}