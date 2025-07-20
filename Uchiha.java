package Desafios;

public class Uchiha extends Ninja {
    String habilidadeEspecial;


    @Override
    public String toString() {
        return super.toString() +
                "\nHabilidade do Ninja: " + habilidadeEspecial;
    }
}
