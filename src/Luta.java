
import java.util.Random;

public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovado = false;
    
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1.getNome() != l2.getNome()){
            setAprovado(true);
            System.out.println("Luta foi aprovada!");
        }else{
            System.out.println("Luta não foi aprovada!");
            setAprovado(true);
        }
    }
    
    public void lutar(Lutador desafiante, Lutador desafiado){
        if(getAprovado()){
            System.out.println("Resultado da luta! Prepare a pipoca!");
            System.out.println("Desafiante:");
            desafiante.apresentar();
            
            System.out.println("Desafiado:");
            desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Desafiado Venceu! "+ desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Desafiante Venceu! "+ desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;

            }
        }else{
            System.out.println("A luta não pode acontecer.");
        }
    }

    //Contrutores
    //Métodos Acessores

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
