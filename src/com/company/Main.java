package com.company;

public class Main {

    public static void main(String[] args) {

        double x = 5000;
        BankAccount bankAccount = new BankAccount();
        System.out.println("ДОБРО ПОЖАЛОВАТЬ");
        System.out.println("Сколько у вас на счету денег ?");
        bankAccount.setAmount(Utils.getIntFromTerminal());
        bankAccount.setAmount(bankAccount.getAmount() + x);
        System.out.println("Вы ошиблись, у вас на счёту    : " + bankAccount.getAmount() + "$");
        while (true) {
            System.out.println("Укажите сколько надо снять : ");
            try {
                bankAccount.withDraw((int) Utils.getIntFromTerminal());
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}