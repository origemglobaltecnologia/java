public class UsuarioJava7 {
    private String login;
    private String senha;

    // Construtor completo manual
    public UsuarioJava7(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    // Getters e Setters (Boilerplate obrigatório)
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public void exibir() {
        System.out.println("Usuário: " + this.login);
    }
}
