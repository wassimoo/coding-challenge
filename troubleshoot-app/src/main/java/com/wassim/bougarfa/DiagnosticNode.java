package com.wassim.bougarfa;

public abstract class DiagnosticNode {
    public abstract String getQuestion();

    public abstract DiagnosticNode getYesBranch();

    public abstract DiagnosticNode getNoBranch();
}

