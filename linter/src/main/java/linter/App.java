/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static String linter(String PATH) throws FileNotFoundException {
        File file = new File(PATH);
        Scanner in = new Scanner(file);
        String line;
        int lineNumber = 1;
        String errorMessage = "";

        while (in.hasNextLine()) {
            line = in.nextLine();
            if (line.length() == 0) {
                //do nothing

            } else {
                if (line.charAt(line.length() - 1) == '{' ||
                        line.charAt(line.length() - 1) == '}' ||
                        line.contains("if") || line.contains("else")) {
                    //do nothing
                } else if (!(line.charAt(line.length() - 1) == ';')) {
                    errorMessage += "Line " + lineNumber + ": Missing semicolon.\n";
//                    return errorMessage;

                }
            }
            lineNumber++;
        }

        if (errorMessage.isEmpty()) {
            errorMessage = "No errors found";
        }
        return errorMessage;
    }

}
