public class App {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        fila.adicionarAlunoNoFim(new Aluno("Ana", "202401", 2));
        fila.adicionarAlunoNoFim(new Aluno("Bruno", "202402", 1));
        fila.adicionarAlunoNoInicio(new Aluno("Carla", "202403", 3));
        System.out.println("--- Fila Inicial ---");
        fila.listarAlunos();
        System.out.println("Quantidade de alunos: " + fila.quantidadeAlunos());
        System.out.println();
        fila.atenderProximo();
        fila.removerAluno("202402");
        System.out.println("\n--- Fila Atualizada ---");
        fila.listarAlunos();
    }
}