public class Conta{
    private String nome;
    private String cpf;
    private float saldo;


    public Conta(String nome, String cpf, float saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(float valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public void depositar(float valor){
        saldo += valor;
    }
}