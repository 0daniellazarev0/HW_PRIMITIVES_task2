public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startBalance = 100;
        int topUpAmount = 2_000;
        int endBalance = (topUpAmount > 1_000) ? (startBalance + topUpAmount + (topUpAmount / 100)) : (startBalance + topUpAmount);

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println("Благодарим за пополнение счета! Ваш баланс: ₽" + endBalance);
    }
}