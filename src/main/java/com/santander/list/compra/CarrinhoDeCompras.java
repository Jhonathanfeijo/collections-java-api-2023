package com.santander.list.compra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensRemovidos = new ArrayList<>();
        for(Item item : itens) {
            if(item.getNome().equalsIgnoreCase(nome))
                itensRemovidos.add(item);
        }
        itens.removeAll(itensRemovidos);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : itens)
            valorTotal += item.getPreco() * item.getQuantidade();
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Telefone", 20.00, 5);
        carrinho.adicionarItem("Computador", 15.75, 7);
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("computador");
        carrinho.exibirItens();
        System.out.println(carrinho.calcularValorTotal());
    }
}
