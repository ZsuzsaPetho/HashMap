package com.codecool.hashmap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K extends Comparable, V> {

    private int bucketSize = 16;

    private LinkedList<KeyValue<K,V>>[] elements;

    public HashMap() {
        elements = new LinkedList[bucketSize];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new LinkedList<>();
        }
    }

    public void add(K key, V value) {
        // find out which position of the primitive array to use:
        int position = getHash(key);
        LinkedList list = elements[position];
        if (doesKeyExists(list, key)){
            throw new KeyAlreadyExistsError("Key " + key + " already exists");
        } else {
            list.add(new KeyValue<>(key, value));
        }
        // If the key already exists throw an error.
        // Make a new instance of the KeyValue class, fill it with the key, value parameters, then add it to the list.

        resizeIfNeeded();
    }

    private boolean doesKeyExists(List<KeyValue<K, V>> list, K key) {
        for (KeyValue element: list) {
            if (element.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    private KeyValue getKeyValue (List<KeyValue<K, V>> list, K key) {
        for (KeyValue element: list) {
            if (element.getKey().equals(key)){
                return element;
            }
        }
        return null;
    }

    public V getValue(K key) {
        int position = getHash(key);
        // 1. Calculate the hash of the key. This defines which element to get from the "elements" array
        if (elements[position] == null) {
            throw new KeyNotExistsError("Key " + key + " not exists");
        }
        KeyValue element = getKeyValue(elements[position], key);
        if (element == null) {
            throw new KeyNotExistsError("Key " + key + " not exists");
        }
        return (V)element.getValue();
        // 2. Find in the List in this position the KeyValue element that has this key, then return its value.
        //    If none of the items in the list has this key throw error.
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode() % bucketSize);
    }

    public void remove(K key) {
        int position = getHash(key);
        if (elements[position] == null) {
            throw new KeyNotExistsError("Key " + key + " not exists");
        }
        KeyValue element = getKeyValue(elements[position], key);
        if (element == null) {
            throw new KeyNotExistsError("Key " + key + " not exists");
        }
        elements[position].remove(element);
        resizeIfNeeded();
    }

    public void clearAll() {
        for (int i = 0; i < elements.length; i++) {
            elements[i].clear();
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            size += elements[i].size();
        }
        return size;
    }

    public List<KeyValue<K,V>> getListOfElements() {
        LinkedList<KeyValue<K,V>> listOfElments = new LinkedList<>();
        for (int i = 0; i < elements.length; i++) {
            listOfElments.addAll(elements[i]);
        }
        return listOfElments;
    }

    private void resizeIfNeeded(){
        if (size() > bucketSize*2) {
            System.out.println("DOUBLE");
            bucketSize = bucketSize*2;
            updateHashMapSize();
        }
        if (size() < bucketSize/2 && size() > 10) {
            System.out.println("HALF");
            bucketSize = bucketSize/2;
            updateHashMapSize();
        }
    // If it holds more elements than bucketSize * 2, destroy and recreate it
    // with the double size of the elements array.
    // if it holds less elements than bucketSize / 2, destroy and recreate it
    // with half size of the elements array.
    }

    private void updateHashMapSize() {
        List<KeyValue<K,V>> list = getListOfElements();
        elements = new LinkedList[bucketSize];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new LinkedList<>();
        }
        print();
        for (KeyValue<K,V> element: list) {
            copy(element.getKey(), element.getValue());
        }
    }

    private void copy(K key, V value) {
        int position = getHash(key);
        LinkedList list = elements[position];
        list.add(new KeyValue<>(key, value));
    }

// + other functions, like clearAll(), delete(),..

    public void print() {
        System.out.println("++++++++++++++++++++++++++++");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
        }
        System.out.println();
        System.out.println("++++++++++++++++++++++++++++");
    }

}
