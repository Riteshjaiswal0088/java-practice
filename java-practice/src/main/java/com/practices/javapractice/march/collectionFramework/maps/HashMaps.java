package com.practices.javapractice.march.collectionFramework.maps;

import java.util.HashMap;

public class HashMaps {
    int i;
    public HashMaps(int i) { this.i=i;}
    public HashMaps() {}
    public int getHashCode() {return this.i;}

    public void setHashCode(int i) { this.i=i;}

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rajan");
        map.put(1, "kumar");
        /*map.put(2, "sanjay");
        map.put(15, "Rajan");*/
        //forEach()
        map.forEach((key, value) -> System.out.println(key + "=" + value));

        //entrySet()
       /* Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
*/
        // for(T t : array/collection of T){}

       /* HashMaps hashMap = new HashMaps(4);
        HashMaps twoHashMap=new HashMaps();
        twoHashMap=hashMap;
        System.out.println(twoHashMap.getHashCode());
        System.out.println(hashMap.getHashCode());
        hashMap.setHashCode(7);
        System.out.println(twoHashMap.getHashCode());
        System.out.println(hashMap.getHashCode());
*/
    }
}
