public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public Rio() {
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if (this.nivel - x >= 0){
            this.nivel -= x;
        }
        else{
            System.out.println("Nível do rio zerado");
        }
    }
    public void limpar(){
        this.poluido = false;
    }
    public void sujar(){
        this.poluido = true;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + poluido +
                '}';
    }
}
