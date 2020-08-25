package application;


import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn=DB.getConnection();
			/*
			st=(PreparedStatement) conn.prepareStatement("INSERT INTO seller"
					+"(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+"VALUES"
					+"(?, ?, ?, ?, ?)", 
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Carl Purple");
			st.setString(2, "carl@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			*/
			st=(PreparedStatement) conn.prepareStatement("insert into department (Name) values ('D1'),('D2')",
					Statement.RETURN_GENERATED_KEYS);
			int rowsAffected = st.executeUpdate();
			if(rowsAffected>0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! id: "+id);
				}
			}
			else
				System.out.println("No rows affected!");
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatment(st);
			DB.closeConnection();
		}
	}
}
