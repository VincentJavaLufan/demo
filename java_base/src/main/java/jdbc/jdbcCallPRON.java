package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcCallPRON {
	public static void main( String[] args ){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
        String user = "lufan";
        String password = "5555";
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);//关闭自动提交。开启事务,对数据的操作就不会立即生效。
            /**
             * 举个例子:A向B转账，转账这个流程中如果出现问题，事务可以让数据恢复成原来一样【A账户的钱没变，B账户的钱也没变】
             * 如果A向B转账的过程中出现了问题呢
             */
            //A账户减去500块
            String sql = "UPDATE BANK SET money=money-500 where name='AA'";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            //在转账过程中出现问题
            int a = 3 / 0;

            //B账户多500块
            String sql2 = "UPDATE BANK SET money=money+500 where name='BB'";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();
            
            //如果程序能执行到这里，没有抛出异常，我们就提交数据
            connection.commit();
            //关闭事务【自动提交】
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            try {
            	//如果出现了异常，就会进到这里来，我们就把事务回滚【将数据变成原来那样】
				connection.rollback();
				//关闭事务【自动提交】
                connection.setAutoCommit(true);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
