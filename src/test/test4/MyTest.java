package test.test4;

import java.util.*;

import java.util.Scanner;


import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            Map <Integer,Integer> map = new TreeMap<>();
            int a = sc.nextInt();
            for(int i = 0;i<a;i++){
                int key = sc.nextInt();
                int val = sc.nextInt();
                map.put(key,map.getOrDefault(key,0)+val);
            }
            for(Integer item : map.keySet() ){
                System.out.println(item+ " "+ map.get(item));
            }

        }
    }
}







