public class CreditPaymentService {
    public double calculate(double credit, double perMonth, double months) {
        double ratio = 1 + perMonth; // где perMonth = 0.0999(процентная ставка в год)/ 12(месяцев)
        double result = Math.pow(ratio, months); // возведение в степень. Зависит от количества месяцев
        double monthlyPayment1 = ((0.008325*result) / (result-1)) * credit;
        return monthlyPayment1;
    }
}
