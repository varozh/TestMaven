package Tests;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class OutputFile {
    private ArrayList<Integer> values = new ArrayList<>();
    private int sum = 0;
    private StandartTasks stand = new StandartTasks();
    public OutputFile () throws IOException {
        String str = Files.readString(stand.pathInput);
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreElements()) {
            int a = Integer.valueOf(st.nextToken());
            values.add(a);
        }

        for (Integer x: values)
            sum += x;

        stand.appEndToFile(String.valueOf(sum));
        stand.printOutput();
    }
}
