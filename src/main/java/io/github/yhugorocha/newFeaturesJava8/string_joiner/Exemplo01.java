package io.github.yhugorocha.newFeaturesJava8.string_joiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Exemplo01 {
    public static void main(String[] args) {

        //StringTokenizer
        String nomes = "Hugo, Igor, Francisca, Joao";

        StringTokenizer st = new StringTokenizer(nomes, ",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());
        }

        //StringJoiner
        StringJoiner sj = new StringJoiner(", ");

        sj.add("Hugo");
        sj.add("Igor");
        sj.add("Francisca");
        sj.add("Joao");

        System.out.println(sj);
    }
}
