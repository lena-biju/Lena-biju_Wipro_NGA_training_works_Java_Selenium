package banking_system;


public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("- BANKING SYSTEM -project1\n");
        
        // fr Interest Calculator 
        InterestCalculator interestCalc = new InterestCalculator() {
            @Override
            public double calculateSimpleInterest(double principal, double rate, double time) {
                return (principal * rate * time) / 100;
            }
        };
        
        // fr EMI Calculator  n
        EMICalculator emiCalc = new EMICalculator() {
            @Override
            public double calculateEMI(double principal, double annualRate, int tenureMonths) {
                double monthlyRate = (annualRate / 100) / 12;//// fr calculating the emi - formula is EMI = P × [r × (1+r)ⁿ] / [(1+r)ⁿ - 1] 
                if (monthlyRate == 0) {
                    return principal / tenureMonths;
                }
                double numerator = principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths);
                double denominator = Math.pow(1 + monthlyRate, tenureMonths) - 1;
                return numerator / denominator;
            }
        };
        
        // fr Currency Converter 
        CurrencyConverter currencyConv = new CurrencyConverter() {
            @Override
            public double convertINRToUSD(double inrAmount, double exchangeRate) {
                if (exchangeRate <= 0) {
                    throw new IllegalArgumentException("Exchange rate must be positive");
                }
                return inrAmount / exchangeRate;
            }
        };
        
        // === Demonstrating/usage ===
        
        // 1. Simple Interest Calculation
        System.out.println("1. SIMPLE INTEREST CALCULATION");
        System.out.println("-----------------------------------");
        double principal = 50000;
        double rate = 7.5;
        double time = 2;
        double interest = interestCalc.calculateSimpleInterest(principal, rate, time);
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "% per annum");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: ₹" + interest);
        System.out.println("Total Amount: ₹" + (principal + interest));
        System.out.println();
        
        // 2. EMI Calculation
        System.out.println("2. EMI CALCULATION");
        System.out.println("----------------------");
        double loanAmount = 300000;
        double annualRate = 9.5;
        int tenureMonths = 36;
        double emi = emiCalc.calculateEMI(loanAmount, annualRate, tenureMonths);
        double totalPayable = emi * tenureMonths;
        double totalInterest = totalPayable - loanAmount;
        System.out.println("Loan Amount: ₹" + loanAmount);
        System.out.println("Interest Rate: " + annualRate + "% per annum");
        System.out.println("Tenure: " + tenureMonths + " months");
        System.out.println("Monthly EMI: ₹" + String.format("%.2f", emi));
        System.out.println("Total Interest: ₹" + String.format("%.2f", totalInterest));
        System.out.println("Total Payable: ₹" + String.format("%.2f", totalPayable));
        System.out.println();
        
        // 3. Currency Conversion
        System.out.println("3. CURRENCY CONVERSION (INR to USD)");
        System.out.println("---------------------------------------");
        double inrAmount = 75000;
        double exchangeRate = 83.15;
        double usdAmount = currencyConv.convertINRToUSD(inrAmount, exchangeRate);
        System.out.println("INR Amount: ₹" + inrAmount);
        System.out.println("Exchange Rate: 1 USD = ₹" + exchangeRate);
        System.out.println("USD Amount: $" + String.format("%.2f", usdAmount));
        System.out.println();
        
        
       
    }
}