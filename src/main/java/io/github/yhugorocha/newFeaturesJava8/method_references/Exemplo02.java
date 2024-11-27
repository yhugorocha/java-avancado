package io.github.yhugorocha.newFeaturesJava8.method_references;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {

        List<Produto> listaP = new ArrayList<>();

        listaP.add(new Produto("Tv", 1151.00));
        listaP.add(new Produto("Tablet", 454.56));
        listaP.add(new Produto("Monitor", 154.65));
        listaP.add(new Produto("Mouse", 896.23));

        //Lambda expression
        listaP.forEach(p -> System.out.println("Nome: " + p.getNome() + ", Preço: " + p.getPreco()));

        //Method references
        listaP.forEach(Impressora::imprime);

        listaP.forEach(Produto::imprime);
    }
}

class Impressora{
    public static void imprime(Produto p){
        System.out.println("Nome: " + p.getNome() + ", Preço: " + p.getPreco());
    }
}

class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public void imprime() {
        System.out.println("Produto - Nome: " + this.nome + ", Preço: " + this.preco);
    }
}
