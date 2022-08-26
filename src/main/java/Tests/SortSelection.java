package Tests;

public class SortSelection {
    private int[] mas;
    private StandartTasks stand = new StandartTasks();

    public SortSelection() {
        mas = new int[stand.sizeArray()];
        mas = stand.randomArray(mas.length);
        stand.printArray(mas);
        sort();
        stand.printArray(mas);
    }
    private void sort() {
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int minIndex = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    minIndex = j;
                }
            }
            toSwap(i, minIndex);
        }
    }

    private void toSwap(int i, int j) {
        int swap = mas[i];
        mas[i] = mas[j];
        mas[j] = swap;
    }
}
