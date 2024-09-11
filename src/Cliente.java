public class Cliente extends Pessoa {
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
    
    public void agendarCorteCabelo(int horarioEscolhido, Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorario(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamento(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void agendarCorteBarba(int horarioEscolhido, Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorario(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamento(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void agendarCorteBarbaCabelo(int horarioEscolhido, Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorario(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamento(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void agendarCorteSobrancelha(int horarioEscolhido, Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorario(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamento(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void combo() {
        
    }

    public void pagar() {

    }
}
