package io.github.yhugorocha.new_features_java_8.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Exemplo01 {
    public static void main(String[] args) {

        //Instância da classe produto;
        Produto p = new Produto("Geladeira", 3.000);

        //Instância da classe Class;
        Class cl = p.getClass();

        Method[] method =  cl.getDeclaredMethods();

        for (Method m:method){
            System.out.println(m.getName());

            Parameter[] parameters =  m.getParameters();
            for (Parameter pr: parameters){
                System.out.println(pr);
            }
        }
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

