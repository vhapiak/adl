package com.arch.desc.lang.entity;

public class CVariable extends WithName {

    public CVariable(String name, CType type) {
        super(name);
        mType = type;
    }

    public CType getType() {
        return mType;
    }

    private CType mType;
}
