package com.arch.desc.lang.entity;

import java.util.HashMap;

public class CExecutionContext {

    public void addVariable(CVariable variable) {
        mVariables.put(variable.getName(), variable);
    }

    public CVariable getVariable(String name) {
        return mVariables.get(name);
    }

    private HashMap<String, CVariable> mVariables = new HashMap<>();

}
