public class MinHeap {
    private int size;
    private int[] items;

    public MinHeap() {
        size = 0;
        items = new int[100];
    }

    public MinHeap(int first) {
        size = 1;
        items = new int[100];
        items[0] = first;
    }

    public int size() {
        return size;
    }

    public void add(int item) {
        items[size] = item;
        swap(size, findParent(size));
        size ++;
    }

    private void swap(int indexChild, int indexParent) {
        if(items[indexChild] <= items[findParent(indexParent)]) {
            return;
        }
        if(items[indexChild] > items[findParent(indexParent)]) {
            int temp = items[indexChild];
            items[indexChild] = items[indexParent];
            items[indexParent] = temp;
            swap(indexParent, findParent(indexParent));
        }
    }

    private int findParent(int i) {
        return i / 2;
    }

    private int findLeft(int i) {
        return i * 2;
    }

    private int findRight(int i) {
        return i * 2 + 1;
    }

}