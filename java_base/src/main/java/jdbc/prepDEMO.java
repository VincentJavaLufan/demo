package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class prepDEMO {
	public static void main( String[] args ){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
        String user = "lufan";
        String password = "5555";
        
        try {
            Class.forName(driver);//这样写的好处是：驱动只会加载一次，不需要依赖具体的驱动，灵活性高
            connection = DriverManager.getConnection(url, user, password);
            ArrayList list = new ArrayList();
            
//            String sql = "select * from emp where deptno = ?";
            String sql2 = "SELECT * FROM emp t where t.deptno in (?,30)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1, "20");
            resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
            	Emp emp = new Emp();
            	emp.setEmpno(resultSet.getString("empno"));
            	emp.setEname(resultSet.getString("ename"));
            	emp.setJob(resultSet.getString("job"));
            	emp.setMgr(resultSet.getString("mgr"));
            	emp.setHiredate(resultSet.getString("hiredate"));
            	emp.setSal(resultSet.getString("sal"));
            	emp.setComm(resultSet.getString("comm"));
            	emp.setDeptno(resultSet.getString("deptno"));
            	
            	list.add(emp);
            }
            for(int i=0;i<list.size();i++) {
            	String ss = list.get(i).toString();
            	System.out.println(ss);
            }
            
            //以Statement方式实现批处理
//            String ins1 = "insert into emp values (7777,'LUFAN','CLERK',7902,'1993-4-8',800,null,20)";
//            String ins2 = "insert into emp values (8888,'LUFAN','SALEMAN',7902,'1993-3-17',6000,null,10)";
//            statement = connection.createStatement();
//            statement.addBatch(ins1);//将sql添加到批处理
//            statement.addBatch(ins2);//将sql添加到批处理
//            int[] result = statement.executeBatch();//执行批处理
//            for(int res : result) {
//            	System.out.println(res);
//            }
//            statement.clearBatch();//清空批处理的sql
            
            //以PreparedStatement方式实现批处理
//            PreparedStatement preparedStatement = connection.prepareStatement(ins1);
//            preparedStatement.addBatch();
//            preparedStatement.executeBatch();
//            preparedStatement.clearBatch();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
