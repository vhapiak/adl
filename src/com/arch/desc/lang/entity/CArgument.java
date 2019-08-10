package com.arch.desc.lang.entity;

public class CArgument extends WithName {

    public CArgument(String name, CType type) {
        super(name);
        mType = type;
    }

    private CType mType;

}
