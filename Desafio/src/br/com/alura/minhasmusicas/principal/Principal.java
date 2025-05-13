package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Anthem");
        minhaMusica.setAutor("Rush");
        minhaMusica.setAlbum("Fly by Night");
        minhaMusica.setGenero("rock prog");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("PodPah");
        podcast.setHost("Igão e Mitico");
        podcast.setDescricao("Zé da manga e Juju do pix ep:483");

        for (int i = 0; i < 100; i++) {
            podcast.reproduzir();
        }

        for (int i = 0; i < 500 ; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(minhaMusica);


    }

}
