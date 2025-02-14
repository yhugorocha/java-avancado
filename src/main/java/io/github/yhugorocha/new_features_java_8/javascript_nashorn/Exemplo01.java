package io.github.yhugorocha.new_features_java_8.javascript_nashorn;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo01 {
    public static void main(String[] args) throws FileNotFoundException, ScriptException {

        //O mecanismo de script Nashorn, que foi descontinuado a partir do Java 15.

        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);

        ee.eval(new FileReader("olamundo.js"));
    }
}
