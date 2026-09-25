package aula06;

public class App {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();

        // TESTE 1: Fila com 0 alunos
        System.out.println("--- Teste: Fila Vazia ---");
        fila.listarAlunos();
        fila.atenderProximo();
        System.out.println("Quantidade: " + fila.quantidadeAlunos());

        // TESTE 2: Adicionar alunos
        System.out.println("\n--- Teste: Adicionando Alunos ---");
        fila.adicionarAlunoNoFim(new Aluno("Ana", "202401", 2));
        fila.adicionarAlunoNoFim(new Aluno("Bruno", "202402", 1));
        fila.adicionarAlunoNoInicio(new Aluno("Carla", "202403", 3));
        fila.listarAlunos();
        System.out.println("Quantidade: " + fila.quantidadeAlunos());

        // TESTE 3: Atender o proximo (remove o primeiro)
        System.out.println("\n--- Teste: Atender Proximo ---");
        fila.atenderProximo();
        fila.listarAlunos();

        // TESTE 4: Remover aluno por matricula
        System.out.println("\n--- Teste: Remover por Matricula ---");
        fila.removerAluno("202402");
        fila.listarAlunos();

        // TESTE 5: Fila com 1 aluno - remover o ultimo
        System.out.println("\n--- Teste: Remover Ultimo (fila com 1 aluno) ---");
        fila.removerUltimoAluno();
        fila.listarAlunos();
        System.out.println("Quantidade: " + fila.quantidadeAlunos());

        // TESTE 6: Buscar aluno existente
        System.out.println("\n--- Teste: Buscar aula07.Aluno ---");
        fila.adicionarAlunoNoFim(new Aluno("Daniel", "202404", 2));
        fila.adicionarAlunoNoFim(new Aluno("Eva", "202405", 1));
        Aluno encontrado = fila.buscarAluno("202404");
        if (encontrado != null) {
            System.out.println("aula07.Aluno encontrado: " + encontrado);
        }

        // TESTE 7: Buscar aluno inexistente
        Aluno naoExiste = fila.buscarAluno("999999");
        if (naoExiste == null) {
            System.out.println("aula07.Aluno com matricula 999999 nao encontrado.");
        }

        // TESTE 8: Listar fila final
        System.out.println("\n--- Fila Final ---");
        fila.listarAlunos();
        System.out.println("Quantidade: " + fila.quantidadeAlunos());
    }
}