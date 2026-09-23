public class Aluno {
    private String nome;
    private String matricula;
    private int prioridade;

    public Aluno(String nome, String matricula, int prioridade) {
        this.nome = nome;
        this.matricula = matricula;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return nome + " - " + matricula + " - prioridade " + prioridade;
    }
}
