import java.util.ArrayList;
import java.util.List;

public class Corte {
    private String nome;
    private double preco;
    private static List<Corte> cortesDisponiveis = new ArrayList<>();
    
    public Corte(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public static void criarCortes() {
        if (cortesDisponiveis.isEmpty()) {
            cortesDisponiveis.add(new Corte("1 - Cabelo", 30));
            cortesDisponiveis.add(new Corte("2 - Barba", 30));
            cortesDisponiveis.add(new Corte("3 - Cabelo e Barba", 55));
            cortesDisponiveis.add(new Corte("4 - Sobracelhas", 10));
        }
    }

    public static Corte getCortePorIndice(int indice) {
        criarCortes();
        return cortesDisponiveis.get(indice - 1); // A lista começa no índice 0, então subtraímos 1
    }

    public static void imprimirCortesDisponiveis() {
        System.out.println("Cortes disponiveis");
        criarCortes();
        for (Corte corte : cortesDisponiveis) {
            System.out.println(corte.getNome() + ": " + " R$ " + corte.getPreco());
        }
    }
        
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
