package Principal;

import Modelos.MinhasPreferidas;
import Modelos.Musicas;
import Modelos.Poscast;

public class Main {
    public static void main(String[] args) {
        MinhasPreferidas preferidas = new MinhasPreferidas();
        Musicas leal = new Musicas();

        leal.setTitulo("Leal");
        leal.setDuracao(3.43);
        leal.setArtista("Djonga");
        leal.setAlbum("Ladrão");


        for (int i = 0; i < 2654; i++) {
            leal.reproduzAudio();
        }

        for (int i = 0; i < 1654; i++) {
            leal.curtir();
        }

        leal.reproduzindo();
        System.out.println("Total de reproduções: " + leal.getTotalReproducoes());
        System.out.println("Total de curtidas: " + leal.getCurtidas());
        preferidas.inclui(leal);

        Poscast entrevistaComDjonga = new Poscast();

        entrevistaComDjonga.setTitulo("Mano a Mano");
        entrevistaComDjonga.setDescricao("Entrevista com o Rapper Djonga");

        for (int i = 0; i < 1652; i++) {
            entrevistaComDjonga.reproduzAudio();
        }

        for (int i = 0; i < 656; i++) {
            entrevistaComDjonga.curtir();
        }
        entrevistaComDjonga.reproduzindo();
        System.out.println("Total de reproduções: " + entrevistaComDjonga.getTotalReproducoes());
        System.out.println("Total de curtidas: " + entrevistaComDjonga.getCurtidas());

        preferidas.inclui(entrevistaComDjonga);
    }
}
