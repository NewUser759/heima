package Day070.Test8;

public class Student {

    private  String name;
    private  int score;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 ){
            try{
                throw new NoScoreException("分数不能为负数" + score);
            }catch (NoScoreException e){
                System.out.println("请重新输入分数");
            }
        }
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
