
public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empates;

    //Métodos
    public void apresentar() {
        System.out.println("Chegou a hora de apresertarmos o lutador " + getNome() + ".");
        System.out.println("Diretamente do " + getNacionalidade() + ".");
        System.out.println("Com " + getIdade() + " anos e pesando " + getPeso() + " kg e " + getAltura() + " de altura.");
        System.out.println("Possui a categoria " + getCategoria() + ".");
        System.out.println("");
    }

    public void status() {
        System.out.println("Status do lutador " + getNome() + ".");
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Perdeu: " + getDerrota());
        System.out.println("Empate: " + getEmpates());
        System.out.println("");

    }

    public void ganharLuta() {
        setVitoria(getVitoria() + 1);
    }

    public void perderLuta() {
        setDerrota(getDerrota()+ 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates()+ 1);
    }

    //Construtores
    public Lutador() {
    }

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empates = empates;
    }

    //Métodos Acessores - Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(getPeso() < 52){
            this.categoria = "Invalida";
        }else if(getPeso() <= 70){
            this.categoria = "Leve";
        }else if(getPeso() <= 83){
            this.categoria = "Médio";
        }else if(getPeso() <= 120){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
