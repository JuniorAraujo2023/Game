
public class Fase {
    public void carregar(Object elemento) {
        if (elemento instanceof Jogador) {
            Jogador jogador = (Jogador) elemento;
            System.out.println("Carregando jogador " + jogador.getNome());
        } else if (elemento instanceof BolaDeFogo) {
            BolaDeFogo bolaDeFogo = (BolaDeFogo) elemento;
            System.out.println("Carregando Bola de Fogo com poder " + bolaDeFogo.getPoder());
        } else if (elemento instanceof Dragao) {
            Dragao dragao = (Dragao) elemento;
            System.out.println("Carregando Dragão");
        } else {
            System.out.println("Elemento desconhecido");
        }
    }
}