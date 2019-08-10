package com.arch.desc.lang.entity;

import java.util.HashMap;
import java.util.List;

public class CType {

    public CType(String name) {
        mName = name;
    }

    public  CType(String name, List<CMethod> methods) {
        this(name);

        for (CMethod method : methods) {
            mMethods.put(method.getName(), method);
        }
    }

    public String getName() {
        return mName;
    }

    private String mName;
    private HashMap<String, CMethod> mMethods = new HashMap<>();

}
