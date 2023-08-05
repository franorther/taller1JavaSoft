import java.util.ArrayList;
import java.util.List;

public class Punto10 {
    private Integer num = 20;
    private ArrayList<Integer> intSecuence = new ArrayList<>();
    private ArrayList<String> stringSecuence = new ArrayList<>();

    public ArrayList fibonacci() {
        int numb = this.num;
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
