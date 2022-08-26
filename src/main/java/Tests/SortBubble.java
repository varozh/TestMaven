package Tests;

public class SortBubble {
    private StandartTasks stand = new StandartTasks();
    private int[] mas;
    public SortBubble() {
        mas = new int[stand.sizeArray()];
        mas = stand.randomArray(mas.length);
        stand.printArray(mas);
        sort();
        stand.printArray(mas);
    }

    private void sort() {
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    int min = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = min;
                    isSort = false;
                }
            }
        }
    }
}