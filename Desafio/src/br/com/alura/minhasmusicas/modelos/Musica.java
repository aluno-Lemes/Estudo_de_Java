package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String album;
    private String autor;
    private String genero;

    //getter
    public String getAlbum() {
        return album;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }


    //setter
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalDeReproducoes() > 500) {
            return 10;
        }else{
            return 5;
        }
    }
}