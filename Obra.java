// Obra.java
// Armazena as informações sobre um filme, incluindo participantes e características.

import java.util.*;

public class Obra {
    private String titulo;
    private String genero;
    private int ano;
    private String trilha;
    private Map<Colaborador, List<String>> participantes;

    public Obra(String titulo, String genero, int ano, String trilha) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        this.trilha = trilha;
        this.participantes = new HashMap<>();
    }

    public void registrarParticipacao(Colaborador colaborador, List<String> funcoes) {
        participantes.put(colaborador, funcoes);
        colaborador.adicionarObra(this);
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Trilha Sonora: " + trilha);
        System.out.println("Participações:");
        for (Map.Entry<Colaborador, List<String>> registro : participantes.entrySet()) {
            System.out.println("- " + registro.getKey().getNome() + ": " + String.join(", ", registro.getValue()));
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
