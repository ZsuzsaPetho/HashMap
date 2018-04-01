package com.codecool.hashmap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.print();
        map.add("lala", 3);
        map.add("lali", 5);
        map.add("lila", 5);
        map.print();
        System.out.println(map.getValue("lila"));

        map.add("lolo", 12);
        map.add("valamihosszu", 156);
        map.add("ko", 89);
        map.print();

        map.remove("ko");
        map.print();

        map.clearAll();
        map.print();
        //System.out.println(map.getValue("lulu"));
    }
}
