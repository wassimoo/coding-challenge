package com.wassim.bougarfa;

public class DiagnosticTreeFactory {

    public static DiagnosticNode create() {
        DiagnosticNode engineStartThenDieDiagnostic = new DiagnosticQuestion(
                "Does your car have fuel injection")
                .yes(new DiagnosticSolution("Get it in for service"))
                .no(new DiagnosticSolution(
                        "Check to ensure the choke is opening and closing"));

        DiagnosticNode noCrankUpDiagnostic = new DiagnosticQuestion("Does the engine start and then die")
                .yes(engineStartThenDieDiagnostic);

        DiagnosticNode noClickingNoiseDiagnostic = new DiagnosticQuestion(
                "Does the car crank up but fail to start")
                .yes(new DiagnosticSolution("Check spark plug connections"))
                .no(noCrankUpDiagnostic);

        DiagnosticNode silentCarOnKeyStartDiagnostic = new DiagnosticQuestion(
                "Are the battery terminals corroded")
                .yes(new DiagnosticSolution("Clean terminals and try starting again."))
                .no(new DiagnosticSolution("Replace cables and try again."));

        DiagnosticNode nonSilentCarOnKeyStartDiagnostic = new DiagnosticQuestion(
                "Does the car make a clicking noise")
                .yes(new DiagnosticSolution("Replace the battery."))
                .no(noClickingNoiseDiagnostic);

        return new DiagnosticQuestion("Is the car silent when you turn the key")
                .yes(silentCarOnKeyStartDiagnostic)
                .no(nonSilentCarOnKeyStartDiagnostic);
    }
    }
