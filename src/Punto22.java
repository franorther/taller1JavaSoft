public class Punto22 {
    private String chain;

    public Punto22(String chain) {
        this.chain = chain;
    }

    public String isPalindrome(){
        String fraseSinEspacios = this.chain.replaceAll("\\s+", "").toLowerCase();
        int longitud = fraseSinEspacios.length();
        for(int i = 0; i <  longitud / 2; i++){
            if(fraseSinEspacios.charAt(i)!= fraseSinEspacios.charAt(longitud -1 - i)) return "no es palindromo";
        }
        return "es un palindromo";
    }

}
