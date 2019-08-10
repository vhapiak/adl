package com.arch.desc.lang.compiler;

public class CCompilerError extends Exception {

    public CCompilerError(String msg, int line) {
        super(msg + " at line " + line);
    }

}
