// TesteObra.java
// Teste simples para a classe Obra

import java.util.Arrays;

public class TesteObra {
    public static void main(String[] args) {
        Colaborador autor = new Colaborador("Autor Teste", 77);
        Obra obra = new Obra("Obra Teste", "Drama", 2023, "Trilha Fictícia");
        obra.registrarParticipacao(autor, Arrays.asList("Diretor", "Roteirista"));

        System.out.println("Exibindo detalhes da obra:");
        obra.exibirDetalhes();
    }
}
