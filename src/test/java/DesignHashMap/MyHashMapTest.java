package DesignHashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @Test
    void putTest() {
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(1,1);
        assertEquals(1, myHashMap.size());
        myHashMap.put(1,1);
        assertEquals(1, myHashMap.size());
        myHashMap.put(1,2);
        assertEquals(1, myHashMap.size());
        myHashMap.put(2,2);
        assertEquals(2, myHashMap.size());
        myHashMap.put(5,2);
        assertEquals(3, myHashMap.size());
        myHashMap.put(2,3);
        assertEquals(3, myHashMap.size());
    }
    @Test
    void removeTest() {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put(1,1);
        assertEquals(1, myHashMap.size());

        myHashMap.put(1,1);
        assertEquals(1, myHashMap.size());

        myHashMap.remove(1);
        assertEquals(0, myHashMap.size());

        myHashMap.remove(1);
        assertEquals(0, myHashMap.size());

        myHashMap.put(1,1);
        assertEquals(1, myHashMap.size());

        myHashMap.put(2,2);
        assertEquals(2, myHashMap.size());

        myHashMap.remove(1);
        assertEquals(1, myHashMap.size());

        myHashMap.remove(2);
        assertEquals(0, myHashMap.size());
    }

    @Test
    void getTest() {
        MyHashMap myHashMap = new MyHashMap();

        myHashMap.put(1,1);
        assertEquals(1, myHashMap.size());
        assertEquals(1, myHashMap.get(1));

        myHashMap.put(2,2);
        assertEquals(2, myHashMap.size());
        assertEquals(2, myHashMap.get(2));
        assertEquals(-1, myHashMap.get(3));

        myHashMap.put(2,1);
        assertEquals(2, myHashMap.size());
        assertEquals(1, myHashMap.get(2));

        myHashMap.remove(2);
        assertEquals(1, myHashMap.size());
        assertEquals(-1, myHashMap.get(2));
    }

}