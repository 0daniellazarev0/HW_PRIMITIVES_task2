public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startBalance = 100;
        int topupAmount = 2_000;
        int endBalance = (topupAmount > 1_000) ? (startBalance + topupAmount + (topupAmount / 100)) : (startBalance + topupAmount);

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        System.out.println("Благодарим за пополнение счета! Ваш баланс: ₽" + endBalance);
    }
}