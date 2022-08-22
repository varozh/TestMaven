package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Basketball {
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<Integer> score = new ArrayList<>();
    private StandartTasks stand = new StandartTasks();
    private String winner;
    private int teamOne = 0, teamTwo = 0;
    public Basketball() throws IOException {
        String line = Files.readString(Path.of(stand.pathInput.toUri()));
        StringTokenizer separation = new StringTokenizer(line, " ");
        while (separation.hasMoreTokens())
            list.add(String.valueOf(separation.nextToken()));
        for (int i = 0; i < list.size(); i++) {
            list.get(i).trim();
            System.out.println("noSpace" + list.get(i) + "noSpace");
        }

        /*for (String st: list)
            System.out.println("noSpace" + st + "noSpace");
        for (String st: list) {
            StringTokenizer separationTwo = new StringTokenizer(st, " ");
            while (separationTwo.hasMoreElements()) {
                score.add(Integer.valueOf(separationTwo.nextToken()));
                System.out.print(String.valueOf(separationTwo.nextToken()));
            }
        }*/
    }
}
