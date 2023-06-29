package jdbc01;

import java.sql.*;

public class JdbcTest01 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            //1. 注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //2. 获取连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlw","root","root");
            //3. 获取数据库操作对象
            statement = connection.createStatement();
            //4. 执行SQL语句
            String sql = "insert into dept(deptno,dname,loc) values(70,'人事部','南京')";
            int count = statement.executeUpdate(sql);
            System.out.println(count == 1 ? "保存成功" : "保存失败");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6. 释放资源
            try {
                if (statement != null){
                    statement.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
