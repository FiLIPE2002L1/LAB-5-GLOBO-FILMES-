// Main.java
// Classe principal que instancia colaboradores e obras e demonstra o uso das funcionalidades.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando colaboradores
        Colaborador ana = new Colaborador("Ana", 1);
        Colaborador bruno = new Colaborador("Bruno", 2);
        Colaborador camila = new Colaborador("Camila", 3);

        // Criando obras
        Obra futuroDigital = new Obra("Futuro Digital", "Tecnologia", 2025, "Beats Lab");
        Obra mundosParalelos = new Obra("Mundos Paralelos", "Ficção", 2019, "Synth Orchestra");

        // Registrando participações
        futuroDigital.registrarParticipacao(ana, Arrays.asList("Direção", "Roteiro"));
        futuroDigital.registrarParticipacao(bruno, Arrays.asList("Atuação", "Câmera"));

        mundosParalelos.registrarParticipacao(ana, Arrays.asList("Câmera", "Atuação"));
        mundosParalelos.registrarParticipacao(camila, Arrays.asList("Roteiro", "Direção"));

        // Exibindo filmografia
        System.out.println("Obras de Ana:");
        ana.mostrarObras();
        System.out.println();

        // Exibindo detalhes das obras
        System.out.println("Detalhes de 'Futuro Digital':");
        futuroDigital.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes de 'Mundos Paralelos':");
        mundosParalelos.exibirDetalhes();
    }
}
