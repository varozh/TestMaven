package Tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        File f = new File(stand.pathInput.toUri());
        FileReader fileReader = new FileReader(f);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        while (line != null) {
            list.add(line);
            line = reader.readLine();
        }
        for (String st: list) {
            StringTokenizer separation = new StringTokenizer(st, " ");
            while (separation.hasMoreElements())
                score.add(Integer.valueOf(separation.nextToken()));
        }

        for (int i = 0; i < score.size(); i++) {
            if (i%2 == 0)
                teamOne += score.get(i);
            else
                teamTwo += score.get(i);
        }
        winner = (teamOne > teamTwo) ? "1" :
                (teamTwo > teamOne) ? "2" : "DRAW";

        stand.appEndToFile(winner);
        stand.printOutput();
    }
}
