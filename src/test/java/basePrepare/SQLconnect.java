package basePrepare;
import java.sql.Connection;    
import java.sql.DriverManager;    
import java.sql.ResultSet;    
import java.sql.SQLException;
import java.sql.Statement; 

public class SQLconnect {

	public static void main(String[] args) {
		
		  String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		  String URL = "jdbc:sqlserver://172.26.0.82;integratedSecurity=true;Database=PCM_TEST";
		  Connection con = null;
		  ResultSet rs = null;
		  Statement st = null;
		  String sql = "select TOP 100 * from PRODUCT";
		  try
		  {
		   Class.forName(driver);
		  }
		  catch(java.lang.ClassNotFoundException e)
		  {
		   e.printStackTrace();
		  }
		  
		   try {
		   con = DriverManager.getConnection(URL);//�������ݿ����
		   st = con.createStatement();//����SQL�������
		   rs = st.executeQuery(sql);//ִ��SQL
		   
		   while(rs.next()){//ѭ�������¼
			   System.out.println(rs.getString("productid")+"\t"+rs.getString("InventorySku"));
		   }
		   con.close();
		   st.close();
		   rs.close();
		   } catch (SQLException e) {
				System.out.println("��������");
			}
		   
	
		 }




	}


