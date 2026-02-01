package org.ies.tierno.readers.random;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();
        var textFileReader = new RandomTextReader(random);
        var programTextFile = new RandomProgramTextFileReader(random, textFileReader);
        var program = programTextFile.read();
        System.out.println("Dime una ruta: ");
        String outputPath = scanner.nextLine();
        program.execute(outputPath);
    }
}