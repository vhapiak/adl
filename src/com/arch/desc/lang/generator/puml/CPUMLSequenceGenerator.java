package com.arch.desc.lang.generator.puml;

import com.arch.desc.lang.entity.*;

import java.util.List;

public class CPUMLSequenceGenerator {

    public CPUMLSequenceGenerator(CNamespaceContext namespace) {
        mPUML.append("actor Client\n");
        generateSequence(namespace.getExecutionSequence(""), "Client");
    }

    public String getPUML() {
        return mPUML.toString();
    }

    private void generateSequence(CExecutionSequence sequence, String activeParticipant) {
        for (IExecutionStatement statement : sequence.getStatements()) {
            // rewrite with visitor
            if (statement instanceof CVariableDefinition) {
                CVariableDefinition definition = (CVariableDefinition) statement;
                generateVariableDefinition(definition, activeParticipant);
            } else if (statement instanceof CMethodCall) {
                CMethodCall methodCall = (CMethodCall) statement;
                generateMethodCall(methodCall, activeParticipant, "");
            }
        }
    }

    private void generateVariableDefinition(CVariableDefinition definition, String activeParticipant) {
        CVariable variable = definition.getVariable();
        mPUML.append(String.format(
                "participant \"%s\\n:%s\" as %s\n",
                variable.getName(),
                variable.getType().getName(),
                variable.getName()
        ));

        CMethodCall methodCall = definition.getMethodCall();
        if (methodCall == null) {
            mPUML.append(String.format(
                    "create %s\n",
                    variable.getName()
            ));
            mPUML.append(String.format(
                    "%s -> %s : new()\n",
                    activeParticipant,
                    variable.getName()
            ));
        } else {
            generateMethodCall(methodCall, activeParticipant, variable.getName());
        }
    }

    private void generateMethodCall(CMethodCall methodCall, String activeParticipant, String returnValue) {
        CVariable variable = methodCall.getVariable();
        CMethod method = methodCall.getMethod();
        List<CVariable> args = methodCall.getArguments();
        CExecutionSequence subsequence = methodCall.getExecutionSequence();

        mPUML.append(String.format(
                "%s -> %s : %s(",
                activeParticipant,
                variable.getName(),
                method.getName()
        ));

        boolean firstArg = true;
        for (CVariable arg : args) {
            if (!firstArg) {
                mPUML.append(',');
            }
            firstArg = false;
            mPUML.append(arg.getName());
        }
        mPUML.append(")\n");

        mPUML.append(String.format("activate %s\n", variable.getName()));

        if (subsequence != null) {
            generateSequence(subsequence, variable.getName());
        }

        mPUML.append(String.format(
                "%s <-- %s : %s\n",
                activeParticipant,
                variable.getName(),
                returnValue
        ));
        mPUML.append(String.format("deactivate %s\n", variable.getName()));
    }

    StringBuilder mPUML = new StringBuilder();

}
