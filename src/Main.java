public class Main {
    public static void main(String[] args) {

        int inscore = 100;                                    // сумма на счете до пополнения
        int deposit = 1100;                                    // сумма пополнения
        boolean bonus = deposit > 1000;

        int bonuscalculator;                                             // расчет начисления бонуса
        if (bonus) {
            bonuscalculator = deposit / 100;
        } else {
            bonuscalculator = 0;
        }


        int account = inscore + deposit + bonuscalculator;

        System.out.println("Итоговая сумма на счете: " + account + " ₽");
        System.out.println("пришло бонусов: " + bonuscalculator + " ₽");
    }
}