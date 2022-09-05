package Tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BinaryNumbers {
    private StandartTasks stand = new StandartTasks();
    private String conclusion = "yes";

    public BinaryNumbers() throws IOException {
        File file = new File(stand.pathInput.toUri());
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        int number = Integer.parseInt(String.valueOf(reader.readLine()));
        if (number <= 0)
            conclusion = "no";
        while (number > 1) {
            if (number % 2 == 0)
                number /= 2;
            else {
                conclusion = "no";
                break;
            }
        }
        stand.appEndToFile(conclusion);
        stand.printOutput();

    }
}
