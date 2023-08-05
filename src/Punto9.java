import java.util.Random;

public class Punto9 {
    private Integer num1;

    public Integer factorialNum(int num1) {
        if(num1 == 1 || num1 ==0) return 1;
        return num1 * factorialNum(num1 - 1);
    }

}
