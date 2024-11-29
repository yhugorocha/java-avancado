package io.github.yhugorocha.newFeaturesJava8.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Exemplo01 {
    public static void main(String[] args) {

        String texto = "A classe base64 no java 8";
        String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes(StandardCharsets.UTF_8));
        String textoDecodificado = new String(Base64.getDecoder().decode(textoCodificado), StandardCharsets.UTF_8);

        System.out.println(texto);
        System.out.println(textoCodificado);
        System.out.println(textoDecodificado);
    }
}
