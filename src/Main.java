public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
int StartBalance = 100;
int TopupAmount = 2000;
int EndBalance = TopupAmount > 1_000 ? StartBalance + TopupAmount + TopupAmount / 100 : StartBalance + TopupAmount;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
System.out.println("Благодарим за пополнение счета! Ваш баланс: ₽" + EndBalance);
    }
}