package FlattenNestedListIterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NestedIteratorTest {

    @Test
    void test1() {
        List<NestedInteger> list = getListOfNestedIntegersForTest1();
        NestedIterator iterator = new NestedIterator(list);
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
    }

    private List<NestedInteger> getListOfNestedIntegersForTest1() {
        List<NestedInteger> list = new ArrayList<>();

        list.add(new NestedIntegerListImpl(1,1));
        list.add(new NestedIntegerValImpl(2));
        list.add(new NestedIntegerListImpl(1,1));
        return list;
    }

    private static class NestedIntegerValImpl implements NestedInteger {
        private int val = 0;

        public NestedIntegerValImpl(int val) {
            this.val = val;
        }

        @Override
        public boolean isInteger() {
            return true;
        }

        @Override
        public Integer getInteger() {
            return val;
        }

        @Override
        public List<NestedInteger> getList() {
            return Collections.emptyList();
        }
    }

    private static class NestedIntegerListImpl implements NestedInteger {
        private final List<NestedInteger> list;

        public NestedIntegerListImpl(int... val) {
            list = new ArrayList<>();
            for (int i : val) {
                list.add(new NestedIntegerValImpl(i));
            }
        }

        @Override
        public boolean isInteger() {
            return false;
        }

        @Override
        public Integer getInteger() {
            return null;
        }

        @Override
        public List<NestedInteger> getList() {
            return list;
        }
    }

}
