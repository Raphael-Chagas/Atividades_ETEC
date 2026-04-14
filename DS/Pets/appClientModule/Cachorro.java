public class Cachorro extends Pet {
    String raca;
    String nome;
    String tamanho;
    int idade;
    String cor;


    public Cachorro(int fome,String nome, String raca,  String tamanho, int idade, String cor) {
        super(fome);
        this.nome = nome;
        this.raca = raca;
        this.tamanho = tamanho;
        this.idade = idade;
        this.cor = cor;
    }


    public void alimentar() {
        if (getFome() < 10) {
            System.out.println("O cachorro está com fome.");
        } else {
            System.out.println("O cachorro está sem fome.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Idade: " + idade);
        System.out.println("Cor: " + cor);
        System.out.println("Fome: " + getFome());
    }
}