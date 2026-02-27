package src.views;

import java.util.Scanner;
import java.util.List;

import src.controllers.TarefaController;

public class TarefaView {
    private final Scanner sc;
    private final TarefaController controller;

    public TarefaView(TarefaController controller) {
	this.sc = new Scanner(System.in);
	this.controller = controller;
    }
    
    public Boolean mainView() {
	Boolean continuar = true;

	System.out.printf("Tarefas $ ");
	String entrada = this.sc.next();

	switch(entrada){
	case "help":
	    mostrarAjuda();
	    break;
	case "add":
	    postRequest();
	    break;
	case "list":
	    getRequest();
	    break;
	// case "att":
	//     putTarefa();
	//     break;
	// case "del":
	//     deleteTarefa();
	//     break;
	case "quit":
	    continuar = false;
	    break;
	default:
	    System.out.println("Comando não encontrado");
	}
	
	return continuar;
    }

    public void mostrarAjuda() {
	System.out.println("add para adicionar tarefa\n" +
			   "list para listar tarefas\n" +
			   "att para atualizar tarefa\n" +
			   "del para deletar tarefa\n" +
			   "quit para sair\n");
    }

    public void mostrarTarefas(List tarefas) {
	tarefas.forEach((tarefa) -> {
		System.out.println(tarefa.toString());
	    });
    }
    
    public void getRequest() {
	List response = this.controller.getHandler();
	mostrarTarefas(response);
    }

    public void postRequest() {
	System.out.printf("Nome da tarefa:\n-> ");
	String nomeTarefa = this.sc.next();
	this.controller.postHandler(nomeTarefa);
    }
    
    // public void putRequest() {
    // 	String nomeTarefa = this.sc.next();
    // 	TarefaController.putHandler(nomeTarefa);
    // }

    // public void delRequest() {
    // 	String nomeTarefa = this.sc.next();
    // 	TarefaController.delHandler(nomeTarefa);
    // }


}
