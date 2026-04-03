public class Main {
    public static void main(String[] args) {
        Lutador lutador01 = new Lutador("Amarildo Lopes", "Japão", 26, 1.56, 73, 0, 0, 0);  
        Lutador lutador02 = new Lutador("Jeferson Aguinaldo", "Russia", 26, 1.56, 75, 0, 0, 0);  
        
        Luta luta1 = new Luta();

//        l1.apresentar();
//        l2.apresentar();
        

        luta1.marcarLuta(lutador01, lutador02);
        luta1.lutar(lutador01,lutador02);

        lutador01.status();
        lutador02.status();
    }
}
