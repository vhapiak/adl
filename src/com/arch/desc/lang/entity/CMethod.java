package com.arch.desc.lang.entity;

import java.util.List;

public class CMethod extends WithName {

    public CMethod(String name, CType returnType, List<CArgument> arguments) {
        super(name);
        mReturnType = returnType;
        mArguments = arguments;
    }

    private CType mReturnType;
    private List<CArgument> mArguments;

}
