package com.santander.list.compra;

public class Item {

    String nome;
    double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Nome do item: " + this.nome + ", Quantidade: " + this.quantidade + ", Preco: " + String.format("%.2f", this.preco);
    }
}
