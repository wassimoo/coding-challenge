package com.wassim.bougarfa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AppTest {

    
    /*
    Test Case       | Input (answers to the questions)          |   Expected output
    ----------------| -----------------------------------       |   -------------------------------
    Test case 1     | yes, yes                                  |   Clean terminals and try starting again.
    Test case 2     | yes, no                                   |   Replace cables and try again.
    Test case 3     | no, yes                                   |   Replace the battery.
    Test case 4     | no, no, yes                               |   Check spark plug connections.
    Test case 5     | no, no, no, yes, yes                      |   Get it in for service.
    Test case 6     | no, no, no, yes, no                       |   Check to ensure the choke is opening and closing.
    Test case 7     | no, no, no, no                            |   null.
    */

    @Test
    public void testDiagnose() {
        DiagnosticNode tree = DiagnosticTreeFactory.create();

        // Test case 1
        App.InputSource mockInputSource1 = createMockInputSource("yes", "yes");
        DiagnosticSolution result1 = App.diagnose(mockInputSource1, tree);
        assertEquals("Clean terminals and try starting again.", result1.getSolution());

        // Test case 2
        App.InputSource mockInputSource2 = createMockInputSource("yes", "no");
        DiagnosticSolution result2 = App.diagnose(mockInputSource2, tree);
        assertEquals("Replace cables and try again.", result2.getSolution());

        // Test case 3
        App.InputSource mockInputSource3 = createMockInputSource("no", "yes");
        DiagnosticSolution result3 = App.diagnose(mockInputSource3, tree);
        assertEquals("Replace the battery.", result3.getSolution());

        // Test case 4
        App.InputSource mockInputSource4 = createMockInputSource("no", "no", "yes");
        DiagnosticSolution result4 = App.diagnose(mockInputSource4, tree);
        assertEquals("Check spark plug connections", result4.getSolution());

        // Test case 5
        App.InputSource mockInputSource5 = createMockInputSource("no", "no", "no", "yes", "yes");
        DiagnosticSolution result5 = App.diagnose(mockInputSource5, tree);
        assertEquals("Get it in for service", result5.getSolution());

        // Test case 6
        App.InputSource mockInputSource6 = createMockInputSource("no", "no", "no", "yes", "no");
        DiagnosticSolution result6 = App.diagnose(mockInputSource6, tree);
        assertEquals("Check to ensure the choke is opening and closing", result6.getSolution());

        // Test case 7
        App.InputSource mockInputSource7 = createMockInputSource("no", "no", "no", "no");
        DiagnosticSolution result7 = App.diagnose(mockInputSource7, tree);
        assertNull(result7);
    }

    // Helper function to create a mock InputSource
    private App.InputSource createMockInputSource(String... inputs) {
        return new App.InputSource() {
            int counter = 0;

            @Override
            public String nextLine() {
                return inputs[counter++];
            }
        };
    }

}
