package com.arch.desc.lang.entity;

import java.util.HashMap;
import java.util.List;

public class CType extends WithName {

    public CType(String name) {
        super(name);
    }

    public  CType(String name, List<CMethod> methods) {
        this(name);

        for (CMethod method : methods) {
            mMethods.put(method.getName(), method);
        }
    }

    public CMethod getMethod(String name) {
        return mMethods.get(name);
    }

    private HashMap<String, CMethod> mMethods = new HashMap<>();

}
