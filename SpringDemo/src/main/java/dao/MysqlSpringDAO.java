package dao;


import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;



public class MysqlSpringDAO {

	JdbcTemplate jdbcTemplate;
	
	public MysqlSpringDAO(){
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getEmployeeInfo(){
		/*List<Employee> employeeInfoList =  jdbcTemplate.query("select * from employee", (rs,rowNum) -> {				
				Employee employee = new Employee(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("Gender").equals("MALE")?Gender.MALE:Gender.FEMALE,
						rs.getString("contact"),rs.getDouble("salary"));
				
				return employee;
		});*/
		List<Employee> employeeInfoList =  jdbcTemplate.query("select * from employee",EmployeeRowMapper::mapRow);
		return employeeInfoList;
	}
	
}
