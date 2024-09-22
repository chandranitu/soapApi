package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {
	public String serverName;
	public String dbName;    
	public int port;         
	public String userName;  
	public String passWord;  
	 
	private Connection connection;
	private Statement st;
	   
	    public DB(String serverName,String dbName, int port, String userName,String passWord) {
	 
	        this.serverName = serverName;
	        this.dbName = dbName;
	        this.port = port;
	        this.userName=userName;
	        this.passWord=passWord;
	 
	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	    }
	    
	    public String[][] select(String sql)
	    {
	        String[][] data=null;
	       try {
	           st.executeQuery(sql);
	           ResultSet rs = st.getResultSet();
	           int colCount = rs.getMetaData().getColumnCount();
	           rs.last();
	           int rowCount = rs.getRow();
	           rs.beforeFirst();
	           data= new String[rowCount][colCount];
	 
	           int i =0;
	           while(rs.next()){
	               for(int j=0;j<colCount;j++){
	                  data[i][j]= rs.getString(j+1);
	               }
	                i++;	 
	           }
	          rs.close();
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	        return data;	 
	    }

	    public void connect(){
	        try {
	        String url = "jdbc:mysql://"+serverName+":"+port+"/"+dbName;
	        connection = DriverManager.getConnection(url,userName,passWord);
	        st = connection.createStatement();
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }
	    }
	    
	    public void disConnect(){
	        try {
	            st.close();
	            connection.close();
	        } catch (Exception e) {
	             System.err.println(e.getMessage());
	        }
	    }
}
