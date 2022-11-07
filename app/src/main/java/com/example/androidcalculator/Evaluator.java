package com.example.androidcalculator;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluator {
    ScriptEngine engine;

    public Evaluator() {
        this.engine = new ScriptEngineManager().getEngineByName("rhino");
    }
    public Evaluator(String name) {
        this.engine = new ScriptEngineManager().getEngineByName(name);
    }

    public BigDecimal evaluate(String expression) throws ScriptException {
        String result = engine.eval(expression).toString();
        return new BigDecimal(result);


    }
}
