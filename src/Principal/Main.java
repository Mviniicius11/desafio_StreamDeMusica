package Principal;

import Modelos.MinhasPreferidas;
import Modelos.Musicas;
import Modelos.Poscast;

public class Main {
    public static void main(String[] args) {

        Musicas musica1 = new Musicas();

        musica1.setTitulo("Leal");
        musica1.setDuracao(4.5);
        musica1.setArtista("Djonga");
        musica1.setAlbum("Leal");


        for (int i = 0; i < 1000; i++) {
            musica1.reproduzAudio();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        musica1.reproduzindo();
        System.out.println("Total de reproduções: " + musica1.getTotalReproducoes());
        System.out.println("Total de curtidas: " + musica1.getCurtidas() + "\n");

        Poscast poscast1 = new Poscast();

        poscast1.setTitulo("PodPah");
        poscast1.setDescricao("Entrevista com o Rapper Djonga");

        for (int i = 0; i < 5000; i++) {
            poscast1.reproduzAudio();
        }

        for (int i = 0; i < 1000; i++) {
            poscast1.curtir();
        }
        poscast1.reproduzindo();
        System.out.println("O total de reproduções: " + poscast1.getTotalReproducoes());
        System.out.println("O total de curtidas: " + poscast1.getCurtidas());
        System.out.println("\nAvaliação de %s é %d" .formatted(poscast1.getDescricao(), poscast1.getClassificacao()));

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(poscast1);
        preferidas.inclui(musica1);
    }
}
