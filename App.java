/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package empresa;

public class App {
 

    public static void main(String[] args) {
          Estoque est = new Estoque();
          
         
           est.adicionarProduto("ovo", 20);
            est.adicionarProduto("arroz", 10);
             est.adicionarProduto("feijao", 5);
              est.adicionarProduto("uva passa", 1);
              est.adicionarProduto("feijao", 5);
              
              est.consultarQuantidade("arroz");
               //est.removerProduto("uva passa", 1);
       est.produtoMaisEstocado();
       
    //   est.limparEstoque();
    }
}
