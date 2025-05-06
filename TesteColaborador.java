// TesteColaborador.java
// Testes manuais para a classe Colaborador (sem JUnit)

public class TesteColaborador {
    public static void main(String[] args) {
        System.out.println("Iniciando testes da classe Colaborador...");

        // Teste de criação e nome
        Colaborador pessoa1 = new Colaborador("Ana", 101);
        if (!"Ana".equals(pessoa1.getNome())) {
            System.out.println("Erro: nome incorreto.");
        }

        // Teste com nome vazio
        Colaborador pessoa3 = new Colaborador("", 200);
        if (!"".equals(pessoa3.getNome())) {
            System.out.println("Erro: nome vazio");
        }

        // Teste de adicionar obra
        Obra obra = new Obra("Filme Teste", "Aventura", 2023, "Trilha X");
        pessoa1.adicionarObra(obra);

        System.out.println("Testes de Colaborador finalizados.");
        pessoa1.mostrarObras();
    }
}
