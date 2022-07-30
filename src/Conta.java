public class Conta {

    // Atributos
    public float numConta;
    protected String tipo; // CC ou CP;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos
    public Conta(String nome, float conta) {

        this.setNumConta(conta);
        this.setDono(nome);
        this.setSaldo(0);
        this.setStatus(false);
        /*
         * saldo = 0
         * status = false;
         */

    }

    public void abrirConta(String tipo) {

        this.setTipo(tipo);
        this.setStatus(true);
        if (this.getTipo() == "cp") {
            this.setSaldo(this.getSaldo() + 150);
        } else if (this.getTipo() == "cc") {
            this.setSaldo(this.getSaldo() + 50);
        }
        /*
         * Mudar Status = true;
         * se cc = "+ 50 reais";
         * se cp = "+ 150 reais";
         */
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Dinheiro em conta, necessário realizar saque para finalizar a conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em dívida, não é possível realizar o fechamento de conta.");
        } else {
            this.setStatus(false);
        }
        /*
         * saldo tem que ser = 0;
         * saldo não pode ser negativo;
         */
    }

    public void depositar(float dindin) {
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + dindin);
            System.out.println("Depósito de R$" + dindin + " realizado com sucesso.");
        } else {
            System.out.println("Impossível realizar operação, conta fechada.");
        }
        /* Conta tem que estar aberto = status true */
    }

    public void sacar(float saque) {
        if ((this.getStatus() == true) && (this.getSaldo() >= saque)) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque de R$"+ saque +" reais realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
        /* Tem que ter saldo para saque e conta aberta */
    }

    public void pagarMensal() {
        int mes = 0;
        if (this.getTipo() == "cc") {
            mes = 12; 
        } else {
            mes = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - mes);
            System.out.println("Pagamento de R$"+ mes + " reais, mensalidade da conta.");
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
        /*
         * cc pagará 12 reais
         * cp pagará 20 reais
         */
    }
    public void verificarConta(){
        System.out.println("-----------------------------------");
        System.out.println("STATUS DA CONTA");
        System.out.println("-----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Saldo "+ this.getSaldo());
        System.out.println("Status " + this.getStatus());
        System.out.println("-----------------------------------");
    }

    // Métodos especiais

    public float getNumConta() {
        return this.numConta;
    }

    public void setNumConta(float numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}