package InsertDeleteGetRandom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {
    @Test
    void insertSuccessTest() {
        RandomizedSet set = new RandomizedSet();
        boolean inserted = set.insert(1);
        assertTrue(inserted);
        assertEquals(1, set.getRandom());
    }

    @Test
    void insertReformatTableSuccessTest() {
        RandomizedSet set = new RandomizedSet();
        assertTrue(set.insert(-7));
        assertTrue(set.insert(6));
        assertTrue(set.insert(7));
        assertTrue(set.insert(10));
        assertTrue(set.insert(3));
        assertTrue(set.insert(8));
        assertTrue(set.insert(-8));

        assertFalse(set.insert(6));
        assertFalse(set.insert(-8));
        assertFalse(set.remove(2));

        assertTrue(set.insert(2));
        assertTrue(set.insert(5));

        assertFalse(set.remove(-5));

        assertTrue(set.remove(-8));
        assertTrue(set.insert(-8));
        assertTrue(set.insert(-4));

        assertFalse(set.insert(10));

        assertTrue(set.remove(7));

        assertFalse(set.remove(-1));
        assertFalse(set.insert(8));
        assertFalse(set.remove(-6));
        assertFalse(set.remove(9));

        assertTrue(set.insert(7));
        assertTrue(set.insert(0));

        assertFalse(set.remove(-10));

        assertTrue(set.remove(-4));

        assertFalse(set.remove(-3));

        assertTrue(set.insert(-4));
        assertTrue(set.insert(-5));

        assertFalse(set.insert(8));

        assertTrue(set.insert(-2));
        assertTrue(set.insert(-9));
        assertTrue(set.remove(7));

        assertFalse(set.insert(-2));

        assertTrue(set.insert(7));
        assertTrue(set.insert(4));
        assertTrue(set.insert(-6));

        assertFalse(set.insert(-8));
        assertFalse(set.insert(2));
        assertFalse(set.remove(9));
        assertFalse(set.remove(-1));
        assertFalse(set.insert(3));
        assertFalse(set.insert(0));

        assertTrue(set.insert(-3));
        assertTrue(set.insert(-1));

        assertFalse(set.insert(-8));

        assertTrue(set.insert(-10));

        assertFalse(set.insert(3));
        assertFalse(set.insert(4));
        assertFalse(set.insert(-10));
        assertFalse(set.insert(0));
        assertFalse(set.insert(-2));
        assertFalse(set.insert(5));

        assertTrue(set.remove(-2));

        assertFalse(set.insert(5));
        assertFalse(set.insert(10));

        assertTrue(set.insert(9));

        assertFalse(set.insert(0));
        assertFalse(set.insert(7));

        assertTrue(set.insert(-2));
    }

    @Test
    void insertRemoveReformatTableSuccessTest() {
        RandomizedSet set = new RandomizedSet();
        assertTrue(set.insert(3));
        assertTrue(set.insert(-2));

        assertFalse(set.remove(2));

        assertTrue(set.insert(1));
        assertTrue(set.insert(-3));

        assertFalse(set.insert(-2));

        assertTrue(set.remove(-2));
        assertTrue(set.remove(3));
        assertTrue(set.insert(-1));

        assertTrue(set.remove(-3));

    }

    @Test
    void insertFailTest() {
        RandomizedSet set = new RandomizedSet();
        set.insert(1);
        boolean inserted = set.insert(1);
        assertFalse(inserted);
        assertEquals(1, set.getRandom());
    }

    @Test
    void removeSuccessTest() {
        RandomizedSet set = new RandomizedSet();
        set.insert(1);
        boolean removed = set.remove(1);
        assertTrue(removed);
    }

    @Test
    void removeFailTest() {
        RandomizedSet set = new RandomizedSet();
        boolean removed = set.remove(1);
        assertFalse(removed);
    }

    @Test
    void randomTwoTimesTest() {
        RandomizedSet set = new RandomizedSet();
        boolean bool = set.insert(1);
        assertTrue(bool);
        bool = set.remove(2);
        assertFalse(bool);
        bool = set.insert(2);
        assertTrue(bool);
        bool = set.remove(1);
        assertTrue(bool);
        bool = set.insert(2);
        assertFalse(bool);
        assertEquals(2, set.getRandom());
    }

}