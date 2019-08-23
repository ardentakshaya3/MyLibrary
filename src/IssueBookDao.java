import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class IssueBookDao {
	
public static boolean checkBook(int id){
	boolean status=false;
	try{
		Connection con=Database.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from books where id=?");
		ps.setInt(1,id);
	    ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static int save(int id,int studentid,String studentname,String studentcontact){
	int status=0;
	try{
		Connection con=Database.getConnection();
		
		status=updatebook(id);//updating quantity and issue
		
		if(status>0){
		PreparedStatement ps=con.prepareStatement("insert into issuedbooks(studentid,studentname,studentcontact) values(?,?,?)");
		ps.setInt(1,studentid);
		ps.setString(2,studentname);
		ps.setString(3,studentcontact);
		status=ps.executeUpdate();
		}
		
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int updatebook(int id){
	int status=0;
	int quantity=0,issued=0;
	try{
		Connection con=Database.getConnection();
		
		PreparedStatement ps=con.prepareStatement("select quantity,issued from books where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			quantity=rs.getInt("quantity");
			issued=rs.getInt("issued");
		}
		
		if(quantity>0){
		PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where id=?");
		ps2.setInt(1,quantity-1);
		ps2.setInt(2,issued+1);
		ps2.setInt(3,id);
		
		status=ps2.executeUpdate();
		}
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
