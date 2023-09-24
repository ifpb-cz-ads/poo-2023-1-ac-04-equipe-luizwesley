public class ContaBancariaSimplificada{
    public String nomeDoCorrentista;
    public float saldo;
    public boolean contaÉEspecial;

    public void mostraDados(){
        System.out.println("Nome: "+nomeDoCorrentista);
        System.out.println("saldo: "+saldo);
        if(contaÉEspecial){
            System.out.println("A conta é especial.");
            if(saldo<0){
                System.out.println("Sua conta está no vermelho!");
            }
        }
        else{
            System.out.println("A conta é simples.");
        }
    }
}
