package banking_system;

 
public interface CurrencyConverter {//fr conversion of the currency from inr to usd-using formula USD = INR ÷ Exchange Rate!
    
    double convertINRToUSD(double inrAmount, double exchangeRate);
}
