public class Main {
    public static void main(String[] args) {
        Conta wesley = new Conta("Wesley", "1111", 0);
        wesley.depositar(4500);
        System.out.println(wesley.getSaldo());
        if(wesley.sacar(500)==true){
            System.out.println("Sacado com sucesso, seu saldo agora é "+ wesley.getSaldo());
        }
        else{
            System.out.println("Saldo insuficiente!!");
        }
        
    }
}
