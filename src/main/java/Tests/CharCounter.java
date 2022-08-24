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

    public CharCounter () throws IOException {
        String line = Files.readString(Path.of(stand.pathInput.toUri()));
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreElements())
            charList.add(String.valueOf(separation.nextToken()));
        System.out.println(charList);

        for (int i = 0; i < charList.size(); i++) {

        }
    }

}
