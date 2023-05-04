package Aula05;

/**
 *
 * @author Henrique
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public boolean getStatus() {
        return status;
    }
    
    public ContaBanco(int N, String D, String T){
        setNumConta(N);
        setDono(D);
        setSaldo(0);
        setTipo(T);
        abrirConta();
    }
    public void abrirConta(){
        this.status = true;
    }
    public void fecharConta(){
        if (getSaldo() == 0){
            this.status = false;
            System.out.println("Conta Fechada!!!");
        }
        else{
            System.out.println("Saldo diferente de 0, favor igualar a 0");
        }
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        if (tipo.equals("CC")){
            this.tipo = tipo;
            this.saldo += 50;
        }
        if (tipo.equals("CP")){
            this.tipo = tipo;
            this.saldo = 150;
        }
        else{
            System.out.println("Tipo invalido");
        }
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(int denero){
        if (this.status == true){
            this.saldo -= denero;
        }
        else{
            System.out.println("Conta fechada");
        }
    }
    public void depositar(int denero){
        if (this.status == true){
            this.saldo += denero;
        }
        else{
            System.out.println("Conta fechada");
        }
    }
    public void pagarMensal(){
        if (this.tipo.equals("CC")){
            this.saldo -= 12;
        }
        if (this.tipo.equals("CP")){
            this.saldo -= 20;
        }
    }
    public void status(){
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }
}
