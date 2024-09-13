import java.util.ArrayList;
import java.util.List;

public class Horario {
    private int digito;
    private String horario;
    private static List<Horario> horariosBarbearia = new ArrayList<>();

    public Horario(int digito, String horario) {
        this.digito = digito;
        this.horario = horario;
    }

    public static void criarHorarios() {
        horariosBarbearia.add(new Horario(1, "9h"));
        horariosBarbearia.add(new Horario(2, "9:30h"));
        horariosBarbearia.add(new Horario(3, "10h"));
        horariosBarbearia.add(new Horario(4, "10:30h"));
        horariosBarbearia.add(new Horario(5, "11h"));
        horariosBarbearia.add(new Horario(6, "11:30h"));
        horariosBarbearia.add(new Horario(7, "12h"));
    }

    public static void imprimirHorariosBarbearia() {
        System.out.println("Horarios");
        for (Horario horario : horariosBarbearia) {
            System.out.println(horario.getDigito() + ": " + horario.getHorario());
        }
    }

    public static List<Horario> getHorariosBarbearia() {
        return horariosBarbearia;
    }

    public static String getHorarioPorDigito(int digito) {
        for (Horario horario : horariosBarbearia) {
            if (horario.getDigito() == digito) {
                return horario.getHorario();
            }
        }
        return null;
    }
    
    public int getDigito() {
        return digito;
    }

    public String getHorario() {
        return horario;
    }
}
