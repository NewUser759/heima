package day18;


import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils{


    //这几个参数需要在静态代码块和getConnection方法中传参,
    // 设置为静态成员变量只能本类中调用修改, 其他类不能使用
    private static String driverClass ;
    private static String url ;
    private static String user ;
    private static String password ;

    //私有构造方法
    public JdbcUtils() {
    }


    //静态代码块调用jdbc.properties配置文件
    //静态代码块只运行一次且在类加载的时候运行
    //主要目的: 注册驱动需要调用几个参数,为了能容易修改参数,所以通过调用配置文件来修改参数
    static {
        try {
        //创建properties对象
        Properties p = new Properties();
        //获取关联配置文件的输入流
            // 加上getResourceAsStream后, 括号内只能加文件名,不能加全路径名,不然会报错
        InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream
                ("jdbc.properties");
        //加载
        p.load(is);
        //关流
        is.close();

        //获取配置文件中的值
         driverClass = p.getProperty("driverClass");
         url = p.getProperty("url");
         user = p.getProperty("user");
         password = p.getProperty("password");

         //注册驱动
            Class.forName(driverClass);
        } catch (Exception e) {     //catch()内的异常需要足够大
            e.printStackTrace();
        }

    }


    //获取连接的方法
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }




    //释放资源的方法
    public static void close(ResultSet resultSet, Statement statement, Connection connection){

        //inn 快捷键    if(n = null)   非空判断
        //加入非空判断可以重复调用  有不存在的参数可以直接跳过该if内的语句
        //因为这里每个都要关流 所以不能放在同一个try里面
        // try里只要有1条语句报错 try内接下来的语句都不执行
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (statement != null) {
        try { statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }

}


