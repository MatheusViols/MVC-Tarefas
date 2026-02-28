package src.models;

public class Tarefa {
    private String nome;
    private boolean completa;

    public Tarefa(String nome) {
	this.nome = nome;
	this.completa = false;
    }

    public String getNome() {
	return this.nome;
    }
    public boolean getStatus() {
	return this.completa;
    }

    public void setStatus() {
	this.completa = !this.completa;
    }

    public String toString() {
	String status = this.completa ? "Completa" : "Pendente";
	return String.format("Nome: %s\nStatus: %s\n", nome, status);
    }
    
	
}
