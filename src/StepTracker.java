import java.util.Scanner;
public class StepTracker {
    Scanner scanner;
     MonthData[] monthToData = new MonthData[12];
     int goalByStepsPerDay = 10000;
     public StepTracker(Scanner scanner) {


         for (int i = 0; i < monthToData.length; i++) {
             monthToData[i] = new MonthData();
         }
     }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Неверно задан месяц");
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        int day = scanner.nextInt();
        if (day <= 0 || day > 30) {
            System.out.println("Неверно задан день");
            return;
        }

        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Неверное количество шагов");
            return;
        }

        MonthData monthData = monthToData[monthNumber - 1];
        monthData.days[day - 1] = monthData.days[day - 1] + steps;;

    }


    void printStatistic() {
        System.out.println("Введите число месяца");
        int monthNumber = scanner.nextInt();
        if (monthNumber <= 0 || monthNumber > 12 ) {
            System.out.println("Неверно задан месяц");
            return;
        }
        MonthData monthData = monthToData[monthNumber - 1];

        int sumSteps = monthData.sumStepsFromMonth();
        System.out.println("Сумма шагов за месяц: " + sumSteps);

        int maxSteps = monthData.maxSteps();
        System.out.println("Максимальное количество шагов за день: " + maxSteps);

        int avgSteps = sumSteps / 30;
        System.out.println("Среднее количество шагов за день: " + avgSteps);

        int distance = Converter.convertToKM(sumSteps);
        System.out.println("Пройденная дистанция за месяц: " + distance + " километров");

        int kilocalories = Converter.convertStepsToKilocalories(sumSteps);
        System.out.println("Сожженные килокалории за месяц: " + kilocalories);

        int bestSeries = monthData.bestSeries(goalByStepsPerDay);
        System.out.println("Лучшая серия: " + bestSeries + " дней подряд");

        System.out.println();
    }
    void changeStepGoal() {
        System.out.println("Введите новую цель шагов на день:");
        int newGoal = scanner.nextInt();
        if (newGoal <= 0) {
            System.out.println("Цель должна быть положительным числом.");
        } else {
            goalByStepsPerDay = newGoal;
            System.out.println("Цель шагов на день изменена на " + newGoal);
        }
    }
}