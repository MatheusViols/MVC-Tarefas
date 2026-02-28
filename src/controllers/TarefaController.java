package src.controllers;

import java.util.List;

import src.views.TarefaView;

import src.models.ListaTarefas;
import src.models.Tarefa;


public class TarefaController {
    private ListaTarefas lista;
    private TarefaView view;

    public TarefaController(ListaTarefas lista, TarefaView view) {
	this.lista = lista;
	this.view = view;
    }
    
    public Boolean ciclo(){
	String entrada = this.view.mainView();

	boolean continuar = true;
	switch(entrada) {
	case "help":
	    this.view.mostrarAjuda();
	    break;
	case "add":
	    adicionarTarefa();
	    break;
	case "list":
	    listarTarefas();
	    break;
	case "att":
	    atualizarTarefa();
	    break;
	case "del":
	    deletarTarefa();
	    break;
	case "quit":
	    continuar = false;
	    break;
	}
	return continuar;
    }
    
    public void listarTarefas() {
	List<Tarefa> listaDeTarefas = this.lista.listar();
	this.view.mostrarTarefas(listaDeTarefas);
    }
    public void adicionarTarefa() {
	String nomeTarefa = this.view.inputNomeTarefa();
	this.lista.adicionar(nomeTarefa);
	this.view.mostrarMensagem("Tarefa adicionada!");
    }
    public void atualizarTarefa() {
	String nomeTarefa = this.view.inputNomeTarefa();
	this.lista.atualizar(nomeTarefa);
	this.view.mostrarMensagem("Tarefa atualizada!");
    }
    public void deletarTarefa() {
	String nomeTarefa = this.view.inputNomeTarefa();
	this.lista.deletar(nomeTarefa);
	this.view.mostrarMensagem("Tarefa deletada!");
    }


    
}
