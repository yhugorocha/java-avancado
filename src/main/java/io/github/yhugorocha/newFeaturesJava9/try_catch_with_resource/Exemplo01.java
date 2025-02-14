package io.github.yhugorocha.newFeaturesJava9.try_catch_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {

        try{
            lerArquivoComBlocoTryCatchFinally("src/file.txt");
            lerArquivoComBlocoTryComRecursoJava7("src/file.txt");
            lerArquivoComBlocoTryComRecursoJava9("src/file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //antes do Java 7 - "Modo tradicional"
    public static void lerArquivoComBlocoTryCatchFinally(String path) throws IOException {
        String linha = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch (IOException e){
            throw e;
        }finally {
            if (br != null){
                br.close();
            }
        }
    }

    //A partir do Java 7
    public static void lerArquivoComBlocoTryComRecursoJava7(String path) throws IOException {
        String linha = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }
    }

    //A partir do Java 9
    public static void lerArquivoComBlocoTryComRecursoJava9(String path) throws IOException {
        String linha = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        try (br){
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }
    }
}
