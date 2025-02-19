/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author CLEBERDASILVAFERNAND
 */
public class estoqueTest {
    
    Estoque est = new Estoque();
    
 

    @BeforeEach
    public void setUp() {
      
        est.adicionarProduto("creatina", 2);
        est.adicionarProduto("whey", 2);
    }

    @Test
    public void adicionarProdutoTest() {
        est.adicionarProduto("pao", 5);
        
        assertEquals("pao", est.Estoque.get(2).getNome());
        assertEquals(3, est.Estoque.size(), "A lista deve conter 3 produtos");
    }

    @Test
    public void removerProdutoTest() {
        est.removerProduto("whey", 1);
        
        assertEquals(1, est.Estoque.get(1).getQuantidade(), "Deve conter 1 whey");
    }

    @Test
    public void consultarQuantidadeTest() {
      
        est.consultarQuantidade("whey");
        
    }

    @Test
    public void produtoMaisEstocadoTest() {
        est.produtoMaisEstocado();
    //   assertEquals("creatina", est.produtoMaisEstocado().getNome(), "O produto mais estocado deve ser creatina");
   //assertEquals(2, est.produtoMaisEstocado().getQuantidade(), "A quantidade deve ser 2");

    }

    @Test
    public void limparEstoqueTest() {
        est.limparEstoque();
        assertEquals(0, est.Estoque.size(), "O estoque deve estar vazio");
    }
    @Test
public void listarProdutosTest() {
    est.adicionarProduto("creatina", 2);
    est.adicionarProduto("whey", 2);
    
 
    est.listarProdutos();
}
}