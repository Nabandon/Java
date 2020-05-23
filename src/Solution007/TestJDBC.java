package Solution007;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC {
    private static void testInsert() throws SQLException {
        DataSource dataSource=new MysqlDataSource();
        ((MysqlDataSource)dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java15_0506?characterEncoding=utf8&useSSL=true");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("w1839304120");
        Connection connection=dataSource.getConnection();
        String sql="insert into student values(?,)";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1,20);
        statement.setString(2,"cai");
        int ret =statement.executeUpdate();
        System.out.println(ret);
        statement.close();
        connection.close();
    }

    public static void main(String[] args) throws SQLException {
        testInsert();
    }
}
