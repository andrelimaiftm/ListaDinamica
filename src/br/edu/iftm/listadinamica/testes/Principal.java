package br.edu.iftm.listadinamica.testes;

import br.edu.iftm.listadinamica.classes.*;
//import br.edu.iftm.listadinamica.classes.CarrinhoDeCompra;
//import br.edu.iftm.listadinamica.classes.Cliente;
//import br.edu.iftm.listadinamica.classes.Produtos;
import br.edu.iftm.listadinamica.regradenegocio.Venda;

public class Principal {
    public static void main(String[] args) {
        Produtos p1 = new Produtos("Patricia Abracanel Essence", "Desodorante Colônia Feminina Jequiti", 78.96, 2);
        Produtos p2 = new Produtos("Perfume do Silvo Santos", "enriquecer o seu cheiro", 120, 2);
        Produtos p3 = new Produtos("Perfurme AIR", "Reinvente seu dia com essa fragancia", 120, 1);

        Cliente cliente  = new Cliente("João", 31, "00000000", "joao@bol.com.br");
        cliente.adicionaEndereco("avenida 31", 2000, "casa", "Centro", "38300000", "Ituiutaba");


        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionaProduto(p1);
        carrinho.adicionaProduto(p2);

        //venda dos produtos
        Venda venda = new Venda(cliente, carrinho);
        venda.notaFiscal();


    }

}
