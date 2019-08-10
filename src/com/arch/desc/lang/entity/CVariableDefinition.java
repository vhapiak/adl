package com.arch.desc.lang.entity;

public class CVariableDefinition implements IExecutionStatement {

    public CVariableDefinition(CVariable variable, CMethodCall methodCall) {
        mVariable = variable;
        mMethodCall = methodCall;
    }

    public CVariable getVariable() {
        return mVariable;
    }

    public CMethodCall getMethodCall() {
        return mMethodCall;
    }

    private CVariable mVariable;
    private CMethodCall mMethodCall;

}
