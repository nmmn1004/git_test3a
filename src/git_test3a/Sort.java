package git_test3a;

public class Sort {

    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int[] a, int start, int end) {
        // TODO: partition 알고리즘을 구현해야 함
    }

    static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;
        int middle = partition(a, start, end);
        quickSort(a, start, middle-1);
        quickSort(a, middle+1, end);
    }

}
