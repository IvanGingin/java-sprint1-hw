import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                // здесь будет логика команды 1
                StepTracker.printDaysAndStepsFromMonth();
            } else if (i == 2) {
                // здесь будет логика команды 2
                StepTracker.addNewNumberStepsPerDay();
            } else if (i == 3) {
                StepTracker.printStatistic();;// здесь будет логика команды 3
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Введите количество шагов за ");
        System.out.println("2 - Введите новое целевое количество шагов за день");
        System.out.println("3 - Статистика за ");
        System.out.println("4 - Закончить работу с приложением");

    }

}