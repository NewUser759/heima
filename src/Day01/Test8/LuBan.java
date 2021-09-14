package Day01.Test8;

public class LuBan extends Hero{


    //对象构造器
    public LuBan(String name, int hp, int mp, int attack, int defence) {
        super(name,hp,mp,attack,defence);
    }

    public LuBan() {
    }

//鲁班台词重写


    @Override
    public void say() {
        System.out.println("噢哦，其实我才是最终boss。");
    }

    //hero 3个技能 - 鲁班3个技能  并判断能否有足够蓝使用。
    @Override
    public  void skillOne(){
        isSkillUse(new Skill("河豚手雷",120,250));
    }

    @Override
    public  void skillTwo(){
        Skill sk2 = new Skill("无敌鲨鱼炮", 230, 350);
        isSkillUse(sk2);
    }

    @Override
    public  void skillThree(){
        Skill sk3 = new Skill("空中支援", 330, 800);
        isSkillUse(sk3);
    }

}
