package src.controllers;

import java.util.List;

import src.views.TarefaView;

import src.models.ListaTarefa;
import src.models.Tarefa;


public class TarefaController {
    private ListaTarefa lista;
    private TarefaView view;

    public TarefaController(ListaTarefa listaTarefa, TarefaView view) {
	this.lista = listaTarefa;
	this.view = tarefaView;
    }
    
    public Boolean ciclo(){
	Boolean continuar = this.view.mainView();
	return continuar;
    }
    
    static public List getHandler() {
	List response = this.lista.getTarefas();
	return response;
    }
    static public void postHandler(String nomeTarefa) {
	this.lista.adicionarTarefa(new Tarefa(nomeTarefa));
    }
    
}
