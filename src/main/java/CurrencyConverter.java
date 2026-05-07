public class CurrencyConverter {

    public static double convertINRtoUSD(double amount) {
        return amount * 0.012;
    }

    public static double convertUSDtoINR(double amount) {
        return amount * 83;
    }

    public static void main(String[] args) {

        double inr = 1000;

        double usd = convertINRtoUSD(inr);

        System.out.println("1000 INR = " + usd + " USD");
    }
}