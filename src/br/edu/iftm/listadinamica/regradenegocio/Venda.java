package br.edu.iftm.listadinamica.regradenegocio;

import java.util.ArrayList;

import br.edu.iftm.listadinamica.classes.*;
//import br.edu.iftm.listadinamica.classes.CarrinhoDeCompra;
//import br.edu.iftm.listadinamica.classes.Cliente;

public class Venda {
    private Cliente cliente;
    private CarrinhoDeCompra carrinhoDeCompra;
    private boolean desconto50;
    private boolean desconto30;
    private boolean desconto10;

    public Venda(Cliente cliente, CarrinhoDeCompra carrinhoDeCompra) {
        this.cliente = cliente;
        this.carrinhoDeCompra = carrinhoDeCompra;
        this.desconto50 = false;
        this.desconto30 = false;
        this.desconto10 = false;
    }

    private void desconto(String codigoDesconto) {
        if (codigoDesconto.equals("50OFF")) {
            this.desconto50 = true;
            this.desconto30 = false;
            this.desconto10 = false;
        } else if (codigoDesconto.equals("30OFF")) {
            this.desconto50 = false;
            this.desconto30 = true;
            this.desconto10 = false;
        } else if (codigoDesconto.equals("10OFF")) {
            this.desconto50 = false;
            this.desconto30 = false;
            this.desconto10 = true;
        }

    }

    private double calculaFrete() {
        double valor;
        if (this.cliente.getCep().equals("38300000")) {
            valor = 0.0;
        } else {
            valor = 20.0;
        }
        return valor;
    }

    public void notaFiscal(){
        double confereValor = 0.0;
        int qtd = 0;
        double preco = 0d;
        ArrayList<Produtos> listaProdutos = this.carrinhoDeCompra.getProdutos();
        System.out.println("Nota Fiscal");
        for (Produtos produto : listaProdutos) {
            qtd = produto.getQuantidade();
            preco = produto.getPreco();
            confereValor = confereValor+(qtd*preco);
            System.out.println("Cliente: "+ this.cliente.getNome());
            System.out.printf("Nome: %s, Descricao: %s, Qtd: %d, Preço: %.2f \n",
                 produto.getNome(), produto.getDescricao(), qtd, preco);
        }
        if(confereValor == this.carrinhoDeCompra.getValorTotal()){
            this.desconto("50OFF");
            if(this.desconto50){
                confereValor = confereValor - (confereValor*0.5);
            }else if(this.desconto30){
                confereValor = confereValor - (confereValor*0.3);
            }else if(this.desconto10){
                confereValor = confereValor - (confereValor*0.1);
            }
        
            confereValor += this.calculaFrete();
            
            System.out.printf("Total: %.2f", confereValor);

        }else{
            System.out.println("Erro durante a operação de comprar, valor do carrinho está incorreto!!!");
        }
    }

}
