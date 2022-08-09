package com.github.zipcodewilmington;

public class DashaMapOne extends DashaMap implements HashMapX {



    public void add(Node node, String key, Integer value) {
        Node temp = node;

        while (temp != null) {
            if (temp.next == null) {
                temp.next = new Node(key, value);
                break;
            }
            temp = temp.next;
        }
    }

    @Override
    public void set(String key, String value) {
        for (int i = 0; i < 26; i++)
            if (map[i].getKey().equals(hashCasing(key)))
                add(map[i], key, Integer.parseInt(value));
    }

    @Override
    public String delete(String key) {
        Node head = find(key);
        String value = "";
        while(head != null){
            if(head.getKey().equals(key)){
                value = head.getKey();
            }
            head = head.getNext();
        }
        return value;
    }

    @Override
    public String get(String key) {
        return key;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }

    private String hashCasing(String input) {
        if (input.length() > 0)
            return String.valueOf(input.charAt(0)).toLowerCase();
        return input;
    }
    public Node find(String key) {
        for (int i = 0; i < 26; i++)
            if (map[i].getKey().equals(hashCasing(key)))
                return map[i];
        return null;
    }
}
