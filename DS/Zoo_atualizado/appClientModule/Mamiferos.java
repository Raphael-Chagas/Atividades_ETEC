public class Mamiferos {
    String nome;
    String especie;
    int idade;
    double altura;
    String sexo;
    int expectativaVida;


    public Mamiferos(String nome, String especie, int idade, double altura, String sexo, int expectativaVida) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        this.expectativaVida = expectativaVida;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Sexo: " + sexo);
        System.out.println("Expectativa de Vida: " + expectativaVida + " anos");
    }
}