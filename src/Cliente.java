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

    // quando escolher o corte, tem que mostrar qual o valor a ser pago
    public void agendarCorteCabelo(Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            barbeiro.getAgenda().horariosDisponiveisBarbeiro();

            int horarioEscolhido = barbeiro.getAgenda().escolherHorarioDisponivelBarbeiro();

            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorarioPorDigito(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamentoAgendaBarbeiro(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void agendarCorteBarba(Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            barbeiro.getAgenda().horariosDisponiveisBarbeiro();

            int horarioEscolhido = barbeiro.getAgenda().escolherHorarioDisponivelBarbeiro();

            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorarioPorDigito(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamentoAgendaBarbeiro(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void agendarCorteBarbaCabelo(Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            barbeiro.getAgenda().horariosDisponiveisBarbeiro();

            int horarioEscolhido = barbeiro.getAgenda().escolherHorarioDisponivelBarbeiro();

            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorarioPorDigito(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamentoAgendaBarbeiro(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void agendarCorteSobrancelha(Barbeiro barbeiro) {
        if (this.isLogadoSistema()) {
            barbeiro.getAgenda().horariosDisponiveisBarbeiro();

            int horarioEscolhido = barbeiro.getAgenda().escolherHorarioDisponivelBarbeiro();

            if (barbeiro.getAgenda().isDisponivel(horarioEscolhido)) {
                System.out.println("Agendamento feito para " + Horario.getHorarioPorDigito(horarioEscolhido));
                barbeiro.getAgenda().adicionarAgendamentoAgendaBarbeiro(horarioEscolhido);;
            }else {
                System.out.println("Desculpe, mas nesse horário o barbeiro " + barbeiro.getNome() + " não está disponível.");
            }
        }else {
            System.out.println("Você precisa está logado para fazer um agendamento.");
        }
    }

    public void pagar() {

    }
}