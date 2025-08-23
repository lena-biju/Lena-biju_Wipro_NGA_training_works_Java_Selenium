package main.java;

public class Box {
    
	        
        // 1. Calculate Area of circle
        public double circleArea(double radius) {
            return 3.14 * radius * radius;
        }
        
        // 2. Calculate Area of triangle
        public double triangleArea(double base, double height) {
            return 0.5 * base * height;
        }
        
        // 3. Calculate Area of square
        public double squareArea(double side) {
            return side * side;
        }
        
        // 4. Calculate Area of rectangle
        public double rectangleArea(double length, double width) {
            return length * width;
        }
        
        // 5. Calculate Simple Interest
        public double simpleInterest(double p, double r, double t) {
            return (p * r * t) / 100;
        }
     // 6. Calculate Amount 
        public double calculateAmount() {
        	double p = 1000; 
            double r = 5;
            double t = 2;
            double si = simpleInterest(p, r, t);
            double amount = si + p * Math.pow((1 + r/100), t);
            return amount;
        }
        

}
