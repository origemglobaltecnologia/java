public class TratamentoErros {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Vai gerar ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // MULTI-CATCH (Novidade do Java 7): Captura varios erros em um unico bloco
            System.out.println("Erro capturado: " + e.getClass().getSimpleName());
            
        } catch (Exception e) {
            // Catch generico (sempre por ultimo!)
            System.out.println("Ocorreu um erro inesperado.");
            
        } finally {
            // Sempre executa. Otimo para fechar arquivos ou bancos de dados.
            System.out.println("Encerrando recursos com seguranca...");
        }
    }
}
