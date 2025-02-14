package io.github.yhugorocha.new_features_java_8.method_references;

public class Exemplo03 {
    public static void main(String[] args) {

        Figura2D fig = RetanguloExemplo3::new;
        fig.desenha(8.0, 7.2);
    }
}

interface Figura2DExemplo3 {
    Retangulo desenha(Double largura, Double altura);
}

class RetanguloExemplo3 {
    public RetanguloExemplo3(Double largura, Double altura) {
        System.out.println("Desenha retângulo: " + largura + " e altura: " + altura);
    }
}