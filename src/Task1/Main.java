package Task1;

public class Main {
    public static void main(String[] args) {
        CreditCard visa = new CreditCard(1234,100);
        visa.addSum();
        visa.outputInfo();
        System.out.println();
        CreditCard masterCard = new CreditCard(5678,1000);
        masterCard.addSum();
        masterCard.outputInfo();
        System.out.println();
        CreditCard MIR = new CreditCard(12354,90);
        MIR.removeSum();
        MIR.outputInfo();


    }
}
