public class Carro {
    // variáveis
    public String marca, modelo, cor;
    public int ano;
    public boolean motor; // true ou false
    public float velAtual;
    // construtur para instanciar o objeto
    public Carro(String marca, String modelo, String cor,
                 int ano, boolean motor, float velAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    public void mostra(){
        System.out.println("\n Marca " + this.marca + " Modelo " + this.modelo + " Cor " + this.cor + " Motor "
        + this.motor + " Vel " + this.velAtual);
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor){ //está desligado
        this.motor = true;}
    }
    public void desligar(){ //está ligado
        if (this.motor){
        this.motor = false;}
    }
    public void acelerar(float x){
        if (this.motor){
            this.velAtual += x;
        }
    }
    public void frear(float x){
        if (this.motor){
            if (this.velAtual - x >= 0){
                this.velAtual -= x;
            }
        }
    }
}
