package Test;

public class testBank {
    public static void main(String[] args) {
        Bank a = new Bank(25000.00 , 8.5);
        System.out.println("Monthly interst is $" + a.calculateInterest());
    }
}
