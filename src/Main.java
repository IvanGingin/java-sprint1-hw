import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        MonthData monthData = new MonthData();
        Converter converter = new Converter();
        while (true) {
            printMenu();

            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.printDaysAndStepsFromMonth(scanner);
            } else if (i == 2) {
                stepTracker.addNewNumberStepsPerDay(scanner);
            } else if (i == 3) {
                stepTracker.printStatistic(scanner);
            } else if (i == 4) {
                System.out.println("Пока!");
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Посмотреть данные по шагам за месяц");
        System.out.println("2 - Введите данные заново");
        System.out.println("3 - Вывести статистику");
        System.out.println("4 - Закончить работу с приложением");
    }
}