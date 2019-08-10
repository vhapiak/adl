package com.arch.desc.lang.entity;

import java.util.ArrayList;
import java.util.List;

public class CMethodCall implements IExecutionStatement {
    public CMethodCall(
            CVariable variable,
            CMethod method,
            ArrayList<CVariable> arguments,
            CExecutionSequence executionSequence) {
        mVariable = variable;
        mMethod = method;
        mArguments = arguments;
        mExecutionSequence = executionSequence;
    }

    public CVariable getVariable() {
        return mVariable;
    }

    public CMethod getMethod() {
        return mMethod;
    }

    public List<CVariable> getArguments() {
        return mArguments;
    }

    public CExecutionSequence getExecutionSequence() {
        return mExecutionSequence;
    }

    private CVariable mVariable;
    private CMethod mMethod;
    private List<CVariable> mArguments;
    private CExecutionSequence mExecutionSequence;
}
