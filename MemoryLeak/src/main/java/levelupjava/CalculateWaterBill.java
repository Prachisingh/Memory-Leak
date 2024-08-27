package levelupjava;

public class CalculateWaterBill {

    double minCharge = 18.84;
    int oneCCF = 748;
    double extraCharge = 3.90;
    double totalExtraCharges;

    public Double calculateBill(Double gallons) {

        Double ccf = gallons / oneCCF;
        if(ccf <= 2){
            return 18.84;
        }
        for (double i = ccf - 2; i > 0; i--) {
            totalExtraCharges = extraCharge + totalExtraCharges;
        }

        return minCharge + totalExtraCharges;
    }
}
