package DesignHashMap;

/**
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * Implement the MyHashMap class:
 * <p>
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 */
class MyHashMap {
    private static class Node {
        int key;
        int val;
        Node next;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node[] table;
    private static final float LOAD_FACTOR = 0.75f;
    private int size;
    private int capacity;
    private int threshold;

    public MyHashMap() {
        capacity = 16;
        table = new Node[capacity];
        size = 0;
        threshold = tableSizeFor(capacity);
    }

    public int size() {
        return size;
    }

    public void put(int key, int value) {
        putVal(key, value);
    }

    public int get(int key) {
        int index = key % capacity;
        Node root = table[index];
        while (root != null) {
            if (root.key == key) return root.val;
            root = root.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = key % capacity;
        Node root = table[index];
        if (root != null && root.key == key) {
            table[index] = root.next;
            size--;
        } else {
            Node prev = table[index];
            while (root != null) {
                if (root.key == key) {
                    prev.next = root.next;
                    size--;
                    break;
                }
                prev = root;
                root = root.next;
            }
        }
    }

    private void resizeTable() {
        capacity = (int) (capacity * 1.5);
        threshold = (int) (capacity * LOAD_FACTOR);
        Node[] prevTable = table;
        table = new Node[capacity];
        for (Node node : prevTable) {
            Node temp;
            while (node != null) {
                putNode(node);
                temp = node.next;
                node.next = null;
                node = temp;
            }
        }
    }

    private void putNode(Node node) {
        int index = node.key % capacity;
        Node temp = table[index];
        if (temp == null) {
            table[index] = node;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    private void putVal(int key, int value) {
        if (size >= threshold) {
            resizeTable();
            threshold = tableSizeFor(capacity);
        }
        int index = key % capacity;
        Node temp = table[index];
        if (temp == null) {
            table[index] = new Node(key, value);
            size++;
        } else {
            Node prev = temp;
            while (temp != null && temp.key != key) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) {
                prev.next = new Node(key, value);
                size++;
            } else {
                temp.val = value;
            }
        }
    }

    private static int tableSizeFor(int cap) {
        return (int) (cap * LOAD_FACTOR);
    }
}