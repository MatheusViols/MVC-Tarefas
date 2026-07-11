package com.exemplo.tarefas;

import com.exemplo.tarefas.controllers.TarefaController;
import com.exemplo.tarefas.views.TarefaView;
import com.exemplo.tarefas.models.ListaTarefas;

public class Main {
    public static void main(String args[]) {
	ListaTarefas lista = new ListaTarefas();
	TarefaView view = new TarefaView();
	
	TarefaController controller = new TarefaController(lista, view);
	
	while(controller.ciclo()) {};
    }
}
