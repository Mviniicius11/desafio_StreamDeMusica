package Modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " está entre os mais ouvidos de todos os tempos.");
        } else {
            System.out.println(audio.getTitulo() + " está entre os bem avaliados da plataforma");
        }
    }
}
