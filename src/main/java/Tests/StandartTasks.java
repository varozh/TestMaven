package Tests;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class StandartTasks {
    public Scanner num = new Scanner(System.in);
    public Path pathInput = Path.of("src/main/resources/input.txt");
    public Path pathOutput = Path.of("src/main/resources/output.txt");
    private int fromArray = 0;
    private int toArray = 1;
    private File fileOutput = new File(pathOutput.toUri());

    public int sizeArray() {
        int x;
        System.out.print("Enter size of the array: ");
        x = num.nextInt();
        return x;
    }

    public int[] randomArray(int sizeArray) {
        int[] mas = new int[sizeArray];
        for (int i = 0; i < mas.length; i++)
            mas[i] = (int) (Math.random() * ((toArray - fromArray) + 1) + fromArray);
        return mas;
    }

    public void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    public void appEndToFile (String content) throws IOException {
        Files.writeString(pathOutput, content + System.lineSeparator(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }

    public void printOutput () throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathOutput.toFile()));
        String line = reader.readLine();
        while (line != null) {
            System.out.print(line + " ");
            line = reader.readLine();
        }
        reader.close();
    }

    public void endProgramm() {
        System.out.println("End");
    }
}
