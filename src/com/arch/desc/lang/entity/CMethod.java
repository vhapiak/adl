package com.arch.desc.lang.entity;

import java.util.List;

public class CMethod {

    public CMethod(String name, CType returnType, List<CArgument> arguments) {
        mName = name;
        mReturnType = returnType;
        mArguments = arguments;
    }

    public String getName() {
        return mName;
    }

    private String mName;
    private CType mReturnType;
    private List<CArgument> mArguments;

}
