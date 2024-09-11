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
        cortesDisponiveis.add(new Corte("Cabelo", 30));
        cortesDisponiveis.add(new Corte("Barba", 30));
        cortesDisponiveis.add(new Corte("Cabelo e Barba", 55));
        cortesDisponiveis.add(new Corte("Sobracelhas", 10));
    }

    public static void imprimirCortesDisponiveis() {
        System.out.println("Cortes disponiveis");
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
