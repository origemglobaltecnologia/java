public class SwitchJava7 {
    public static void main(String[] args) {
        String dia = "SEGUNDA";

        System.out.println("--- INICIO DO SWITCH ---");
        switch (dia) {
            case "SEGUNDA":
                System.out.println("Acordar cedo...");
                // Sem break aqui! O Java vai "cair" para o próximo
            case "TERCA":
                System.out.println("Ir para a academia...");
                break; // Aqui ele para.
            case "QUARTA":
                System.out.println("Estudar Java...");
                break;
            default:
                System.out.println("Dia invalido");
        }
        System.out.println("--- FIM DO SWITCH ---");
    }
}
