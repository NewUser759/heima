package Day07.TestDouDiZhu2;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        //创建卡盒
        HashMap<Integer, String> cardBox = new HashMap<>();
        //创建卡号集合  --> 方便调整卡的顺序。 每个卡对应一个卡号， 作为卡盒的键的集合
        ArrayList<Integer> cardNum = new ArrayList<>();

        // 创建花色集合   四种花色       注意逗号要与间隔符一致
        String[] colors = "♠,♥,♣,♦".split(",");

        //创建数字集合    卡数从大到小
        String[] nums  ="2,A,K,Q,J,10,9,8,7,6,5,4,3".split(",");


        //创建大王小王并放进卡盒中。
        int index = 1;
        cardBox.put(index,"大王");
        cardNum.add(index);
        index ++;
        cardBox.put(index,"小王");
        cardNum.add(index);
        index ++;



        //结合 创建卡集合
        //循环   顺序 花色在前， 卡数在后 外循环为 卡数
        for (int i1 = 0; i1 < nums.length; i1++) {
            for (int i = 0; i < colors.length; i++) {
                String card = colors[i] + nums[i1];
                cardBox.put(index,card);
                cardNum.add(index);
                index++;
                
            }
        }
        //测试卡盒和卡号集合没有问题并一一对应
       // System.out.println(cardBox);
       // System.out.println(cardNum);

       // System.out.println("***********");
        //打乱卡号顺序
        Collections.shuffle(cardNum);
        
        //把卡号分发给3个玩家 --> 放到3个集合中
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        for (int i = 0; i < cardNum.size(); i++) {
            if (i > 50){
                //放的是卡号 通过 cardNum集合获取对应的某个卡号
                diPai.add(cardNum.get(i));
            }else {
                if (i % 3 ==0){
                    player1.add(cardNum.get(i));
                }else if (i % 3 == 1){
                    player2.add(cardNum.get(i));
                }else
                    player3.add(cardNum.get(i));
            }
        }

       // System.out.println(player1);
       // System.out.println(player2);
       // System.out.println(player3);
       // System.out.println(diPai);

        //对牌号进行排序
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //小号代表大牌，小号在前
                return o1 - o2;
            }
        };

         Collections.sort(player1,c);
        Collections.sort(player2,c);
        Collections.sort(player3,c);
        Collections.sort(diPai,c);

      //  System.out.println("play1" + player1);


        //转换为牌面形式输出 -->通过map获取每一个键，通过每个键找对应的值
        //遍历  -->  单个人的
        //  System.out.print("令狐冲：[");
        //     for (int i = 0; i < player1.size(); i++) {
        //     //player1.get(i)为单个键,cardBox.get(key)就是获取这个键所对应的值。
        //     String value = cardBox.get(player1.get(i));
        //    if (i == player1.size()-1){
        //        System.out.println(value + "]");
        //    }else
        //        System.out.print(value + ",");
        //  }


        //牌面顺序和想要的顺序不一致   造牌问题

        showCard(cardBox, player1,"令狐冲");
        showCard(cardBox, player2,"东方不败");
        showCard(cardBox, player3,"岳不群");
        showCard(cardBox, diPai,"葵花宝典");


    }

    private static void showCard(HashMap<Integer, String> cardBox, ArrayList<Integer> list,String name ) {
        System.out.print( name + "：[" );
        for (int i = 0; i < list.size(); i++) {
            Integer key = list.get(i);
            String value = cardBox.get(key);
            //System.out.print(key + ",");

            if (i == list.size()-1){
                System.out.println(value + "]");
            } else
            System.out.print(value + ",");


        }
    }
}
