public class Bovinos extends Mamiferos {
    double peso;
    boolean chifre;
    double leite;

    public Bovinos(
    		String nome, 
    		String especie, 
    		int idade, 
    		double altura, 
    		String sexo, 
    		int expectativaVida, 
    		double peso, 
    		boolean chifre,
    		double leite) {
        
        super(nome, especie, idade, altura, sexo, expectativaVida);
        
        this.peso = peso;
        this.chifre = chifre;
        this.leite = leite;
    }

    public void exibirDadosBovino() {
        super.exibirDados();
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Possui Chifre? " + chifre);
        System.out.println("Produção de Leite (L/dia): " + leite + " por dia");
    }
}