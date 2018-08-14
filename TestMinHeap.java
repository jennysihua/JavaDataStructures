import org.junit.Test;
import static org.junit.Assert.*;

public class TestMinHeap {
    @Test
    public void testInsert() {
        MinHeap minHeap = new MinHeap(4);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(1);
        assertEquals(4, minHeap.size());
        assertEquals(1, minHeap.remove());
        assertEquals(3, minHeap.size());
        assertEquals(2, minHeap.remove());
        assertEquals(2, minHeap.size());
        assertEquals(3, minHeap.remove());
        assertEquals(1, minHeap.size());
        assertEquals(4, minHeap.remove());
    }

    @Test
    public void testGet() {
        MinHeap minHeap = new MinHeap(4);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(1);
        assertEquals(1, minHeap.get());
        assertEquals(4, minHeap.size());
        assertEquals(1, minHeap.get());
    }
}
