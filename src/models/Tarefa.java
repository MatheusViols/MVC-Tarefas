package src.models;

public record Tarefa(String nome, Boolean completa) {
    public Tarefa(String nome) {
	this(nome, false);
    }
}
