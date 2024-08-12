public class balexCompany {

    // Method to calculate and print the total pay
    public void calculatePay(double basePay, int hoursWorked) {
        // Minimum wage
        double minimumWage = 8.00;
        
        // Check if base pay is less than the minimum wage
        if (basePay < minimumWage) {
            System.out.println("Error: Base pay is below the minimum wage.");
            return;
        }
        
        // Check if hours worked is more than 60
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked cannot be more than 60.");
            return;
        }
        
        double totalPay;
        
        // Calculate pay for hours up to 40
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * basePay;
        } else {
            // Calculate overtime pay
            int overtimeHours = hoursWorked - 40;
            totalPay = (40 * basePay) + (overtimeHours * basePay * 1.5);
        }
        
        // Print the total pay
        System.out.println("Total pay: $" + totalPay);
    }

    // Main method to test the calculatePay method
    public static void main(String[] args) {
        balexCompany employee1 = new balexCompany();
        balexCompany employee2 = new balexCompany();
        balexCompany employee3 = new balexCompany();
        
        // Test cases
        employee1.calculatePay(7.50, 35);  // Should print an error due to low base pay
        employee2.calculatePay(8.20, 47);  // Should calculate with overtime
        employee3.calculatePay(10.00, 73); // Should print an error due to too many hours
    }
}
