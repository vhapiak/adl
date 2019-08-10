package com.arch.desc.lang.entity;

public class CArgument {

    public CArgument(String name, CType type) {
        mName = name;
        mType = type;
    }

    public String getName() {
        return mName;
    }

    private String mName;
    private CType mType;

}
