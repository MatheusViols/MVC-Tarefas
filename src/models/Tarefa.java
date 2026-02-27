package src.models;

public record Tarefa(String nome, Boolean status) {
    public Tarefa(String nome) {
	this(nome, false);
    }

    public String toString() {
	return String.format("Nome: %s\nStatus: %b\n", nome, status); 
    }
    
	
}
