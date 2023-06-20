// ----------------------------------------------- HEAP SORT - sort()
public class HeapSort {

    public static void sort(int[] elements) {
        BinaryHeap<Integer> heap = new BinaryHeap<>();

        for (int i = 0; i < elements.length; i++) {
            heap.insert(elements[i]);
        }

        for (int i = elements.length - 1; i >= 0; i--) {
            elements[i] = heap.delMax();
        }
    }
}