package Classes;

public class Conta {
    private TipoOperacao operacao;
    private double valorOperacao;
    private double saldo;

    //#region
    public TipoOperacao getOperacao() {
        return operacao;
    }
    public double getValorOperacao() {
        return valorOperacao;
    }
    public double getSaldo() {
        return saldo;
    }
    //#endregion
    
    public void realizaOperacao(TipoOperacao operacao, double valor){
        this.operacao = operacao;
        this.valorOperacao = valor;


        if (operacao == TipoOperacao.SAQUE){
            if (valor <= saldo){
                this.saldo = this.saldo - valor;
                System.out.println("Saque ralizado com sucesso");
            }else
            System.out.println("Nao há saldo suficienta para realizar o saque");

        }else
        if (operacao == TipoOperacao.DEPOSITO){
            this.saldo = this.saldo + valor;
            System.out.println("Deposito realizado com sucesso");

        }
        System.out.println("O saldo atual é " + this.saldo);

    }
    public void exibirSaldo() {
    }
}
