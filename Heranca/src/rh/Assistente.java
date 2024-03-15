package rh;
public class Assistente {
    private float horaExtra;

    public Assistente(){
        super(); //chama construtor da classe pai
    }
    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario); //chama construtor da classe pai
        this.horaExtra = horaExtra;
    }

}
