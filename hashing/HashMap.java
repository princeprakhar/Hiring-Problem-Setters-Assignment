package hashing;/* Question 1: Implement a hash map from scratch using open addressing with linear probing
for collision resolution. The hash map should support the following operations:
put(key, value): Insert a key-value pair into the hash map. If the key already exists,
                 update its value.
get(key): Retrieve the value associated with the given key. If the key does not exist, return null (Java) .
remove(key): Remove the key-value pair from the hash map if it exists.   */


public class HashMap {
    //defining Entry class which will have the key and value (to perform the key-value pair for hashing.
    private class Entry {
        int key, value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    //Declaring the member variable for the class.
    private Entry[] table;//hash table for entry data types
    private boolean[] occupied;//array for checking the weather place empty or not
    private int capacity;// capacity for hashtable
    private int size;// size of the used hashtable
    // constructor for hashmap.
    public HashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = new Entry[capacity];
        occupied = new boolean[capacity];
    }
    //  defining hashMethod which the value after hashing
    private int hashFunction(int key) {
        return key % capacity;
    }
    //  defining the probeMethod which check for the linear probing
    private int probeFunction(int index) {
        return (index + 1) % capacity;
    }
    // defining the put Method(assigning the value at particular key with put function)
    public void put(int key, int value) {
        int hash = hashFunction(key);
        while (occupied[hash] && table[hash].key != key) {
            hash = probeFunction(hash);
        }
        if (!occupied[hash]) {
            size++;
        }
        table[hash] = new Entry(key, value);
        occupied[hash] = true;
    }
//    defining the getter method
    public Integer get(int key) {
        int hash = hashFunction(key);
        while (occupied[hash]) {
            if (table[hash].key == key) {
                return table[hash].value;
            }
            hash = probeFunction(hash);
        }
        return null;
    }
    //defining the remove method
    public void remove(int key) {
        int hash = hashFunction(key);
        while (occupied[hash]) {
            if (table[hash].key == key) {
                table[hash] = null;
                occupied[hash] = false;
                size--;
                return;
            }
            hash = probeFunction(hash);
        }
    }
//    starting for main function
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(10);
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        System.out.println("Get key 1: " + hashMap.get(1));
        System.out.println("Get key 2: " + hashMap.get(2));
        hashMap.remove(1);
        System.out.println("Get key 1 after removal: " + hashMap.get(1));
    }
}

