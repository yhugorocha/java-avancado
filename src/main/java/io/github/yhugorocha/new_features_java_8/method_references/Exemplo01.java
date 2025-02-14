package io.github.yhugorocha.new_features_java_8.method_references;

public class Exemplo01 {
    public static void main(String[] args) {

        //Lambda expression
        Figura2D fig = (l, a) -> System.out.println("Desenha figura : " + l + " e altura: " +  a);
        fig.desenha(8.0,1.5);

        //Method references
        Retangulo ret = new Retangulo();

        Figura2D fig2 = ret::desenhaRetangulo;
        fig2.desenha(9.0, 5.3);

    }
}

interface Figura2D{
    void desenha (Double largura, Double altura);
}

class Retangulo{
    public void desenhaRetangulo(Double largura, Double altura){
        System.out.println("Desenha retângulo: " + largura + " e altura: " + altura);
    }
}
