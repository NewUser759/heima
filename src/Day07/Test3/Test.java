package Day07.Test3;

/*
*
* 需求：ArrayList有以下元素: "a","f","b","c","a","d"
* 利用HashSet对ArrayList集合去重(最终结果: ArrayList中没有重复元素)。
*
*
* 完成
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class Test {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        Collections.addAll(s,"a","f","b","c","a","d");
        HashSet<String> s1 = new HashSet<>();
        //迭代ArrayList集合，取出每个元素，每个元素添加近hashSet集合中
        for (String s2 : s) {
            s1.add(s2);
        }
        System.out.println(s1);
    }
}
