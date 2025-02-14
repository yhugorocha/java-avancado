package io.github.yhugorocha.new_features_java_9.http2;

import java.net.http.HttpClient;

public class Exemplo01 {

    public static void main(String[] args) {

        //antes o Java utilizava o HTTP 1.1, agora utiliza o http2
        try(HttpClient client = HttpClient.newHttpClient()){
            System.out.println(client.version());
        }
    }
}
