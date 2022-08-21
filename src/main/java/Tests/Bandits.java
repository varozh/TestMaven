package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bandits {
    private ArrayList<Integer> list = new ArrayList<>();
    private StandartTasks stand = new StandartTasks();
    private int one, two;
    public Bandits () throws IOException {
        String line = Files.readString(Path.of(stand.pathInput.toUri()));
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreElements())
            list.add(Integer.valueOf(separation.nextToken()));
        one = 10 - list.get(0);
        two = 10 - list.get(1);

        stand.appEndToFile(String.valueOf(one) + " " + String.valueOf(two));
        stand.printOutput();
    }
}
