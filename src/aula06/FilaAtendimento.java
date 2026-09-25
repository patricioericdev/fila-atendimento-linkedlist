package aula06;

public class FilaAtendimento {
    private LinkedList<Aluno> fila;

    public FilaAtendimento() {
        this.fila = new LinkedList<>();
    }

    public void adicionarAlunoNoFim(Aluno aluno) {
        fila.insertEnd(aluno);
    }

    public void adicionarAlunoNoInicio(Aluno aluno) {
        fila.insertFirst(aluno);
    }

    public void atenderProximo() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        Aluno proximo = fila.peekFirst();
        System.out.println("Atendendo aluno: " + proximo.getNome());
        fila.removeFirst();
    }

    public void removerAluno(String matricula) {
        final var aluno = new Aluno(matricula);
        fila.remove(aluno);
    }

    public void removerUltimoAluno() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        fila.removeEnd();
    }

    public Aluno buscarAluno(String matricula) {
        final var aluno = new Aluno(matricula);
        return fila.get(aluno);
    }

    public void listarAlunos() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            fila.print();
        }
    }

    public int quantidadeAlunos() {
        return fila.size();
    }
}