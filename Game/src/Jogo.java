
public class Jogo {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Ana", 5, 100);
        Mago mago = new Mago("Carlos", 10, 80, 50);
        BolaDeFogo bolaDeFogo = new BolaDeFogo(30);
        Dragao dragao = new Dragao();

        Fase fase = new Fase();

        fase.carregar(guerreiro);
        fase.carregar(mago);
        fase.carregar(bolaDeFogo);
        fase.carregar(dragao);

        guerreiro.mover(10, 20);
        mago.mover(30, 40);
        bolaDeFogo.mover(50, 60);
        dragao.mover(70, 80);
    }
}
