public class Team {
    private String nome;
    private String esporte;
    private static Jogador[] elenco = new Jogador[10];
    private static int contJogador = 0;
    public Team(String nome, String esporte, Jogador[] elenco) {
        this.nome = nome;
        this.esporte = esporte;
        this.elenco = elenco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEsporte() {
        return esporte;
    }
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
    public Jogador[] getElenco() {
        return elenco;
    }

    public static void contrataJogador(String nome){
        Jogador newPlayer = new Jogador(nome);
        elenco[contJogador] = newPlayer;
        contJogador++;
        System.out.println("Jogador contratado.");
    }
    public static void demiteJogador(String nome){
        for(int i=0; i<10; i++){
            if(elenco[i].getNome() == nome){
                elenco[i] = null;
                i=100;
                contJogador = contJogador - 1;
                System.out.println("Jogador demitido.");
            }
            else{System.out.println("Não existe");}
        }
    }

    public static void mostraJogadores(){
        for(int j = 0; j<9; j++){
            if(elenco[j] != null){

                System.out.println(elenco[j].getNome());
            } 
        }
    }
}