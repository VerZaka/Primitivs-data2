public class Main {
    public static void main(String[] args) {

        int Balance = 300;
        int Amount = 1100;
        int bonusRub = 1;

        if (Amount > 1000) {
            int bonusAmount = (Amount / 300);

            int bonus = bonusAmount * bonusRub;

            int totalBalance = Balance + Amount + bonus;
            System.out.println("Итоговый счет " + totalBalance + " рублей");
            System.out.println("Бонусный счет " + bonus + " рублей");
        } else {
            int totalBalance = Balance + Amount;
            System.out.println("Итоговый счет " + totalBalance + " рублей");
            System.out.println("Бонусные рубли: 0 рублей.");
        }

    }
}