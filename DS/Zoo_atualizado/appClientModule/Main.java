public class Main {
    public static void main(String[] args) {


        Mamiferos m1 = new Mamiferos("Leão", "Felino", 5, 1.2, "Macho", 15);
        System.out.println("=== Mamífero ===");
        m1.exibirDados();

        System.out.println();


        Bovinos b1 = new Bovinos("Mimosa", "Bovino", 4, 1.5, "Fêmea", 20, 500.0, true, 25.0);
        
        System.out.println("=== Bovino ===");
        b1.exibirDadosBovino();
    }
}