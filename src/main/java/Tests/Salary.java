package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Salary {
    private ArrayList<Integer> list = new ArrayList<>();
    private int min, max, difference;
    private StandartTasks stand = new StandartTasks();
    public Salary () throws IOException {
        String line = Files.readString(Path.of(stand.pathInput.toUri()));
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreElements())
            list.add(Integer.valueOf(separation.nextToken()));
        min = Integer.valueOf(list.get(0));
        max = Integer.valueOf(list.get(0));
        for (Integer value: list) {
            if (min > value)
                min = value;
            if (max < value)
                max = value;
        }
        difference = max - min;

        stand.appEndToFile(String.valueOf(difference));
        stand.printOutput();
    }
}
