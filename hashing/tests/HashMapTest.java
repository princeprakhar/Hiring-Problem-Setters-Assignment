package hashing.tests;

import hashing.HashMap;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
public class HashMapTest {

    @Test
    public void testPutAndGet() {
        HashMap hashMap = new HashMap(10);
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        assertEquals((Integer) 10, hashMap.get(1));
        assertEquals((Integer) 20, hashMap.get(2));
    }

    @Test
    public void testRemove() {
        HashMap hashMap = new HashMap(10);
        hashMap.put(1, 10);
        hashMap.remove(1);
        assertNull(hashMap.get(1));
    }

    @Test
    public void testUpdateValue() {
        HashMap hashMap = new HashMap(10);
        hashMap.put(1, 10);
        hashMap.put(1, 20);
        assertEquals((Integer) 20, hashMap.get(1));
    }
}
