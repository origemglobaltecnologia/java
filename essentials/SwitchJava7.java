/**
 * CONCEITO: Switch Statement clássico.
 * Fall-through: Se não houver 'break', o código continua executando os próximos cases.
 * Java 7 permitiu o uso de Strings no switch.
 */
public class SwitchJava7 {
    public static void main(String[] args) {
        String dia = "SEGUNDA";

        System.out.println("--- INICIO DO SWITCH ---");
        switch (dia) {
            case "SEGUNDA":
                System.out.println("Acordar cedo...");
                // Note a ausência do break: ele vai executar o "TERCA" também
            case "TERCA":
                System.out.println("Ir para a academia...");
                break; 
            case "QUARTA":
                System.out.println("Estudar Java...");
                break;
            default:
                System.out.println("Dia invalido");
        }
        System.out.println("--- FIM DO SWITCH ---");
    }
}
