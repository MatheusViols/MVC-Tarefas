package src.models;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaTarefas {
    private final ArrayList<Tarefa> LISTA;

    public ListaTarefas() {
	this.LISTA = new ArrayList<Tarefa>();
    }
    
    public ArrayList<Tarefa> getTarefas() {
	    return this.LISTA;
    }
    
    public void adicionarTarefa(Tarefa tarefa) {
	this.LISTA.add(tarefa);
    }

}
