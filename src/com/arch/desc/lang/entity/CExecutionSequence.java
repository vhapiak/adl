package com.arch.desc.lang.entity;

import java.util.List;

public class CExecutionSequence extends WithName {

    public CExecutionSequence(String name, List<IExecutionStatement> statements) {
        super(name);
        mStatements = statements;
    }

    private List<IExecutionStatement> mStatements;
}
