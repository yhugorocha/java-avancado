package io.github.yhugorocha.new_features_java_8.lambda_expressions;

public class ExemploThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 em execução");
            }
        });

        t1.start();

        //lambda expression
        Thread t2 = new Thread(() -> System.out.println("Thread 2 em execução"));
        t2.start();
    }
}
