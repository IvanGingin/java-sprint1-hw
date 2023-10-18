import java.util.Scanner;

class StepTracker {
    static Scanner scanner;
    static MonthData[] monthToData = new MonthData[12];
    static int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
     public static void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");

        // ввод и проверка номера месяца
        int monthNumber = scanner.nextInt();
        if (monthNumber > 0 && monthNumber <= 12 ) {
            return;
        }

        System.out.println("Введите день от 1 до 30 (включительно)");
        // ввод и проверка дня
        int dayNumber = scanner.nextInt();
        if (dayNumber > 0 && dayNumber <= 30) {
            return;
        }

        System.out.println("Введите количество шагов");
        // ввод и проверка количества шагов
        int steps = scanner.nextInt();
        if (steps <= 0) {
            return;
        }

        // Получение соответствующего объекта MonthData из массива
        MonthData monthData = monthToData[monthNumber - 1];
        // Сохранение полученных данных
        monthData.days[dayNumber - 1] = steps;
    }
     void StepTracker(){
        System.out.println("Новая цель шагов на день");
        int newGoal = scanner.nextInt();
        if (newGoal <= 0) {
            return;
        }
        goalByStepsPerDay = newGoal;
    }
    public static void printStatistic() {
        System.out.println("Введите число месяца");
        // ввод и проверка номера месяца
        int monthNumber = scanner.nextInt();
        if (monthNumber > 0 && monthNumber <= 12 ) {
            return;
        }
        MonthData monthData = monthToData[monthNumber -1];
        monthData.printDaysAndStepsFromMonth();                                                                         // получение соответствующего месяца
            int sumSteps = monthData.sumStepsFromMonth();
            System.out.println("Сумма шагов за месяц: " + sumSteps);                                                    // получение суммы шагов за месяц

            int maxSteps = monthData.maxSteps();
            System.out.println("Максимальное количество шагов за день: " + maxSteps);

            int avgSteps = sumSteps / 30;
            System.out.println("Среднее количество шагов за день: " + avgSteps);

            int distance = converter.convertToKM(sumSteps);
            System.out.println("Пройденная дистанция за месяц: " + distance + " километров");

            int kilocalories = converter.convertStepsToKilocalories(sumSteps);
            System.out.println("Сожженные килокалории за месяц: " + kilocalories);

            int bestSeries = monthData.bestSeries(goalByStepsPerDay);
            System.out.println("Лучшая серия: " + bestSeries + " дней подряд");

            System.out.println();
    }
}
