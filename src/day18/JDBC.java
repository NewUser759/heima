package day18;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JDBC的使用
 *  步骤
 *  1.   导入jar包: mysql-connector-java
 *  2.   注册驱动
 *  3.   获取连接
 *  4.   获取SQL语句执行对象
 *  5.   执行SQL语句
 *  6.   处理SQL结果
 *  7.   释放资源
 *
 *
 */



public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection connection = JdbcUtils.getConnection();



        //获取编译对象, 把sql语句编译到对象中
        PreparedStatement ps = connection.prepareStatement(sql());
        //为"增"的? 占位符赋值
        ps.setString(10,"白痴");

        //执行sql语句 : 增删改
        int i = ps.executeUpdate();

        //执行sql语句:  查
        ResultSet resultSet = ps.executeQuery();


    }

    private static String sql() {
        //增
        String sql1 = "insert into teacher values (null, ? ,? ,? )";
        //删
        String sql2 = "delete from teacher where tid = ?";
        //改
        String sql3 = "update teacher set tname = '张学友' where tid = ?";
        //查
        String sql4 = "Select * from teacher where tid = ?";
        return "2";

    }
}
