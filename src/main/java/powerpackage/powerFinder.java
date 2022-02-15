package powerpackage;

public class powerFinder {
    public static int powerFunction(int number, int power) {
        int result = 1;
        for (int i = 0; i< power; i++) {
            result *= number;
        }
        return result;
    }
}
