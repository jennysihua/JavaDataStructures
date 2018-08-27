package src.Heap;

import java.util.Comparator;

public class Heap {
    private int size;
    private int[] heap;
    private Comparator<Integer> comparator;

    public Heap(Comparator<Integer> comp) {
        size = 0;
        heap = new int[100];
        comparator = comp;
    }

    public Heap(int first, Comparator<Integer> comp) {
        size = 1;
        heap = new int[100];
        heap[0] = first;
        comparator = comp;
    }

    public int size() {
        return size;
    }

    public void add(int item) {
        heap[size] = item;
        swap(size, findParent(size));
        size ++;
    }

    private void swap(int indexChild, int indexParent) {
        //swap up
        if(comparator.compare(heap[indexChild], heap[indexParent]) >= 0) {
            return;
        }
        int temp = heap[indexChild];
        heap[indexChild] = heap[indexParent];
        heap[indexParent] = temp;
        swap(indexParent, findParent(indexParent));
    }

    private void swap(int indexParent) {
        //swap down
        if(size < 2) return;
        if(getLeft(indexParent) == size - 1 || getRight(indexParent) == size - 1) return;
        if((comparator.compare(heap[getLeft(indexParent)], heap[indexParent]) >= 0) && comparator.compare(heap[getRight(indexParent)], heap[indexParent]) >= 0) {
            return;
        }
        int swapIndex;
        if(getRight(indexParent) >= size) {
            swapIndex = getLeft(indexParent);
        } else if (comparator.compare(heap[getRight(indexParent)], heap[getLeft(indexParent)]) >= 0) {
            swapIndex = getLeft(indexParent);
        } else {
            swapIndex = getRight(indexParent);
        }
        int temp = heap[swapIndex];
        heap[swapIndex] = heap[indexParent];
        heap[indexParent] = temp;
        swap(swapIndex);
    }

    public int remove() {
        int removed = heap[0];
        heap[0] = heap[size() - 1];
        heap[size() - 1] = 0;
        swap(0);
        size--;
        return removed;
    }

    public int get() {
        return heap[0];
    }

    private int findParent(int i) {
        return i / 2;
    }

    private int getLeft(int i) {
        return i * 2;
    }

    private int getRight(int i) {
        return i * 2 + 1;
    }

}