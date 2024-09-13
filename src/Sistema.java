public class Sistema {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("mario", "vegara", 23, "masculino");
        Cliente cliente2 = new Cliente("jhone", "silva", 28, "masculino");

        Barbeiro barbeiro1 = new Barbeiro("lucas", "santos", 31, "masculino");
        Barbeiro barbeiro2 = new Barbeiro("jessica", "borges", 33, "feminino");

        barbeiro1 = Barbeiro.criarContaBarbeiro("lucas", "santos", 31, "masculino", "lucas@email.com", "lucas123","4848451");
        barbeiro2 = Barbeiro.criarContaBarbeiro("jessica", "borges", 32, "jessica@email.com", "jessica123", "feminino", "3215479");

        cliente1 = Cliente.criarContaCliente("mario", "vegara", 33, "masculino", "mario@email.com", "mario123", "123456");
        cliente2 = Cliente.criarContaCliente("jhone", "silva", 28, "masculino", "jhone@email.com", "jhone123", "2154598");

        cliente1.acessarSistema();
        cliente1.login("mario@email.com", "mario123");
        cliente1.agendarCorteCabelo(barbeiro1);

        cliente2.acessarSistema();
        cliente2.login("jhone@email.com", "jhone123");
        cliente2.agendarCorteCabelo(barbeiro1);

        barbeiro1.acessarSistema();
        barbeiro1.login("lucas@email.com", "lucas123");
        barbeiro1.visualizarAgendaBarbeiro();

        // barbeiro2.acessarSistema();
        // barbeiro2.login("jessica@email.com", "jessica123");
    }

}
