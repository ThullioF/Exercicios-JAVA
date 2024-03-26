package ex4;
public class Pedra extends Coisa{
    @Override
    public String quemSouEU() {
        return "Pedra";
    }

    @Override
    public void compara(Coisa c) {
        if(c.quemSouEU().equals("Pedra")){
            System.out.println("Houve empate");
        }
        else if (c.quemSouEU().equals("Papel")) {
            System.out.println("Pedra perde para Papel");
        }
        else if (c.quemSouEU().equals("Tesoura")){
            System.out.println("Pedra ganha de Tesoura");
        }
        else{
            System.out.println("Impossível de calcular");
        }
    }
}
