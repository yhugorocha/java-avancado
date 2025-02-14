package io.github.yhugorocha.new_features_java_8.lambda_expressions;

public class Exemplo01 {
    public static void main(String[] args) {

        Figura fig1 = new Figura() {

            @Override
            public void desenha() {
                System.out.println("Desenha figura 1");
            }
        };

        fig1.desenha();

        //lambda expression
        Figura fig2 = () -> System.out.println("Desenha figura 2");
        fig2.desenha();
    }
}

interface Figura{
    void desenha();
}
