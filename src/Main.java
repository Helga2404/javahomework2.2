public class Main {
    public static void main(String[] args) {

        int amount = 100; //изначально на счете
        int payment = 1100; //размер платежа
        int minPayment = 1000; //условие бонуса
        int bonus = 1; //размер бонуса за 100 рублей
        int bonusTotal = payment / 100; //размер бонуса
        int total = amount + payment + bonusTotal; //всего на счете

        if (payment >= minPayment) {
            System.out.println("Всего бонусов: " + bonusTotal +
                    " Всего на счете: " + total);
        } else {
            System.out.println("Нет бонусов " +
                    " Всего на счете: " + amount + payment);

        }

    }

}

