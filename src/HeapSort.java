
public class HeapSort {
    public static void main(String[] args) {
        int[] array = {7, 1, 23, 134, -2, 10456, 0, 6, 45, 15, 2, 10, 7, -3};
        HeapSort res = new HeapSort();
        res.sort(array);
        printArray(array);
    }

    public void sort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heap(array, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heap(array, i, 0);
        }
    }

    void heap(int[] array, int n, int i) {
        int root = i;
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2


        if (l < n && array[l] > array[root])
            root = l;

        if (r < n && array[r] > array[root])
            root = r;

        if (root != i) {
            int swap = array[i];
            array[i] = array[root];
            array[root] = swap;
            heap(array, n, root);
        }
    }

    static void printArray(int[] array) {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
}