package io.github.yhugorocha.newFeaturesJava8.optional;

import java.util.Optional;

public class Exemplo01 {
    public static void main(String[] args) {

        String nome = null;
        String nome1 = "nome";

        //Classe utilizada para lidar com exceções do tipo NullPointerException em aplicações Java.

        System.out.println(Optional.ofNullable(nome).orElse("Sem nome"));
        Optional.ofNullable(nome1).ifPresent(System.out::println);
        System.out.println(Optional.ofNullable(nome1).isPresent()); //true
        System.out.println(Optional.ofNullable(nome).isPresent());  //false
        //Optional.ofNullable(nome).orElseThrow(()-> new RuntimeException("Sem informação"));
    }
}
