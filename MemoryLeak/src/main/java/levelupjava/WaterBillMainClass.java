package levelupjava;

import java.util.Scanner;

public class WaterBillMainClass {
    public static void main(String[] args) {
        CalculateWaterBill calculateWaterBill = new CalculateWaterBill();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide Number of Gallons used :");
        Double aDouble  = scanner.nextDouble();
        Double bill = calculateWaterBill.calculateBill(aDouble);
        System.out.println("Your bill amount is :" + bill );


    }
}
