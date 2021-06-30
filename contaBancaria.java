class ContaBanco {
    String nomeTitular;
    int numeroConta;
    String agenciaConta;
    double saldoConta;
    String dataAbertura;

    public ContaBanco(String nomeTitular, int numeroConta, String agenciaConta, double saldoConta, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.saldoConta = saldoConta;
        this.dataAbertura = dataAbertura;
    }

public String getNome() {
    return nomeTitular;
}
public void setNome(String nomeTitular) {
    this.nomeTitular = nomeTitular;
}
public int getConta() {
    return numeroConta;
}

    public void deposito(double depositar){
        saldoConta = saldoConta + depositar;
        System.out.println("valor depositado! \nsaldo atual: " + saldoConta);
        return;
    }

    public void redimentoMensal(){
        if(saldoConta > 0){
            double calc = (1.002  * saldoConta);
            saldoConta = calc;
            System.out.println("\nrendimento calculado. saldo atual: " + saldoConta);
            return;
        }
    System.out.print("\nsem saldo na conta.");
    }

    public void sacar(double saque){
        if(saque > saldoConta){
            System.out.print("\nnao ha saldo suficiente na conta.");
            return;
        }
        if(saque > 0) {
            saldoConta = saldoConta - saque;

            System.out.println("\nsaque efetuado com sucesso!\n seu saldo e de " + saldoConta);
            return;
        }

    System.out.print("\nnao foi possivel sacar nenhum valor.");
    }



    public class Main {
        public static void main(String[] args) {
            ContaBanco conta = new ContaBanco("Isaac Louzeiro" , 123, "Nubank", 2000, "quarta");

            conta.deposito(10);

            conta.sacar(1);

            conta.redimentoMensal();

        }
    }
}

// 