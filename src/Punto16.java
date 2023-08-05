import java.util.ArrayList;

public class Punto16 {
    private Integer num1;
    private ArrayList<Integer> intSecuence = new ArrayList<>();
    private ArrayList<String> stringSecuence = new ArrayList<>();


    public Punto16(Integer num1) {
        this.num1 = num1;
    }
    public ArrayList isFibonacci(){

        int numb = this.num1;
        for (int i = 0; i < numb; i++) {
            intSecuence.add(fiboSecue(i));
        }
        for (Integer elem : intSecuence) stringSecuence.add(Integer.toString(elem));
        return stringSecuence;
    }
    public Integer fiboSecue(int i) {
        if (i <= 1) return i;
        return fiboSecue(i - 1) + fiboSecue(i - 2);
    }

}
