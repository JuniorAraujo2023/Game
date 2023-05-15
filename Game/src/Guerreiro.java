
public class Guerreiro extends Jogador {
    public Guerreiro(String nome, int xp, int hp) {
        super(nome, xp, hp);
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("Movendo Guerreiro para x: " + x + ", y: " + y);
    }
}