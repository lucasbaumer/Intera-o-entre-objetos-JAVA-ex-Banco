public class Conta {
    private String nconta;
    private String agencia;
    private float saldo;

    public void sacar(float valor){
        if(valor < saldo){
            System.out.println("-- Saldo Atual: " + saldo + " --");
            this.saldo = saldo - valor;
            System.out.println("-- Saque efetuado no valor de: " + valor + " --");
            System.out.println("-- Saldo Atual: " + saldo + " --");
        }
        else{
            System.out.println("-- Saldo Indisponível --");
            return;
        }
    }

    public void depositar(float valor){
        System.out.println("-- Saldo Atual: " + saldo + " --");
        this.saldo = saldo + valor;
        System.out.println("-- Depósito realizado no valor de: " + valor + " --");
        System.out.println("-- Saldo Atual: " + saldo + " --");
    }

    public void setNconta(String nconta){
        this.nconta = nconta;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
}
