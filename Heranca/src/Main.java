import rh.*;
public class Main {

    public static void exibeDados(Funcionario camaelao){
        System.out.println(camaelao.toString());
        System.out.println("Sálario final " + camaelao.calculaSalario());
    }

    public static void main(String[] args) {
        Assistente as1 = new Assistente("Fulano", "Franca","123", 3000,10);
        exibeDados(as1);

        Gerente ge1 = new Gerente("Ciclano", "Franca", "321", 5000,2000);
        exibeDados(ge1);

        Diretor di1 = new Diretor("Beltrano","Franca","456",10000,1000);
        exibeDados(di1);
    }
}