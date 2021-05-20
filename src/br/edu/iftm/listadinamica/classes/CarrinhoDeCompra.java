package br.edu.iftm.listadinamica.classes;

import java.util.ArrayList;

public class CarrinhoDeCompra {

    private ArrayList<Produtos> produtos;
    private double valorTotal;

    public CarrinhoDeCompra(){
        this.produtos = new ArrayList<Produtos>();
        this.valorTotal = 0;
    }

    public void adicionaProduto(Produtos produto){
        this.produtos.add(produto);
        this.valorTotal += (produto.getPreco()*produto.getQuantidade());
    }

    public void removeProduto(Produtos produto){
        this.produtos.remove(produto);
        this.valorTotal -= (produto.getPreco()*produto.getQuantidade());
    }    
    

    /**
     * @return ArrayList<Produtos> return the produtos
     */
    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }    

    /**
     * @return double return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }    

}
