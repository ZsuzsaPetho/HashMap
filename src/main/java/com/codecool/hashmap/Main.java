package com.codecool.hashmap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.print();
        map.add("lala", 3);
        map.add("lali", 5);
        map.add("lila", 5);
        System.out.println("Size: " + map.size());
        map.print();
        System.out.println(map.getValue("lila"));

        map.add("lolo", 12);
        map.add("valamihosszu", 156);
        map.add("ko", 89);
        map.print();

        map.remove("ko");
        map.print();

        System.out.println("Size: " + map.size());
        map.clearAll();
        map.print();
        System.out.println("Size: " + map.size());
        //System.out.println(map.getValue("lulu"));

        map.add("lalq", 3);
        map.add("lalw", 5);
        map.add("lile", 5);
        map.add("lalr", 3);
        map.add("lalt", 5);
        map.add("lilt", 5);
        map.add("lalz", 3);
        map.add("lalu", 5);
        map.add("lii", 5);
        map.add("lao", 3);
        map.add("lalp", 5);
        map.add("lilaa", 5);
        map.add("lalas", 3);
        map.add("lalid", 5);
        map.add("lilaf", 5);
        map.add("lalag", 3);
        map.add("lalif", 5);
        map.add("lilaj", 5);
        map.add("lalak", 3);
        map.add("lalil", 5);
        map.add("lilaé", 5);
        map.add("lalaí", 3);
        map.add("lalix", 5);
        map.add("lilac", 5);
        map.add("lalav", 3);
        map.add("lalib", 5);
        map.add("lilan", 5);
        map.add("lalam", 3);
        map.add("lalitt", 5);
        map.add("lilarrrr", 5);
        map.add("lalibffff", 5);

        map.add("lilanffffffffffff", 5);
        map.add("lalffff", 3);
        map.add("lalittéé", 5);
        map.add("lilarrrrűűűű", 5);

        map.print();
        System.out.println(map.size());

        map.remove("lao");
        map.remove("lalp");
        map.remove("lilaa");
        map.remove("lalas");
        map.remove("lalid");
        map.remove("lilaf");
        map.remove("lalag");
        map.remove("lalif");
        map.remove("lilaj");
        map.remove("lalak");
        map.remove("lalil");
        map.remove("lilaé");
        map.remove("lalaí");
        map.remove("lalix");
        map.remove("lilac");
        map.remove("lalav");
        map.remove("lalib");
        map.remove("lilan");
        map.remove("lalam");
        map.remove("lalitt");
        map.remove("lilarrrrűűűű");

        map.print();
        System.out.println(map.size());


        HashMap<Integer, String> pam = new HashMap<>();
        pam.add(3, "lasla");
        pam.add(9, "csalk");
        pam.add(1, "dsavs");
        pam.add(33, "dsfa");
        pam.print();

        HashMap<Character, String > ppp = new HashMap<>();
        ppp.add('s', "afs");
        ppp.add('r', "afsdfasf");
        ppp.add('*', "asds");
        ppp.print();
    }
}
