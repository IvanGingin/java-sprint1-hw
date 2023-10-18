class MonthData {
    int[] days = new int[30];
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
          System.out.println((i+1) + days[i]);  // Вывод элементов массива в необходимом формате
        }
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];  // подсчёт суммы элементов массива days[]
        }
        return sumSteps;
    }
    int maxSteps() {
        int maxSteps = 0;
        for (int i = 0; i < days.length; i++) {
            maxSteps = days[i]; // поиск максимального элемента
        }
        return maxSteps;
    }
    int bestSeries(int goalByStepsPerDay) { // поиск максимальной серии
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay){
                currentSeries = currentSeries + 1;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            }else {
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}