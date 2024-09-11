public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String genero;
    private String email;
    private String senha;
    private String telefone;
    private boolean acessouSistema;
    private boolean logadoSistema;
    private boolean admiministrador;

    public Pessoa(String nome, String sobrenome, int idade, String genero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.genero = genero;
        this.logadoSistema = false;
        this.acessouSistema = false;
        this.admiministrador = false;
    }
    
    public void acessarSistema() {
        acessouSistema = true;
        System.out.println("www.barbeariak8.com.br");
        System.out.println();

        Corte.criarCortes();
        Corte.imprimirCortesDisponiveis();
        System.out.println();
    }
    
    public void login(String email, String senha) {
        if (! isAcessouSistema()) {
            System.out.println("Por favor, acesse o sistema antes de fazer login.");
            return;
        }
        
        if (this.getEmail().equals(email) && this.getSenha().equals(senha)) {
            logadoSistema = true;
            System.out.println("Login feito com sucesso");

            // Exibe os horários apenas se a pessoa for um cliente usando o instanceof
            if (this instanceof Cliente) {
                System.out.println("Escolha um horario.");
                System.out.println(Horario.horariosParaAgendar());
            }
        } else {
            System.out.println("Email ou senha estão incorretos. Tente novamente.");
        }
    }
    
    public void logout() {
        if (this.logadoSistema) {
            System.out.println("Logout feito com sucesso.");
            this.logadoSistema = false;
        }
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public boolean isAcessouSistema() {
        return acessouSistema;
    }
    
    public boolean isLogadoSistema() {
        return logadoSistema;
    }

    public boolean isAdmiministrador() {
        return admiministrador;
    }
}
