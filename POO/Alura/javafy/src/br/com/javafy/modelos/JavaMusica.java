package br.com.javafy.modelos;

public class JavaMusica extends JavaAudio {
    private String album;
    private String artista;
    private String genero;
    private int anoLancamento;
    private String compositor;

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

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }

    @Override
    public void exibiFichaTecnica() {
        System.out.println(artista);
        super.exibiFichaTecnica();
    }
}
