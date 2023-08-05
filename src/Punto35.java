import java.util.HashMap;
import java.util.Map;

public class Punto35 {

    private int[][] multiplicationTable;

    public Punto35() {
        this.multiplicationTable = new int[10][10];
    }

    public void generateMultiplicationTable() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    public void printMultiplicationTable() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
