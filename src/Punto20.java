public class Punto20 {
    private String chain;

    public Punto20(String chain) {
        this.chain = chain;

    }
    public String reverserChain(){
        StringBuilder stringBuilder = new StringBuilder(this.chain);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
