package src;

import src.controllers.TarefaController;

import src.views.TarefaView;

import src.models.ListaTarefas;

public class Main {
    public static void main(String args[]) {
	ListaTarefas lista = new ListaTarefas();
	TarefaView view = new TarefaView();
	
	TarefaController controller = new TarefaController(lista, view);
	
	while(controller.ciclo()) {};
    }
}
