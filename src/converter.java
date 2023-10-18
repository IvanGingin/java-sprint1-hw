public class converter {
    public static int convertToKM(int steps){
        int distance = steps * 75/ 100000;
        return distance;
    }
    public static int convertStepsToKilocalories(int steps){
        int kilocalories = steps * 50 / 1000;
        return kilocalories;
    }
}
