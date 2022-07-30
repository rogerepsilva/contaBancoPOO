public class App {
    public static void main(String[] args) throws Exception {

        Conta c1 = new Conta("Roger", 1f);
        c1.abrirConta("cc");
        c1.sacar(50);
        c1.depositar(199);
        c1.pagarMensal();
        c1.sacar(187);
        c1.fecharConta();
        c1.verificarConta();

        Conta c2 = new Conta("Eduardo", 2f);
        c2.abrirConta("cp");
        //c2.verificarConta();

        
    }
}
