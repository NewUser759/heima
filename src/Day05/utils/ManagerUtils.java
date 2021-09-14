package Day05.utils;

import Day05.bean.Person;
import Day05.bean.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ManagerUtils {
    public static int sid;
    public static int tid;


        //展示所有学员
    public static void showAllPerson(ArrayList<Person> arrays){
        System.out.println("*********************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t\t年龄\t\t描述");
            //获取所有学员
        for (int i = 0; i < arrays.size(); i++) {
            Person p = arrays.get(i);
            System.out.println(p.getId() + "\t\t"+p.getName() +"\t\t"+p.getSex()+ "\t\t"
                    +p.getBirthday()+ "\t\t"+ p.getAge() +"\t\t"+
                    "我是一名："+ p.getIdentity()+"，我的工作是："+ p.getContent());
        }

        System.out.println("*********************************");



    }

            //展示单个学员
        public static void showPerson(Person p){

            System.out.println(p.getId() + "编号\t\t"+p.getName() +"姓名\t\t"+p.getSex()+ "性别\t\t"
                    +p.getBirthday()+ "生日\t\t"+ p.getAge() +"年龄\t\t"+
                    "我是一名："+ p.getIdentity()+"我的工作是："+ p.getContent());

        }


            //生日转年龄
        public static int birthdayToAge(String birthday) throws ParseException {
            Date birth;
            int age = -1;

            //生成日期模式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            birth = sdf.parse(birthday);           // birth是提供的生日的毫秒数


            //设置生日对象
            Calendar bircal = Calendar.getInstance();
            bircal.setTime(birth);

            //设置当前日期对象
            Calendar nowcal = Calendar.getInstance();

            //判断有没有过生日          -->可以直接用毫秒数相减再除以一年的毫秒数
            if (bircal.before(nowcal)) {
                age = nowcal.get(Calendar.YEAR) - bircal.get(Calendar.YEAR);

                if (nowcal.get(Calendar.MONTH) < bircal.get(Calendar.MONTH)) {
                    age--;
                } else if (nowcal.get(Calendar.MONTH) == bircal.get(Calendar.MONTH) && nowcal.get(Calendar.DAY_OF_MONTH) < bircal.get(Calendar.DAY_OF_MONTH)) {
                    age--;
                }
            }else
                System.out.println("你输入的生日有误");


            //得到出生日期的日历

            //得到现在时间日历

            return  age;

        }

}
