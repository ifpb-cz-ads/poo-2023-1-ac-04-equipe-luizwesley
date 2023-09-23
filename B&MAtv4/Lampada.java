public class Lampada{
    private int codProduto;
    private float preco;
    private String grupo;
    public static int estoque;
    public Lampada(int codProduto, float preco, String grupo) {
        this.codProduto = codProduto;
        this.preco = preco;
        this.grupo = grupo;
    }
    public int getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}