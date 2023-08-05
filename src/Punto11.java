public class Punto11 {
    private Integer num1;
    private Integer num2;
    private Integer num3;

    public Punto11(Integer num1, Integer num2, Integer num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    public String heron(){

        //Calculamos primero el semiperimetro "s"
        Double s = (double) ((this.num1+ this.num2+ this.num3)/2);
        //Luego calculamos el area
        Double areaTriangle = Math.sqrt(s*(s-this.num1)*(s-this.num2)*(s-this.num3));
        double numberTruncated = Math.round(areaTriangle *100)/100;
        return Double.toString(numberTruncated);
    }

}
