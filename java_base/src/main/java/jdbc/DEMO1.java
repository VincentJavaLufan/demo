package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DEMO1 {
	public static void main( String[] args ){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
//        String driver = "oracle.jdbc.driver.OracleDriver";
//        String url = "jdbc:oracle:thin:@192.168.108.128:1521:ORCL";
//        String user = "lufan";
//        String password = "5555";

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://192.168.108.128:3306/demo?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
        String user = "root";
        String password = "555555";
        
        try {
            Class.forName(driver);//这样写的好处是：驱动只会加载一次，不需要依赖具体的驱动，灵活性高
            //获取与数据库连接的对象-Connetcion
            connection = DriverManager.getConnection(url, user, password);
            //获取执行sql语句的statement对象
            statement = connection.createStatement();
            //执行sql语句,拿到结果集
//            resultSet = statement.executeQuery("SELECT * FROM emp limit 4,3");
//            resultSet = statement.executeQuery("SELECT * FROM emp t where t.deptno in (20,30)");
            //遍历结果集，得到数据
//            ArrayList list = new ArrayList();
//            while (resultSet.next()) {
//            	Emp emp = new Emp();
//            	emp.setEmpno(resultSet.getString("empno"));
//            	emp.setEname(resultSet.getString("ename"));
//            	emp.setJob(resultSet.getString("job"));
//            	emp.setMgr(resultSet.getString("mgr"));
//            	emp.setHiredate(resultSet.getString("hiredate"));
//            	emp.setSal(resultSet.getString("sal"));
//            	emp.setComm(resultSet.getString("comm"));
//            	emp.setDeptno(resultSet.getString("deptno"));
//            	
//            	list.add(emp);
//            }
//            for(int i=0;i<list.size();i++) {
//            	String ss = list.get(i).toString();
//            	System.out.println(ss);
//            }
            
            String insSql = "insert into testInsert(f1,f2,f3,f4,f5,f6,f7,f8,f9) " +
            	"values ('aaaa','ssss','dddd','ffff','gggg','wwww','eeee','rrrr','cccc')";
            Long start = System.currentTimeMillis();
            for(int i=0;i<100000;i++) {
            	statement.executeUpdate(insSql);
            }
//            statement.execute("delete from testInsert");
            Long end = System.currentTimeMillis();
            System.out.println("done! use:" + (end - start));
            
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