public class Main {
    public static void main(String[] args) {

        // Задание1 task1

        for (int i = 0; i <= 10; i ++) {
        System.out.println(i);
        }

        // task2

        for (int i = 10; i >=1; i--) {
         System.out.println(i);
        }

        // task3

       for (int i = 0; i <= 17; i = i+2 ) {
           System.out.println(i);
       }

       // task4

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задание2 task1

        for (int i = 1904; i < 2096; i = i+4) {
            System.out.println("Високосный год " + i);
        }

        // task2

        for (int i = 7; i <= 98; i = i+7) {
            System.out.println(i);
        }

        // task3

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // задание 3 task1

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + "сумма накоплений равна " + total);
        }

        // task2


        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
    }
}