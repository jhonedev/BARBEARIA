import java.util.List;
import java.util.Scanner;

public class Cliente extends Pessoa {
    private Corte corteEscolhido;
    
    public Cliente(String nome, String sobrenome, int idade, String genero) {
        super(nome, sobrenome, idade, genero);
    }

    public static Cliente criarContaCliente(String nome, String sobrenome, int idade, String genero, String email, String senha , String telefone) {
        Cliente cliente = new Cliente(nome, sobrenome, idade, genero);
        cliente.setEmail(email);
        cliente.setSenha(senha);
        cliente.setTelefone(telefone);
        return cliente;
    }

    public void escolherCorte() {
        if (this.isLogadoSistema()) {
            Scanner scanner = new Scanner(System.in);
            int corteEscolhido = -1;
            boolean escolhaValida = false;
    
            while (!escolhaValida) {
                System.out.println("Escolha o corte desejado pelo número:");
                try {
                    corteEscolhido = scanner.nextInt();
                    this.corteEscolhido = Corte.getCortePorIndice(corteEscolhido);
                    escolhaValida = true;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Número inválido. Por favor, escolha um número válido.");
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();  // Limpa a entrada inválida
                }
            }
    
            System.out.println("Corte escolhido: " + this.corteEscolhido.getNome() + " - R$ " + this.corteEscolhido.getPreco());
        } else {
            System.out.println("Você precisa estar logado para escolher um corte.");
        }
    }
    

    public void escolherBarbeiro(List<Barbeiro> barbeiros) {
        if (isLogadoSistema()) {
            if (this.corteEscolhido == null) {
                System.out.println("Você precisa escolher um corte antes de selecionar um barbeiro.");
                return;
            }
        
            System.out.println("Barbeiros disponíveis para " + this.corteEscolhido.getNome() + ":");
            for (int i = 0; i < barbeiros.size(); i++) {
                System.out.println((i + 1) + ": " + barbeiros.get(i).getNome());
            }
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha o barbeiro pelo número:");
            int barbeiroEscolhido = -1;
            boolean escolhaValida = false;
        
            while (!escolhaValida) {
                try {
                    barbeiroEscolhido = scanner.nextInt();
                    if (barbeiroEscolhido < 1 || barbeiroEscolhido > barbeiros.size()) {
                        System.out.println("Número inválido. Escolha um barbeiro que está na lista.");
                    } else {
                        escolhaValida = true;
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.next();  // Limpa a entrada inválida
                }
            }
        
            Barbeiro barbeiro = barbeiros.get(barbeiroEscolhido - 1);
            agendarCorte(barbeiro);  // Chama o método de agendamento após escolher o barbeiro
        }else {
            System.out.println("Você precisa estar logado para poder escolher o barbeiro.");
        }
        
    }
    

    private void agendarCorte(Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            System.out.println("Horários disponíveis para o barbeiro " + barbeiro.getNome() + ":");
            barbeiro.getAgenda().horariosDisponiveisBarbeiro();
    
            int horarioEscolhido = -1;
            boolean escolhaValida = false;
    
            while (!escolhaValida) {
                try {
                    horarioEscolhido = barbeiro.getAgenda().escolherHorarioDisponivelBarbeiro();
                    if (!barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                        System.out.println("Horário indisponível. Escolha um horário que está na lista.");
                    } else {
                        escolhaValida = true;
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Digite um número.");
                }
            }
    
            System.out.println("Agendamento feito para " + Horario.getHorarioPorDigito(horarioEscolhido) + " com o barbeiro " + barbeiro.getNome());
            barbeiro.getAgenda().adicionarAgendamentoAgendaBarbeiro(horarioEscolhido);
        } else {
            System.out.println("Você precisa estar logado para fazer um agendamento.");
        }
    }
    
    

    public void pagar() {

    }
}