package src.models;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefas {
    private final ArrayList<Tarefa> lista;

    public ListaTarefas() {
	this.lista = new ArrayList<Tarefa>();
    }
    
    public ArrayList<Tarefa> listar() {
	ArrayList<Tarefa> copia = new ArrayList<>(this.lista);
	return copia;
    }
    
    public void adicionar(String nomeTarefa) {
	this.lista.add(new Tarefa(nomeTarefa));
    }
    
    public Tarefa pesquisar(String nomeTarefa) {
	List<Tarefa> filtro =
	    this.lista.stream()
	    .filter(tarefa -> tarefa.getNome().equals(nomeTarefa))
	    .toList();

	if(!filtro.isEmpty()) {
	    return filtro.get(0);
	} else {
	    return null;
	}
    }
    
    public void atualizar(String nomeTarefa) {
	Tarefa tarefaEncontrada = pesquisar(nomeTarefa);

	if(tarefaEncontrada != null) {
	    tarefaEncontrada.setStatus();
	} 
    }

    public void deletar(String nomeTarefa) {
	Tarefa tarefaEncontrada = pesquisar(nomeTarefa);

	if(tarefaEncontrada != null) {
	    this.lista.remove(tarefaEncontrada);
	}
    }
}
