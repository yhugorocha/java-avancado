package io.github.yhugorocha.newFeaturesJava8.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {

        List<Produto> listaP = new ArrayList<>();

        listaP.add(new Produto("Tv", 1151.00));
        listaP.add(new Produto("Tablet", 454.56));
        listaP.add(new Produto("Monitor", 154.65));
        listaP.add(new Produto("Mouse", 896.23));

        //lambda expression
        listaP.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        listaP.forEach(p -> System.out.println(p.toString()));

        listaP.forEach(p -> {
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        });
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

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
