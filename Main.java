public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment1 = service.calculate(1_000_000,0.008325,12);
        System.out.println("Ежемесячный платеж при сроке кредита 1 год: " + monthlyPayment1 + " рублей");

        double monthlyPayment2 = service.calculate(1_000_000,0.008325,24);
        System.out.println("Ежемесячный платеж при сроке кредита 2 года: " + monthlyPayment2 + " рублей");

        double monthlyPayment3 = service.calculate(1_000_000,0.008325,36);
        System.out.println("Ежемесячный платеж при сроке кредита 3 года: " + monthlyPayment3 + " рублей");
    }
}
