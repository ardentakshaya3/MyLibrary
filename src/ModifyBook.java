import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;

public class ModifyBook {
public static int save(String name,String author,String publisher,int quantity){
	int status=0;
	Date date = new Date();
	Timestamp ts = new Timestamp(date.getTime());
	try{
		Connection con=Database.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(name,author,publisher,quantity,issued,added_date) values(?,?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,author);
		ps.setString(3,publisher);
		ps.setInt(4,quantity);
		ps.setInt(5,0);
		ps.setTimestamp(6, ts);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	
	return status;
}
}
