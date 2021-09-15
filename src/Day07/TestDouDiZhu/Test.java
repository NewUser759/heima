package Day07.TestDouDiZhu;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] colors = "♠,♥,♣,♦".split(",");
        String[] nums = "2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");




        //创建牌 --> 牌面和牌号  ，因为牌号需要打乱顺序， 所以采用Arraylist
        ArrayList<Integer> list = new ArrayList<>();


        //创建大王小王， 放进去卡盒中
        HashMap<Integer,String> cardBox = new HashMap<>();
        int index = 1;
        cardBox.put(index,"大王");
        list.add(index);
        index++;
        cardBox.put(index,"小王");
        list.add(index);
        index++;


        //遍历数字和花色 造牌
        for (String num : nums) {
            for (String color : colors) {
                String  card = color + num;
                //index 为牌号， 添加到牌号集合中
                list.add(index);

                //牌号为key, 牌面为card,添加到牌盒中
                cardBox.put(index,card);
                index++;
            }
        }
       System.out.println(cardBox);
       System.out.println(list);

        //洗牌  --> 对牌号进行操作， 因为牌号在牌盒中绑定了牌面，所以打乱牌号顺序==打乱牌盒顺序
        //注意：  map 会自动排序
        Collections.shuffle(list);

        //System.out.println(list);

        //把洗好的牌号发给3个玩家
        //创建3个集合 把牌分发下去，看牌时需要重新再排序， 使用Arraylist集合接收牌号
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();


        //遍历集合,发牌
        for (int i = 0; i < list.size(); i++) {
            //通过牌号集合获取每一个牌号
            Integer paihao = list.get(i);

            //如果牌号大于50，在底牌集合中加入这3个牌
            if (i > 50){
                diPai.add(paihao);
            }else {
                if(i % 3 == 0){
                    p1.add(paihao);
                }else if (i % 3 == 1){
                    p2.add(paihao);
                }else
                    p3.add(paihao);

            }
        }

       // System.out.println(list.size());
      //  System.out.println(p1);
      //  System.out.println(p2);
      //  System.out.println(p3);
      //  System.out.println(diPai);


        //看牌
        //通过牌号  排序（牌面从大到小）  找到对应的牌面   输出


        //创建比较器排序
        Comparator  <Integer> c= new Comparator<Integer>() {
            @Override
            public int compare(Integer p1, Integer p2) {

                //1代表大王， 54代表♦3
                return p1-p2;
            }
        };
        Collections.sort(p1,c);
        Collections.sort(p2,c);
        Collections.sort(p3,c);
        Collections.sort(diPai,c);


         // System.out.println(p1);
         // System.out.println(p2);
         // System.out.println(p3);
         // System.out.println(diPai);


        cardShow(cardBox, p1,"令狐冲");
        cardShow(cardBox, p2,"岳不群");
        cardShow(cardBox, p3,"东方不败");
        cardShow(cardBox, diPai,"葵花宝典");


    }

    //通过牌号找对应的牌面
    //遍历牌号集合获得每个牌号key
    private static void cardShow(HashMap<Integer, String> cardBox, ArrayList<Integer> p1, String name) {
        System.out.print(name +  "：[");
        for (int i = 0; i < p1.size(); i++) {
            Integer cardNum = p1.get(i);
            String card = cardBox.get(cardNum);
            if (i != p1.size()-1){
                System.out.print(card + ",");
            }else
                System.out.print(card);

        }
        System.out.println("]");
    }
}
