package src;

import java.util.Scanner;

import src.controllers.TarefaController;

import src.views.TarefaView;

import src.models.ListaTarefas;
import src.models.Tarefa;

public class Main {
    public static void main(String args[]) {
	
	ListaTarefas Lista = new ListaTarefas();
	TarefaView view = new TarefaView();

	TarefaController controller = new TarefaController(Lista, view);
	while(true) {
	    Boolean continuar = controller.ciclo();
	    if(!continuar) {
		break;
	    }
	}
    }
}
