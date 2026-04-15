/**
 * CONCEITO: JavaBeans / POO Clássica.
 * Encapsulamento: Atributos privados e métodos públicos.
 * Boilerplate: Código repetitivo necessário no Java antigo (Getters/Setters).
 */
public class UsuarioJava7 {
    private String login;
    private String senha;

    // Constructor: Inicializa o estado do objeto
    public UsuarioJava7(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Acessores (Getters) e Modificadores (Setters)
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public void exibir() {
        System.out.println("Usuário: " + this.login);
    }
}
