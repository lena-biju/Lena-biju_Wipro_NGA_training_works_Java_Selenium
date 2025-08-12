package banking_system;

public interface EMICalculator {// fr calculating the emi -using formula is EMI = P × [r × (1+r)ⁿ] / [(1+r)ⁿ - 1] 
    double calculateEMI(double principal, double annualRate, int tenureMonths);
}