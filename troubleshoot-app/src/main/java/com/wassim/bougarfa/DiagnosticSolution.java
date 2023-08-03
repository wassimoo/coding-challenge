package com.wassim.bougarfa;

public class DiagnosticSolution implements DiagnosticNode {
    private String solution;

    public DiagnosticSolution(String solution) {
        this.solution = solution;
    }

    public String getSolution() {
        return solution;
    }

    @Override
    public String toString() {
        return solution;
    }
}