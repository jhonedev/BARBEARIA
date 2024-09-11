public class Barbeiro extends Pessoa{
    private Agenda agenda;

    public Barbeiro(String nome, String sobrenome, int idade, String genero) {
        super(nome, sobrenome, idade, genero);
        this.agenda = new Agenda();
    }

    public static Barbeiro criarContaBarbeiro(String nome, String sobrenome, int idade, String genero, String email, String senha, String telefone) {
        Barbeiro barbeiro =  new Barbeiro(nome, sobrenome, idade, genero);
        barbeiro.setEmail(email);
        barbeiro.setSenha(senha);
        barbeiro.setTelefone(telefone);
        return barbeiro;
    }
    
    public void visualizarAgendaBarbeiro() {
        if (isLogadoSistema()) {
            this.agenda.agendaBarbeiro();
        }else{
            System.out.println("Você precisa fazer login para poder visualizar sua agenda.");
        }
    }

    public void cortarCabelo() {
        
    }
    
    public void cortarBarba() {
        
    }
    
    public void cortarSobrancelhas() {
        
    }
    
    public Agenda getAgenda() {
        return agenda;
    }

    public void finalizarCorte() {
        
    }
}
