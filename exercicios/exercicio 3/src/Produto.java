public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;
    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public Produto() {

    }
    public void comprar(int x){
        this.qtde += x;
    }
    public void vender(int x){
        if (this.qtde - x >= 0){
            this.qtde -= x;
        }
        else {
            System.out.println("Produto em falta no estoque");
        }
    }
    public void subir(float x){
        this.preco += x;
    }
    public void descer(float x){
        if (this.preco - x >= 0){
            this.preco -= x;
        }
        else {
            System.out.println("O produto já está com valor zerado");
        }
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
