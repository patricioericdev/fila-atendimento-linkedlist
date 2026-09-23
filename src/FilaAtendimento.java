public class FilaAtendimento {
    private LinkedList fila;

    public FilaAtendimento() {
        this.fila = new LinkedList();
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
        System.out.println("Atendendo aluno: " + fila.head.aluno.getNome());
        fila.removeFirst();
    }

    public void removerAluno(String matricula) {
        fila.remove(matricula);
    }

    public void removerUltimoAluno() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        fila.removeEnd();
    }

    public Aluno buscarAluno(String matricula) {
        return fila.get(matricula);
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