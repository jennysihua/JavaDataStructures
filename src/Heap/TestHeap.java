package src.Heap;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestHeap {
    @Test
    public void testMinInsert() {
        MinComparator minComparator = new MinComparator();
        Heap heap = new Heap(4, minComparator);
        heap.add(3);
        heap.add(2);
        heap.add(1);
        assertEquals(4, heap.size());
        assertEquals(1, heap.remove());
        assertEquals(3, heap.size());
        assertEquals(2, heap.remove());
        assertEquals(2, heap.size());
        assertEquals(3, heap.remove());
        assertEquals(1, heap.size());
        assertEquals(4, heap.remove());
    }

    @Test
    public void testMinGet() {
        MinComparator minComparator = new MinComparator();
        Heap heap = new Heap(4, minComparator);
        heap.add(3);
        heap.add(2);
        heap.add(1);
        assertEquals(1, heap.get());
        assertEquals(4, heap.size());
        assertEquals(1, heap.get());
    }

    @Test
    public void textMaxInsert() {
        MaxComparator maxComparator = new MaxComparator();
        Heap heap = new Heap(1, maxComparator);
        heap.add(4);
        heap.add(2);
        heap.add(3);
        assertEquals(4, heap.size());
        assertEquals(4, heap.remove());
        assertEquals(3, heap.size());
        assertEquals(3, heap.remove());
        assertEquals(2, heap.size());
        assertEquals(2, heap.remove());
        assertEquals(1, heap.size());
        assertEquals(1, heap.remove());
    }

    @Test
    public void testMaxGet() {
        MaxComparator maxComparator = new MaxComparator();
        Heap heap = new Heap(4, maxComparator);
        heap.add(3);
        heap.add(2);
        heap.add(1);
        assertEquals(4, heap.remove());
        assertEquals(3, heap.size());
        assertEquals(3, heap.remove());
        assertEquals(2, heap.remove());
        assertEquals(1, heap.remove());

    }
}
