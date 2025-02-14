package io.github.yhugorocha.new_features_java_9.inference_of_anonymous_class_types;

public class Examplo01 {

    public static void main(String[] args) {

        //Classe interna anônima, antês no java 8 eramos obrigados a definir no new SomaTudo<String>, no java 9 ele já
        //pega a referência do SomaTudo<Integer>;

        SomaTudo<Integer> soma = new SomaTudo<>() {

            @Override
            public Integer soma(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println(soma.soma(1, 5));
    }
}
