public class Team {
    private String nome;
    private String esporte;
    private Jogador[] elenco;
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
    public void setElenco(Jogador[] elenco) {
        this.elenco = elenco;
    }
}