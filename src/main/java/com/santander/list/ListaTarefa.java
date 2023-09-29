package com.santander.list;

import com.santander.Tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;
    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
        this.listaTarefa.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> removerTarefas = new ArrayList<Tarefa>();
        for(Tarefa tarefa : listaTarefa){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao))
                removerTarefas.add(tarefa);
        }
        listaTarefa.removeAll(removerTarefas);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public List<String> obterDescricoesTarefas(){
        List<String> listaDescricoes = new ArrayList<String>();
        for(Tarefa tarefa : listaTarefa)
            listaDescricoes.add(tarefa.getDescricao());
        return listaDescricoes;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionaTarefa("Almocar");
        listaTarefa.adicionaTarefa("Almocar");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        System.out.println(listaTarefa.obterDescricoesTarefas());
        listaTarefa.removeTarefa("Almocar");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());
        System.out.println(listaTarefa.obterDescricoesTarefas());
    }
}
