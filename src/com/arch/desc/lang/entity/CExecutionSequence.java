package com.arch.desc.lang.entity;

import java.util.List;

public class CExecutionSequence {

    public CExecutionSequence(String name, List<IExecutionStatement> statements) {
        mName = name;
        mStatements = statements;
    }

    public String getName() {
        return mName;
    }

    private String mName;
    private List<IExecutionStatement> mStatements;
}
