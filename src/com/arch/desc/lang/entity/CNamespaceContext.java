package com.arch.desc.lang.entity;

import java.util.HashMap;

public class CNamespaceContext extends WithName {

    public CNamespaceContext(String name) {
        super(name);
    }

    public CType getType(String name) {
        return mTypes.get(name);
    }

    public CExecutionSequence getExecutionSequence(String name) {
        return mExecutionSequences.get(name);
    }

    public void addType(CType type) {
        mTypes.put(type.getName(), type);
    }

    public void addExecutionSequence(CExecutionSequence sequence) {
        mExecutionSequences.put(sequence.getName(), sequence);
    }

    private HashMap<String, CType> mTypes = new HashMap<>();
    private HashMap<String, CExecutionSequence> mExecutionSequences = new HashMap<>();

}
