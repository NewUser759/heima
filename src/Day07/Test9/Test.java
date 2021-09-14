package Day07.Test9;


/*
* 语法点：Map ArrayList
需求：使用集合保存并按以下格式输出下列数据：
河北省:
		秦皇岛市:[海港区, 山海关区, 北戴河区, 昌黎县]
		唐山市:[路北区, 路南区, 古冶区, 开平区]
		石家庄市:[石家庄市, 长安区, 桥东区, 桥西区, 新华区；]
河南省:
		郑州市:[中原区, 金水区, 二七区, 管城回族区]
		洛阳市:[西工区, 老城区, 涧西区, 洛龙区]
		开封市:[鼓楼区, 龙亭区, 顺河回族区, 禹王台区]
*
*
* */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //创建一个Map集合用于保存所有数据
        Map<String,Map<String,List<String>>> map = new HashMap<>();

        //创建集合保存河南省的信息
        Map<String,List<String>> m1 = new HashMap<>();
        //创建一个List集合保存一个市的行政区域信息
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "中原区","金水区","二七区","管城回族区");
        m1.put("郑州市", list1);
        list1 = new ArrayList<>();
        Collections.addAll(list1, "鼓楼区","龙亭区","顺河回族区","禹王台区");
        m1.put("开封市", list1);
        list1 = new ArrayList<>();
        Collections.addAll(list1, "西工区","老城区","涧西区","洛龙区");
        m1.put("洛阳市", list1);
        map.put("河南省", m1);
        //创建集合保存河北省的信息
        m1 = new HashMap<>();
        //创建一个List集合保存一个市的行政区域信息
        list1 = new ArrayList<>();
        Collections.addAll(list1, "石家庄市","长安区","桥东区","桥西区","新华区；");
        m1.put("石家庄市", list1);
        list1 = new ArrayList<>();
        Collections.addAll(list1, "路北区","路南区","古冶区","开平区");
        m1.put("唐山市", list1);
        list1 = new ArrayList<>();
        Collections.addAll(list1, "海港区","山海关区","北戴河区","昌黎县");
        m1.put("秦皇岛市", list1);
        map.put("河北省", m1);
        //遍历输出
        for (String sheng : map.keySet()) {
            System.out.println(sheng+":");
            Map<String, List<String>> map2 = map.get(sheng);
            for (String shi : map2.keySet()) {
                System.out.println("\t"+shi + ":" + map2.get(shi));
            }
        }
    }
}
