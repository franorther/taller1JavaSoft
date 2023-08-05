public class Punto24 {
    private String chain1;
    private char chain2;
    private char chain3;

    public Punto24(String chain1, char chain2, char chain3) {
        this.chain1 = chain1;
        this.chain2 = chain2;
        this.chain3 = chain3;
    }

    public String charReplaced(){
        String cadena = this.chain1;
        char letraAReemplazar = this.chain2;
        char letraDeReemplazo = this.chain3;
        return cadena.replace(letraAReemplazar, letraDeReemplazo);

    }

}
