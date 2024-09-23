public class Main {
    public static void main(String[] args) {
        double balance= 5000.00;
        double annualInterestRate= 0.17;
        double monthlyInterestRate= annualInterestRate*12;

        //Calculate interest for month 1
        double interestMonth1= balance * monthlyInterestRate;
        balance+=interestMonth1;

        //Calculate interest for month 2
        double interestMonth2= balance + interestMonth1 * annualInterestRate;

        //Display the results
        System.out.println("The interest after one month is: " +interestMonth1);
        System.out.println("The interest after two months is: " +interestMonth2);

    }
}