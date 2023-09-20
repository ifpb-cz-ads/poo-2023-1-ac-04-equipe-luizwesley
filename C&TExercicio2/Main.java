import java.util.Scanner;
public class Main {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o nome do titular da conta: ");
            String nome = scan.nextLine();
            System.out.println("Digite o numero da conta: ");
            int num = scan.nextInt();
            Conta conta = new Conta(nome, num);
            System.out.println("Bem vindo, " + conta.getNome()+"!!");
            boolean flag = true;
            while(flag){
                System.out.println("O que deseja fazer?");
                System.out.println("Digite 1 para depositar.");
                System.out.println("Digite 2 para sacar.");
                System.out.println("Digite 0 para encerrar a sessão.");
                int resp = scan.nextInt();
                switch (resp) {
                    case 1:
                        System.out.println("Qual valor deseja depositar?");
                        float valor = scan.nextInt();
                        conta.depositar(valor);
                        System.out.println(valor + " depositado com sucesso.");
                        System.out.println("Seu saldo atual é " + conta.getSaldo());
                        break;
                    case 2:
                        System.out.println("Qual valor deseja sacar?");
                        float valorSacar = scan.nextInt();
                        if(conta.sacar(valorSacar)==true){
                            System.out.println(valorSacar+" sacado com sucesso!");
                            System.out.println("Seu saldo atual é " + conta.getSaldo());
                        }
                        else{
                            System.out.println("Saldo insuficiente para realizar esse saque");
                        }
                        break;
                    case 0:
                        System.out.println("Sessão encerrada!");
                        flag = false;
                        break;
                        
                
                
                }
            }
        }
    }
}
