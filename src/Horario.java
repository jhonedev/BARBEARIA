public class Horario {

    public static String horariosParaAgendar() {        
        String horarios = """
            1 - 9h
            2 - 9:30h
            3 - 10h
            4 - 10:30h
            5 - 11h
            6 - 11:30h
            7 - 12h
            """;
        return horarios;
    }

    public static String getHorario(int horario) {
        switch (horario) {
            case 1:return "9h";
            case 2: return "9:30h";
            case 3: return "10h";
            case 4: return "10:30h";
            case 5: return "11h";
            case 6: return "11:30h";
            case 7: return "12h";
            default: return "Horario inválido";
        }
    }
}
