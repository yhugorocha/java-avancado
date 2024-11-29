package io.github.yhugorocha.newFeaturesJava8.stream;

import java.util.ArrayList;
import java.util.List;

public class Exemplo01 {

    public static void main(String[] args) {

        List<Produto> listaP = new ArrayList<>();

        listaP.add(new Produto("Tv", 1151.00));
        listaP.add(new Produto("Tablet", 454.56));
        listaP.add(new Produto("Geladeira 456L", 1454.56));
        listaP.add(new Produto("Monitor", 154.65));
        listaP.add(new Produto("Geladeira 500L", 2454.56));
        listaP.add(new Produto("Geladeira 556L", 3454.56));
        listaP.add(new Produto("Mouse", 896.23));

        //stream
        listaP.stream()
                .filter(p -> p.getNome().contains("Geladeira"))
                .sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
                .map(p -> p.getNome())
                .forEach(System.out::println);

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
        System.out.println("Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}');
    }
}
