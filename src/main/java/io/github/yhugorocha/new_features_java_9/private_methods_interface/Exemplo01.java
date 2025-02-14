package io.github.yhugorocha.new_features_java_9.private_methods_interface;

public class Exemplo01 {

    public static void main(String[] args) {

        LogEventI log = new LogEventI() {
        };

        log.logError("Conexão falhou!");
    }
}
