package Tests;

import java.text.DecimalFormat;

public class MinMaxAvg {
    private int sizeArray;
    private int[] mas;
    StandartTasks stand = new StandartTasks();

    public MinMaxAvg() {

        this.sizeArray = stand.sizeArray();
    }

    public MinMaxAvg(int sizeArray) {
        this.sizeArray = sizeArray;
    }

    public void run() {
        mas = new int[this.sizeArray];
        mas = stand.randomArray(this.sizeArray);
        stand.printArray(mas);
        findMinMaxAvg();
    }

    private void findMinMaxAvg () {
        int min = mas[0], max = mas[0];
        double avg = 0;
        for (int i = 0; i < mas.length; i++) {
            avg += mas[i];
            if (min > mas[i])
                min = mas[i];
            if (max < mas[i])
                max = mas[i];
        }
        avg /= mas.length;

        DecimalFormat d2 = new DecimalFormat("0.00");
        System.out.println("Min value in this array is - " + min + ", max value is - " + max + ", avg is - " + d2.format(avg));
    }
}
