package Day01.Test8;

public class Skill {

    //技能属性：技能也是一种事物，具有名称、消耗的mp以及对基本攻击加成的属性；
    private String skillName;
    private int mpCost;
    private int attackAdd;


    //技能构造器
    public Skill(String skillName, int mpCost, int attackAdd) {
        this.skillName = skillName;
        this.mpCost = mpCost;
        this.attackAdd = attackAdd;
    }

    public Skill() {
    }

    //技能属性 set / get 方法


    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getMpCost() {
        return mpCost;
    }

    public void setMpCost(int mpCost) {
        this.mpCost = mpCost;
    }

    public int getAttackAdd() {
        return attackAdd;
    }

    public void setAttackAdd(int attackAdd) {
        this.attackAdd = attackAdd;
    }
}
