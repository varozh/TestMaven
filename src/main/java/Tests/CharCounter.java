package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CharCounter {
    private StandartTasks stand = new StandartTasks();
    private Map<String, Integer> list = new HashMap<>();
    private ArrayList<String> charList = new ArrayList<>();
    private double avg;

    public CharCounter () throws IOException {
        String line = Files.readString(Path.of(stand.pathInput.toUri()));
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreElements())
            charList.add(String.valueOf(separation.nextToken()));
        System.out.println(charList);

        for (String st: charList) {
            if (list.containsKey(st)) {
                int count = list.get(st);
                list.put(st, count + 1);
            }
            else
                list.put(st, 1);
        }
        System.out.println(list);

        avg = (double) charList.size()/ list.size();
        int min = (int) Math.floor(avg), max = (int) Math.ceil(avg);

        for (Map.Entry<String, Integer> i: list.entrySet()) {
            if (i.getValue() == min || i.getValue() == max || i.getValue() == avg)
                System.out.print(i + " ");
        }
    }

}
