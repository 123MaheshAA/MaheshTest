package DBTest;
/* 
 * We need to have jdbc-oracle.jar  & ojdbc14.jar files to connect Oracle DB
 *  
 */

import java.sql.*;
public class DataBasdeTest {

	//private static Object AA;

	public static void main(String[] args) {

		Connection conn = null;
		//Connection conn = null;

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			//String dbName = "MYDB";
			String uName = "hr";
			String passWord = "password";
			
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, uName, passWord);
				
				/*-- Another way of coding it
				 String sql = "select * from jobs";
				  ResultSet result = statement.executeQuery(sql);
				  result.next();
				  System.out.println(result.getString("job_id"));
				  System.out.println(result.getString("job_title"));
				  System.out.println(result.getString("min_salary"));
				  System.out.println(result.getString("max_salary"));
				  System.out.println(" ============================================================");
				  ----------*/
				
				String sql1 = "select job_title, min_salary from jobs order by 1 asc";
				Statement statement = conn.createStatement();
				ResultSet result1 = statement.executeQuery(sql1);
				
				//This is used to get the number of the column present in the table
				ResultSetMetaData aaa = result1.getMetaData();
				int count= aaa.getColumnCount();
				System.out.println("The column count is "+ count);
				
				
				//This is used to get the Column name
				String name = aaa.getColumnName(1); // We are passing the column Index
				System.out.println("This is the column name: " +name);
				
				
				//---This code will extract all Minimum Salary column details
				while(result1.next())
				{
					System.out.println(result1.getString("job_title")+"--->"+result1.getString("min_salary"));
					
				}
								
			}catch(Exception e)
				{
				System.out.println(e);					
				}
			finally
			{
				if (conn!=null)
				{
					conn = null;
				}
			}
		

	}

}
