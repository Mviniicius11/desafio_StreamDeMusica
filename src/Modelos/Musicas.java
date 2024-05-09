package Modelos;

public class Musicas extends Audio{

    private String artista;
    private String album;
    private String genero;

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 2000) {
            return 10;
        } else if (getTotalReproducoes() <= 1000) {
            return 7;
        } else if (getTotalReproducoes() <= 600) {
            return 5;
        } else {
            return 3;
        }
    }

    @Override
    public void reproduzindo() {
        System.out.println("Reproduzindo %s de %s - Album %s" .formatted(getTitulo(), getArtista(), getAlbum()));
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
