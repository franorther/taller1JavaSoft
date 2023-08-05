import java.util.HashMap;
import java.util.Map;

public class Punto34 {
    private int[] numbers;

    public Punto34(String numbersString) {
        String[] numbersStr = numbersString.split(" ");
        this.numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            this.numbers[i] = Integer.parseInt(numbersStr[i]);
        }
    }

    public void rotateLeft(int positions) {
        int length = numbers.length;
        int[] tempArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newPosition = (i - positions) % length;
            if (newPosition < 0) {
                newPosition += length;
            }
            tempArray[newPosition] = numbers[i];
        }

        for (int i = 0; i < length; i++) {
            numbers[i] = tempArray[i];
        }
    }

    public void rotateRight(int positions) {
        int length = numbers.length;
        int[] tempArray = new int[length];

        for (int i = 0; i < length; i++) {
            int newPosition = (i + positions) % length;
            tempArray[newPosition] = numbers[i];
        }

        for (int i = 0; i < length; i++) {
            numbers[i] = tempArray[i];
        }
    }

    public String getResult() {
        StringBuilder resultBuilder = new StringBuilder();
        for (int num : numbers) {
            resultBuilder.append(num).append(" ");
        }
        return resultBuilder.toString();
    }

}
