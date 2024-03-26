package ex4;
public class Papel extends Coisa{
    @Override
    public String quemSouEU() {
        return "Papel";
    }

    @Override
    public void compara(Coisa c) {
        if(c.quemSouEU().equals("Papel")){
            System.out.println("Houve empate");
        }
        else if (c.quemSouEU().equals("Pedra")) {
            System.out.println("Papel ganha de Pedra");
        }
        else if (c.quemSouEU().equals("Tesoura")){
            System.out.println("Papel perde para Tesoura");
        }
        else{
            System.out.println("Impossível de calcular");
        }
    }
}
