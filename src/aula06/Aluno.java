package aula06;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private int prioridade;

    public Aluno(String nome, String matricula, int prioridade) {
        this.nome = nome;
        this.matricula = matricula;
        this.prioridade = prioridade;
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
