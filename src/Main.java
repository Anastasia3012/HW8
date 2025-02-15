//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        Задача1
        int accumulation = 15000;
        int amount = 0;
        int i = 0;
        while (amount < 2_459_000) {
            amount = amount + amount / 100;
            amount = amount + accumulation;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + amount + " рублей.");
        }

//        Задача2

        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int p = 10; p > 0; p--) {
            System.out.print(p + " ");
        }
        System.out.println();

//        Задача3
        int y = 12_000_000;
        int birthrate = 17 % 1000;
        int dead = 8 % 1000;
        int year = 0;
        while (year < 10) {
            year++;
            y = y + (birthrate * 12000) - (dead * 12000);
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }

//        Задача4
        int bankAccumulation = 15000;
        int total = 0;
        int z = 0;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            total = total + bankAccumulation;
            z++;
            System.out.println("Месяц " + z + ", сумма накоплений равна " + total + " рублей.");
        }

//            Задача5
        int bankAccum = 15000;
        int sum = 0;
        int month = 0;
        while (sum < 12_000_000) {
            sum = sum + sum / 100 * 7;
            sum = sum + bankAccum;
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей.");
        }

//        Задача6
        int accumBank = 15000;
        int overall = 0;
        int m = 0;
        while (m <= 9 * 12) {
            overall = overall + overall / 100 * 7;
            overall = overall + accumBank;
            m++;
            if (m % 6 == 0)
                System.out.println("Месяц " + m + ", сумма накоплений равна " + overall + " рублей.");
        }

//        Задача7 (месяц январь 2025)
        int date = 3;
        do {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            date = date + 7;
        }
        while (date <= 31);


//        Задача8
        int years = 0;
        do {
            if (years > 1825)
                System.out.println(years);
            years = years + 79;
        }
        while (years < 2125);


    }
}
