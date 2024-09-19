import java.util.ArrayList;
import java.util.List;

public class Barbeiro extends Pessoa{
    private Agenda agenda;
    private static List<Barbeiro> barbeiros = new ArrayList<>();

    public Barbeiro(String nome, String sobrenome, int idade, String genero) {
        super(nome, sobrenome, idade, genero);
        this.agenda = new Agenda(this);
    }

    // Método para adicionar barbeiros à lista estática
    public static void adicionarBarbeiro(Barbeiro barbeiro) {
        barbeiros.add(barbeiro);
    }

    // Retorna a lista de barbeiros
    public static List<Barbeiro> getBarbeiros() {
        return barbeiros;
    }

    public static Barbeiro criarContaBarbeiro(String nome, String sobrenome, int idade, String genero, String email, String senha, String telefone) {
        Barbeiro barbeiro =  new Barbeiro(nome, sobrenome, idade, genero);
        barbeiro.setEmail(email);
        barbeiro.setSenha(senha);
        barbeiro.setTelefone(telefone);
        adicionarBarbeiro(barbeiro);
        return barbeiro;
    }
    
    public void visualizarAgendaBarbeiro() {
        if (isLogadoSistema()) {
            this.agenda.agendaBarbeiro();
        }else{
            System.out.println("Você precisa fazer login para poder visualizar sua agenda.");
        }
    }

    public void finalizarCorte() {

    }

    public Agenda getAgenda() {
        return agenda;
    }
}
