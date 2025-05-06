// Colaborador.java
// Representa uma pessoa que participa de uma obra com diferentes funções.

import java.util.*;

public class Colaborador {
    private String nome;
    private int identificador;
    private List<Obra> obras;

    public Colaborador(String nome, int identificador) {
        this.nome = nome;
        this.identificador = identificador;
        this.obras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarObra(Obra obra) {
        obras.add(obra);
    }

    public void mostrarObras() {
        for (Obra obra : obras) {
            System.out.println("- " + obra.getTitulo());
        }
    }
}
