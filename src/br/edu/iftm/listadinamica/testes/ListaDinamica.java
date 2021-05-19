package br.edu.iftm.listadinamica.testes;

import java.util.ArrayList;

import br.edu.iftm.listadinamica.classes.Cliente;

public class ListaDinamica {

    public static void somar (int... valores){
        int soma = 0;
        for (int valor : valores) {
            //soma = soma+valor;
            soma += valor;
        }
        //System.out.println(valores[0]);
        System.out.println("Resultado =" +soma);
    }

    public static void main(String[] args) {
        //int -> Interger
        //double -> Double
        //float -> Float
        //String -> String
        //ArrayList<Integer> ListaDinamica = new ArrayList<Integer>();
        //adiciona um elemento no final da lista
        /*ListaDinamica.add(1);
        ListaDinamica.add(2);
        ListaDinamica.add(99);
        ListaDinamica.add(-1);
        System.out.println(ListaDinamica.size());
        System.out.println(ListaDinamica);
        ListaDinamica.add(34);
        System.out.println(ListaDinamica.size());
        System.out.println(ListaDinamica);
        System.out.println("Lista: " + ListaDinamica.get(4));
        System.out.println("Posição:  " + ListaDinamica.indexOf(-1));
        //ListaDinamica.clear();
        //System.out.println(ListaDinamica.size());
        //System.out.println(ListaDinamica);
        ListaDinamica.remove(4);
        System.out.println(ListaDinamica.size());
        System.out.println(ListaDinamica);        
        System.out.println(ListaDinamica.size());
        System.out.println(ListaDinamica);*/

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        Cliente cliente1 = new Cliente("João", 18);
        Cliente cliente2 = new Cliente("Maria", 21);

        listaCliente.add(cliente1);
        listaCliente.add(cliente2);

        listaCliente.clear();

        if(!listaCliente.isEmpty()){
            for (int i = 0; i < listaCliente.size(); i++) {
                System.out.printf("Nome: %s, idade %d \n", listaCliente.get(i).getNome(), 
                    listaCliente.get(i).getIdade());
            }
    
            for (Cliente cliente : listaCliente) {
                System.out.printf("Nome: %s, idade %d \n", cliente.getNome(), 
                cliente.getIdade());
            }
        }else{
            System.out.println("Lista está vazia");
        }

        somar(1, 3);
        somar(1, 3, 4);
        somar(1, 3, 4, 10);

        

        //System.out.println(listaCliente);

        
    }
    
}
