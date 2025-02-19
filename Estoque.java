/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class Estoque {

    ArrayList<Produto> Estoque = new ArrayList<>();

    public void adicionarProduto(String nome, int quantidade) {
        for (Produto prod : Estoque) {
            if (prod.getNome().equals(nome)) {
                System.out.println("O produto ja existe. Adicionado " + quantidade + " ao estoque");
                prod.addQtd(quantidade);
                return;

            }
        }

        Estoque.add(new Produto(nome, quantidade));
        System.out.println("novo produto adicionado. " + nome + " com quantidade " + quantidade);
    }

    
     public void produtoMaisEstocado() {
        if (Estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
            return;
        }

        Produto maisEstocado = Estoque.get(0);
        for (Produto prod : Estoque) {
            if (prod.getQuantidade() > maisEstocado.getQuantidade()) {
                maisEstocado = prod;
            }
        }

        System.out.println("Produto mais estocado: " + maisEstocado.getNome() + " com " + maisEstocado.getQuantidade() + " unidades.");
    }

    public  void removerProduto(String nome, int quantidade) {
        for (Produto prod : Estoque) {
            if (prod.getNome().equals(nome)) {
                if (prod.getQuantidade() >= quantidade) {
                    prod.remQtd(quantidade);  // Certifique-se de que este método funciona corretamente
                    System.out.println("Removido " + quantidade + " de " + nome);
                    if (prod.getQuantidade() == 0) {
                        Estoque.remove(prod);
                    }
                } else {
                    System.out.println("Quantidade insuficiente no estoque.");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void consultarQuantidade(String nome) {
        for (Produto prod : Estoque) {
            if (prod.getNome().equals(nome)) {
                System.out.println("Quantidade de " + nome + ": " + prod.getQuantidade());
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void limparEstoque() {
        Estoque.clear();
        
    }
    public void listarProdutos() {
    if (Estoque.isEmpty()) {
        System.out.println("O estoque está vazio.");
        return;
    }

    System.out.println("Produtos no estoque:");
    for (Produto prod : Estoque) {
        System.out.println("Nome: " + prod.getNome() + ", Quantidade: " + prod.getQuantidade());
    }
}
}
       
   




          
         
         
       
       
   


