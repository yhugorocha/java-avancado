package io.github.yhugorocha.newFeaturesJava8.parallel_array_sorting;

import java.util.Arrays;

public class Exemplo01 {
    public static void main(String[] args) {

        int [] meu_array = {5, 78, 47, 12, -5, 24, 39};

        for (int n:meu_array){
            System.out.print(n + " ");
        }

        System.out.println();

        //Arrays.parallelSort(meu_array);
        Arrays.parallelSort(meu_array, 0 , 3);

        for (int n:meu_array){
            System.out.print(n + " ");
        }


    }
}
