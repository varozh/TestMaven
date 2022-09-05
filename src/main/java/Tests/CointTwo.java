package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CointTwo {
    private StandartTasks stand = new StandartTasks();
    private ArrayList<Integer> list = new ArrayList<>();
    private int countOne = 0, countZiro = 0;

    public CointTwo() throws IOException {
        String line = Files.readString(Path.of(stand.pathInput.toUri()));
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreElements())
            list.add(Integer.valueOf(separation.nextToken()));
        for (int i = 1 ; i < list.size(); i++) {
            if (list.get(i) > 0)
                countOne++;
            else
                countZiro++;
        }
        result();
    }

    private void result() {
        if (countOne >= countZiro)
            System.out.println(list.get(0) - countOne);
        else
            System.out.println(list.get(0) - countZiro);
    }
}
