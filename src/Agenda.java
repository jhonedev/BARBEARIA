import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private List<Integer> horariosOcupadosBarbeiro;
    private Barbeiro barbeiro;
    
    public Agenda(Barbeiro barbeiro) {
        this.horariosOcupadosBarbeiro = new ArrayList<>();
        this.barbeiro = barbeiro;
    }

    public void adicionarAgendamentoAgendaBarbeiro(int digitoHorario){
        horariosOcupadosBarbeiro.add(digitoHorario);
    }

    public int escolherHorarioDisponivelBarbeiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao horário desejado.");
        int horarioEscolhido = scanner.nextInt();
    
        // Verifica se o horário escolhido está na lista de horários disponíveis
        if (!isDisponivel(horarioEscolhido)) {
            System.out.println("Número inválido. Escolha um horário que está na lista.");
            return escolherHorarioDisponivelBarbeiro(); // Solicita a escolha novamente
        }
    
        System.out.println("Horário " + Horario.getHorarioPorDigito(horarioEscolhido) + " selecionado com sucesso.");
        return horarioEscolhido;
    }    
    
    public void agendaBarbeiro() {
        System.out.println("Horários ocupados.");
        for (Integer horario : horariosOcupadosBarbeiro) {
            String horarioFormatado = Horario.getHorarioPorDigito(horario);
            System.out.println(horarioFormatado);
        }
    }

    public void horariosDisponiveisBarbeiro() {
        System.out.println("Horários disponíveis para o barbeiro: " + barbeiro.getNome());

        if (Horario.getHorariosBarbearia().isEmpty()) {
            Horario.criarHorarios();
        }

        List<Horario> horariosDisponiveis = new ArrayList<>();
    
        for (Horario horario : Horario.getHorariosBarbearia()) {
            if (!horariosOcupadosBarbeiro.contains(horario.getDigito())) {
                horariosDisponiveis.add(horario);
            }
        }
    
        if (!horariosDisponiveis.isEmpty()) {
            for (Horario horario : horariosDisponiveis) {
                System.out.println(horario.getDigito() + ": " + horario.getHorario());
            }
        } else {
            System.out.println("Nenhum horário disponível para este barbeiro.");
        }
    }
    
    public boolean isDisponivel(int digitoHorario) {
        // Verifica se o horário está na lista de horários disponíveis e não está ocupado
        return Horario.getHorariosBarbearia().stream()
                      .anyMatch(h -> h.getDigito() == digitoHorario) && !horariosOcupadosBarbeiro.contains(digitoHorario);
    }
    

    public List<Integer> getAgendaBarbeiro() {
        return horariosOcupadosBarbeiro;
    }

    public void setHorariosOcupadosBarbeiro(List<Integer> horariosOcupadosBarbeiro) {
        this.horariosOcupadosBarbeiro = horariosOcupadosBarbeiro;
    }   
}
