package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é digno de grammy");
        }else{
            System.out.println(audio.getTitulo() + " é uma bosta");
        }
    }
}
