public enum Estado {
    /**
    * Definicion de todos los estados
    * posibles de la mascorta virtual
    **/
    Neutro("(-_-) Meh...."),
    Feliz("(^_^) Weeeeeh!"), 
    Triste("(._.) snif...."), 
    Hambriento("(0o0) hambre hambre!"), 
    Enojado("(ôwô) grrrr..."), 
    Cansado(" (=_=) zzzz...."),
    Muerto("x_x) fin del juego");

    private String frase;
    Estado(String frase) { 
       this.frase = frase;
   }

   public String getPhrase() { return frase; } 
}
