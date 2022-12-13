public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // podemos chamar métodos do Funcionario:
        gerente.setNome("John Doe");

        // e também métodos do Gerente!
        gerente.setSenha(12345678);

    }
}
