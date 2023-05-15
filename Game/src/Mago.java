
public class Mago extends Jogador {
    private int mp;

    public Mago(String nome, int xp, int hp, int mp) {
        super(nome, xp, hp);
        this.mp = mp;
    }

    @Override
    public void mover(int x, int y) {
        System.out.println("Movendo Mago para x: " + x + ", y: " + y);
    }
}