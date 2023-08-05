import java.math.BigDecimal;
import java.math.RoundingMode;

public class Punto13 {
    private Double num1;

    public Punto13(Double num1) {
        this.num1 = num1;

    }
    public String decimalConverted(){
        //Creamos un objeto Bigdecimal
        BigDecimal decimal = new BigDecimal(this.num1);
        //redondeamos a 1 cifra decimal
        decimal = decimal.setScale(1, RoundingMode.HALF_UP);
        double result = decimal.doubleValue();
        return "Número redondeado " + result;
    }

}
