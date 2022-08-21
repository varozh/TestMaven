package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Multiplication {
    private ArrayList<Integer> list = new ArrayList<>();
    private int result = 0;
    private StandartTasks stand = new StandartTasks();

    public Multiplication () throws IOException {
        String line = Files.readString(stand.pathInput);
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreElements())
            list.add(Integer.valueOf(separation.nextToken()));
        result = list.get(0) * list.get(1) * list.get(2) * 2;

        stand.appEndToFile(String.valueOf(result));
        stand.printOutput();
    }
}
