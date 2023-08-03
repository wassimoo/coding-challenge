package com.wassim.bougarfa;

public class DiagnosticQuestion implements DiagnosticNode {
    private String question;
    private DiagnosticNode yesBranch;
    private DiagnosticNode noBranch;

    public DiagnosticQuestion(String question) {
        this.question = question;
    }

    public DiagnosticQuestion yes(DiagnosticNode node) {
        this.yesBranch = node;
        return this;
    }

    public DiagnosticQuestion no(DiagnosticNode node) {
        this.noBranch = node;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public DiagnosticNode getYesBranch() {
        return yesBranch;
    }

    public DiagnosticNode getNoBranch() {
        return noBranch;
    }

    @Override
    public String toString() {
       return this.question + '?';
    }
}
