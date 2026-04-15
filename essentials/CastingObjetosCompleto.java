class Veiculo { void mover() { System.out.println("Veiculo movendo"); } }
class Carro extends Veiculo { void ligarAr() { System.out.println("Ar condicionado ligado"); } }

public class CastingObjetosCompleto {
    public static void main(String[] args) {
        // UPCASTING (Sempre seguro)
        Veiculo v = new Carro(); 
        v.mover(); 
        // v.ligarAr(); // ERRO: Veiculo não conhece o método ligarAr

        // DOWNCASTING (Requer autorização)
        if (v instanceof Carro) { // Verificação de segurança
            Carro c = (Carro) v; 
            c.ligarAr(); // Agora o Java "deixa" usar
        }
    }
}
