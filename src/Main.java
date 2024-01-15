public class Main {


    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int a = 0; a <= 10; a++) {
            System.out.println(a + "");
        }
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "");
        }
        System.out.println("Задание 3 ");
        for (int d = 0; d < 17; d = d + 2) {
            System.out.println(d + "");
        }
        System.out.println("Задание 4 ");
        for (int c = 10; c >= -10 && c <= 10; c--) {
            System.out.println(+c);
        }
        System.out.println("Задание 5 ");
        for (int year = 1904; year <= 2096; year = year + 4) ;
        {
            System.out.println("год являтся высокосным");
        }
        System.out.println("Задание 6 ");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(+i);
        }
        System.out.println("Задание 7 ");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(+i);
        }
        System.out.println("Задание 8 ");

        for (int month = 1; month <= 12; month++) {
            int deposit = 29000;
            double sum = 0;
            sum = sum + deposit;
            System.out.println("Месяц" + month + "сумма накоплений составит" + sum);
        }

        System.out.println("Задание 9 ");
        for (int month = 1; month <= 12; month++) {
            int deposit = 29000;
            double sum = 0;
            sum = sum *0.12;
            sum = sum + deposit;
            System.out.println("Месяц" + month + "сумма накоплений составит" + sum);
        }
        System.out.println("Задание 10 ");
        for (int a = 1; a <= 10; a++) {
            int b = 2;
            double value = a * b;
            System.out.println(a + "*" + b + "=" + value);
        }
    }
}
