package InsertDeleteGetRandom;

import java.util.Random;

/**
 * Implement the RandomizedSet class:
 * <p>
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 */
public class RandomizedSet {
    private static class Node {
        Integer val;
        Node next;

        Node(Integer val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node[] table;
    private int size;
    private final Random rand;

    public RandomizedSet() {
        table = new Node[16];
        size = 0;
        rand = new Random();
    }

    public boolean insert(int val) {
        if (size >= table.length * 0.75) {
            reformatTable();
        }
        int i = hash(val);
        boolean inserted = insertNode(i, new Node(val, null));
        if (inserted) {
            size++;
        }
        return inserted;
    }

    private boolean insertNode(int index, Node insertedNode) {
        Node node = table[index];
        if (node == null) {
            table[index] = insertedNode;
        } else {
            while (node.next != null) {
                if (node.val.equals(insertedNode.val)) {
                    return false;
                }
                node = node.next;
            }
            if (node.val.equals(insertedNode.val)) {
                return false;
            }
            node.next = insertedNode;
        }
        return true;
    }

    private void reformatTable() {
        Node[] prevTable = table;
        table = new Node[(int) (table.length * 1.5)];
        for (Node node : prevTable) {
            while (node != null) {
                int hash = hash(node.val);
                Node temp = node.next;
                node.next = null;
                insertNode(hash, node);
                node = temp;
            }
        }

    }

    public boolean remove(int val) {
        int i = hash(val);
        if (table[i] == null) {
            return false;
        }
        if (table[i].val == val) {
            table[i] = table[i].next;
            size--;
            return true;
        }
        Node prevNode = table[i];
        Node next = table[i].next;
        while (next != null && !next.val.equals(val)) {
            prevNode = next;
            next = next.next;
        }
        if (next == null) {
            return false;
        }
        prevNode.next = next.next;
        size--;
        return true;
    }

    public int getRandom() {
        int count = rand.nextInt(size);
        for (Node node : table) {
            while (node != null) {
                if (count == 0) {
                    return node.val;
                }
                node = node.next;
                count--;
            }
        }
        return -1;
    }

    private int hash(int val) {
        return Math.abs(val) % table.length;
    }
}
