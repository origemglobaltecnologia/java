/**
 * CONCEITO: Polimorfismo e Referência de Objetos.
 * Upcasting: Tratar um filho como pai (automático).
 * Downcasting: Tratar um pai como filho (precisa de casting explícito e risco de ClassCastException).
 */
class Veiculo { void mover() { System.out.println("Veiculo movendo"); } }
class Carro extends Veiculo { void ligarAr() { System.out.println("Ar condicionado ligado"); } }

public class CastingObjetosCompleto {
    public static void main(String[] args) {
        // UPCASTING: Carro é um Veiculo. Referência 'v' tipo Veiculo aponta para objeto Carro.
        Veiculo v = new Carro(); 
        v.mover(); 
        // v.ligarAr(); // ERRO DE COMPILAÇÃO: O compilador olha para o tipo da referência (Veiculo).

        // DOWNCASTING: 'v' volta a ser tratado como Carro.
        if (v instanceof Carro) { // Verificação de segurança (boa prática OCP)
            Carro c = (Carro) v; // Casting explícito
            c.ligarAr(); // Agora o compilador acessa os métodos específicos de Carro
        }
    }
}
