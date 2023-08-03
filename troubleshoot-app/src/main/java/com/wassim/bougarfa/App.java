package com.wassim.bougarfa;

import java.util.Scanner;

/**
 * Main entry point of the diagnostic application.
 */
public class App {

    public static void main(String[] args) {
        DiagnosticNode tree = DiagnosticTreeFactory.create();
        Scanner scanner = new Scanner(System.in);
        String solution = diagnose(scanner::nextLine, tree);
        System.out.println(solution);
        scanner.close();
    }

    /**
     * The diagnose method recursively navigates through the diagnostic tree
     * based on the user's input to determine the solution.
     *
     * @param inputSource The source from where to get the user's input.
     * @param node        The current node in the diagnostic tree.
     * @return The diagnostic solution based on the user's input.
     */
    public static String diagnose(InputSource inputSource, DiagnosticNode node) {
        if (node == null) {
            return "Cannot determine correct diagnostic procedure.";
        }

        if (node instanceof DiagnosticSolution) {
            return ((DiagnosticSolution) node).getSolution();
        }

        System.out.println(node.getQuestion() + "?");
        String answer = inputSource.nextLine();
        if (answer.equals("yes") || answer.equals("y")) {
            return diagnose(inputSource, node.getYesBranch());
        } else {
            return diagnose(inputSource, node.getNoBranch());
        }
    }

    /**
     * The InputSource interface defines a source of user input.
     */
    public interface InputSource {

        /**
         * The nextLine method should return the next input line.
         *
         * @return The next input line.
         */
        String nextLine();
    }
}
