package day19.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception {
        //创建配置文件对象
        Properties properties = new Properties();
        //获得配置文件关联的输入流 class.getClassLoader().getResourceAsStream("druid.properties");
        InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(is);
        is.close();
        //通过druid方法创建连接池  (所有创建连接池的方法都是直接或者间接继承DataSource接口)
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //有连接池之后 就可以调用里面的连接
        Connection connection = dataSource.getConnection();
        //接着就通过连接创建Statement对象了~~~



        //通过DBUtils执行DML操作
        QueryRunner queryRunner = new QueryRunner(dataSource);
        int update = queryRunner.update(sql());
        System.out.println(update);


        //通过DBUtils执行DQL操作
        //queryRunner.query();



    }

    private static String sql() {

        //不能插入重复的字段
        String sql = "insert into class values ( null,'一年二班') ";



        return sql;
    }
}
