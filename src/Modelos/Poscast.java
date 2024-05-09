package Modelos;

public class Poscast extends Audio{
    private String apresentador;
    private String descricao;

    @Override
    public void reproduzindo() {
        System.out.println("\nReproduzindo o Podcast " + getTitulo() + " - " + descricao);
    }

    @Override
    public int getClassificacao() {
        if(this.getCurtidas() > 800) {
            return 10;
        } else {
            return 8;
        }
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
