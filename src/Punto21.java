public class Punto21 {
    private String letters;
    private String chain;

    public Punto21(String chain, String letter) {
        this.letters = letter;
        this.chain = chain;

    }
    public Integer showCantity(){
        int counter = 0;
        char letra = this.letters.charAt(0);
        for(int i = 0; i < this.chain.length(); i++){
            if(this.chain.charAt(i)== letra) counter++;
        }
        return counter;
    }

}
