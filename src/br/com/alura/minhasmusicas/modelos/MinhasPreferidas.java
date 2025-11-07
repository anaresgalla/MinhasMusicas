package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.printf("%s está no topo das paradas de preferidos!%n", audio.getTitulo());
        } else {
            System.out.printf("Muita gente curte %s!%n", audio.getTitulo());
        }
    }
}
