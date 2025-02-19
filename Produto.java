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
public class Produto {

    private String nome;
     private int qtd;
 public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.qtd = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getQuantidade(){
        return qtd;
    }

    public int addQtd( int adicao) {
        return qtd += adicao;
    }

    public int remQtd(int subtracao) {
        return qtd -= subtracao;
    }

}