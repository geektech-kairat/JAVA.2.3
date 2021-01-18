package com.company;

public class BankAccount {
    public void setAmount(double amount) {
        this.amount = amount;
    }

    private double amount; // остаток на счете

    public double getAmount() { // возвращает текущий остаток на счете
        return amount;
    }

    public void withDraw(int sum) throws LimitException {
        double a = 0;
        if (amount < sum) {
            System.out.println("Cумма на снятие больше чем остаток денег на счете." + amount);
            System.out.println("Ввидите правильно пожалуйста ");


        } else if (amount <= sum) {
            throw new LimitException("Вы сняли успешна все деньги . ");
        } else {
            System.out.println("Снято со счёта : " + sum);
            System.out.println("Остаток на счету :" + (amount -= sum));
        }
    }
}
