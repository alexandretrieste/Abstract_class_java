public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        // podemos chamar métodos do Funcionario:
        gerente.setNome("Jhon Doe");

        // e também métodos do Gerente!
        gerente.setSenha(1243);
    }
}
