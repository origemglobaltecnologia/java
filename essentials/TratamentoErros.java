/**
 * CONCEITO: Exception Handling.
 * Multi-catch (Java 7+): Tratar múltiplas exceções irmãs no mesmo bloco catch usando |.
 * hierarchy: Exceções mais genéricas (Exception) devem vir após as específicas.
 * finally: Bloco que sempre executa, útil para limpeza de recursos.
 */
public class TratamentoErros {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Erro de índice

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // Se for um desses dois erros, cai aqui
            System.out.println("Erro capturado: " + e.getClass().getSimpleName());
            
        } catch (Exception e) {
            // Captura qualquer outro erro (Polimorfismo de Exceção)
            System.out.println("Ocorreu um erro inesperado.");
            
        } finally {
            System.out.println("Encerrando recursos com seguranca...");
        }
    }
}
