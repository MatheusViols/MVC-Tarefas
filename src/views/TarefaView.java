package src.view;

import java.util.Scanner;
import java.util.List;

import src.controller.TarefaController;

public class TarefaView {
    private final Scanner sc;

    public TarefaView() {
	this.sc = new Scanner(System.in);
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
	    postTarefa();
	    break;
	case "list":
	    mostrarTarefas();
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
		System.out.printf("Nome: %s\nCompleta: %b\n\n");
	    });
    }
    
    public void getRequest() {
	List response = TarefaController.getHandler();
	mostrarTarefas(response);
    }

    public void postRequest() {
	System.out.printf("Nome da tarefa:\n-> ");
	String nomeTarefa = this.sc.next();
	TarefaController.postHandler(nomeTarefa);
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
