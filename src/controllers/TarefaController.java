package src.controllers;

import java.util.List;

import src.views.TarefaView;

import src.models.ListaTarefas;
import src.models.Tarefa;


public class TarefaController {
    private ListaTarefas lista;
    private TarefaView view;

    public void setLista(ListaTarefas lista) {
	this.lista = lista;
    }
    public void setView(TarefaView view) {
	this.view = view;
    }
    
    public Boolean ciclo(){
	Boolean continuar = this.view.mainView();
	return continuar;
    }
    
    public List getHandler() {
	List response = this.lista.getTarefas();
	return response;
    }
    public void postHandler(String nomeTarefa) {
	this.lista.adicionarTarefa(new Tarefa(nomeTarefa));
    }
    
}
