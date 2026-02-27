package src;

import java.util.Scanner;

import src.controllers.TarefaController;

import src.views.TarefaView;

import src.models.ListaTarefas;
import src.models.Tarefa;

public class Main {
    public static void main(String args[]) {
	TarefaController controller = new TarefaController();
	
	ListaTarefas lista = new ListaTarefas();
	TarefaView view = new TarefaView(controller);

	controller.setLista(lista);
	controller.setView(view);

	while(true) {
	    Boolean continuar = controller.ciclo();
	    if(!continuar) {
		break;
	    }
	}
    }
}
