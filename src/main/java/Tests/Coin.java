package Tests;

import java.io.*;

public class Coin {
    private StandartTasks stand = new StandartTasks();
    private int[] mas;
    private int countOne = 0, countZiro = 0, sizeMas;
    public Coin() throws IOException {
        File f = new File(stand.pathInput.toUri());
        FileReader fileReader = new FileReader(f);
        BufferedReader reader = new BufferedReader(fileReader);
        sizeMas = Integer.parseInt(String.valueOf(reader.readLine()));
        mas = stand.randomArray(sizeMas);
        stand.printArray(mas);
        for (int i = 0; i < sizeMas; i++) {
            if (mas[i] > 0)
                countOne++;
            else
                countZiro++;
        }
        result();
    }

    private void result() {
        if (countOne >= countZiro)
            System.out.println(sizeMas - countOne);
        else
            System.out.println(sizeMas - countZiro);
    }
}
