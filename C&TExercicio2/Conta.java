public class Conta{
    private String nome;
    private int num;
    private float saldo;


    public Conta(String nome, int num){
        this.nome = nome;
        this.num = num;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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