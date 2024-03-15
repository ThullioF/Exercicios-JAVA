package rh;
public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente(){
        super();//chama o construtor da classe pai
    }
    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);//chama o construtor da classe pai
        this.horaExtra = horaExtra;
    }
}
