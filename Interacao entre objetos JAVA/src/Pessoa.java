public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;
    private String email;
    private String telefone;
    private Conta conta;

    public Pessoa(String nome, String cpf, int idade, char sexo, String email, String telefone, float saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.conta = new Conta();
        conta.setNconta("132");
        conta.setAgencia("1438");
        conta.setSaldo(2500);
    }

    public void efetuarSaque(float valor){
        conta.sacar(valor);
    }
    public void efetuarDeposito(float valor){
        conta.depositar(valor);
    }

}
