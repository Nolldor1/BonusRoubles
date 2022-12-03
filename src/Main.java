public class Main {
    public static void main(String[] args) {
        int balance = 100; // остаток на балансе
        int refill = 1100; // сумма пополнения
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int sum = balance + refill + bonus;
        System.out.println("Итого на счете вместе с бонусами: " + sum);
        System.out.println("Из них бонусы: " + bonus);
    }
}