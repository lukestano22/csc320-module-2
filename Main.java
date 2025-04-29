package module_2;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> taxBracket = new HashMap<>();
        taxBracket.put("lowest", 500);
        taxBracket.put("middle", 1500);
        taxBracket.put("large", 2500);

        System.out.print("Enter your weekly income: \n$");
        double weeklyPay = scanner.nextDouble();
        double taxRate;
        
        if (weeklyPay < taxBracket.get("lowest")){
            taxRate = 0.10;
        } else if (weeklyPay < taxBracket.get("middle")){
            taxRate = 0.15;
        } else if (weeklyPay < taxBracket.get("large")){
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        double postTax = weeklyPay * (1 - taxRate);
        
        
        System.out.println("Your interest rate is: %" + taxRate * 100);
        System.out.println("Your total paycheck will be: $" + String.format("%.2f", postTax));
        


    }
}
