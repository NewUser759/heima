package Day070.test9;

public class TestDemo {

    public void login(String name,String pwd) {
        if (!"admin".equals(name)) {
            try {
                throw new LoginException("用户名：" + name + "不存在");
            } catch (LoginException e) {
                e.printStackTrace();
            }

        }
        if (!"admin".equals(pwd)) {
            try {
                throw new LoginException("密码：" + name + "错误");
            } catch (LoginException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("欢迎"  +  name);
        }
    }
}
