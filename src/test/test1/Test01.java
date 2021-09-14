package test.test1;

public class Test01 {
    // 第11行, name =  name 错误;  需改为: this.name = name;
    // 第19行. score = score 错误; 需改为: this. score = score;
    // 第33行,list的泛型使用错误;  修改为:   ArrayList<Student> list1 = new ArrayList<>();
    // 第38行, for(int i = 0; i < list.length(); i++){ 错误, 需改为:  for(int i = 0; i < list.size(); i++){
    // 第39行, sum += list.get(i) 成绩的获取错误 ;  需改为:  sum += list1.get(i).getScore();
}
