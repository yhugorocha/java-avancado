package io.github.yhugorocha.new_features_java_9.private_methods_interface;

public interface LogEventI {

    default void logInfo(String message){
        log(message, "INFO");
    }

    default void logWarn(String message){
        log(message, "WARN");
    }

    default void logError(String message){
        log(message, "ERROR");
    }

    default void logFatal(String message){
        log(message, "FATAL");
    }

    //New feature Java9
    private void log (String message, String tipo){
        System.out.println(tipo.concat(" : ").concat(message));
    }
}
