package com.wassim.bougarfa;

public class DiagnosticSolution extends DiagnosticNode {
    private String solution;

    public DiagnosticSolution(String solution) {
        this.solution = solution;
    }

    public String getSolution() {
        return solution;
    }

    @Override
    public String getQuestion() {
        return null;
    }

    @Override
    public DiagnosticNode getYesBranch() {
        return null;
    }

    @Override
    public DiagnosticNode getNoBranch() {
        return null;
    }
}