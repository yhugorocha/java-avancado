package io.github.yhugorocha.new_features_java_9.factory_method_collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exemplo01 {

    public static void main(String[] args) {

        //Adicionado o metodo .of() - imutavel
        List<String> names = List.of("Hugo", "igor", "Alessandro");
        Map<String, String> keys = Map.of("key1", "valor1", "key2", "valor2");
        Set<String> set = Set.of("Hugo", "igor", "Alessandro");

        for(String n: names){
            System.out.println(n);
        }

    }
}
