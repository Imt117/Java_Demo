package jdbc01;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest03 {
    public static void main(String[] args) {
            //使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String passwd = bundle.getString("passwd");
            Connection connection = null;
            Statement statement = null;
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url,user,passwd);
                statement = connection.createStatement();
                String sql = "insert into dept(deptno,dname,loc) values(80,'人事部','南京')";
                int count = statement.executeUpdate(sql);
                System.out.println(count == 1 ? "保存成功" : "保存失败");
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }/*finally {
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
                }*/
            }
}
