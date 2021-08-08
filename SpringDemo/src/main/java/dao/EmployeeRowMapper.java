package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper {
	
	public static Employee mapRow(ResultSet rs,int rowNum) throws SQLException
	{
		Employee employee = new Employee(rs.getInt("id"),
				rs.getString("name"),
				rs.getString("Gender").equals("MALE")?Gender.MALE:Gender.FEMALE,
				rs.getString("contact"),rs.getDouble("salary"));
		
		return employee;
	}

}
