import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Integer> horariosOcupadosBarbeiro;
    
    public Agenda() {
        this.horariosOcupadosBarbeiro = new ArrayList<>();
    }

    public void adicionarAgendamento(int horario){
        horariosOcupadosBarbeiro.add(horario);
    }
    
    public void agendaBarbeiro() {
        System.out.println("Horários ocupados.");
        for (Integer horario : horariosOcupadosBarbeiro) {
            System.out.println(Horario.getHorario(horario));
        }
    }
    
    public boolean isDisponivel(int horario) {
        return !horariosOcupadosBarbeiro.contains(horario);
    }

    public List<Integer> getAgendaBarbeiro() {
        return horariosOcupadosBarbeiro;
    }

    public void setHorariosOcupadosBarbeiro(List<Integer> horariosOcupadosBarbeiro) {
        this.horariosOcupadosBarbeiro = horariosOcupadosBarbeiro;
    }   
}
