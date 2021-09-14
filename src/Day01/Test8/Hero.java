package Day01.Test8;

public class Hero {

    //定义英雄人物属性：名称，血量，蓝量，攻击力，防御力
    private String name;
    private  int hp;
    private  int mp;
    private  int attack;
    private  int defence;

    //hero 构造方法


    public Hero(String name, int hp, int mp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.defence = defence;
    }

    public Hero() {
    }


    //hero 属性 set / get 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }


    //hero 台词功能，不同英雄不同台词，设计一句台词。
    public void say(){
        System.out.println("提供台词功能");
    }

    //hero 3个技能
    public  void skillOne(){
        System.out.println("使用一技能");
    }

    public  void skillTwo(){
        System.out.println("使用二技能");
    }

    public  void skillThree(){
        System.out.println("使用三技能");
    }


    //判断能否使用技能,不需要返回值， 需要提供蓝量形参: 英雄现在的蓝量。
    //直接调用Skill 对象作为形参？ 才能使用该对象内的属性？
    public void isSkillUse(Skill skill){
                int mpRemain = this.mp;
        if (mpRemain < skill.getMpCost()){
            System.out.println("没蓝了，该技能无法发动。");
        }else {
            //消耗120.0点魔法，发动技能:河豚手雷造成 360.0点伤害
            this.mp -= skill.getMpCost();
            System.out.println("消耗" + skill.getMpCost() +"点魔法，"+ "发动技能："+ skill.getSkillName()
                            +"，造成"+ skill.getAttackAdd()+ "点伤害" + ",剩余蓝量:" + this.mp);

        }

    }
}
