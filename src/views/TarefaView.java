package src.views;

import java.util.Scanner;
import java.util.List;

import src.controllers.TarefaController;

public class TarefaView {
    private final Scanner sc;

    public TarefaView() {
	this.sc = new Scanner(System.in);
    }
    
    public String mainView() {
	System.out.printf("Tarefas $ ");
	String entrada = this.sc.next();

	return entrada;
    }

    public String inputNomeTarefa() {
	System.out.printf("Nome da tarefa:\n");
	this.sc.nextLine();
	String nomeTarefa = this.sc.nextLine();
	return nomeTarefa;
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

    public void mostrarMensagem(String mensagem) {
	System.out.println(mensagem);
    }
}
