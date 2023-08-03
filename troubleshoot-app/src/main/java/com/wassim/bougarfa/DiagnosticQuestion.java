package com.wassim.bougarfa;

public class DiagnosticQuestion extends DiagnosticNode {
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

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public DiagnosticNode getYesBranch() {
        return yesBranch;
    }

    @Override
    public DiagnosticNode getNoBranch() {
        return noBranch;
    }
}
