package declarativetransactions;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Demo {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("DeclarativeTransactions.xml");
		IUserDao dao = applicationContext.getBean("userDao", IUserDao.class);		
		int id=generateId();
		dao.selectUser(id);		
		User user=new User(id, "john"+id, false ,"password");
		try
		{
			dao.insertUser(user);
		}catch(ArithmeticException exp)
		{
			exp.printStackTrace();
		}
		dao.deleteUser(id);
	}
	private static int generateId(){
		return new Random().nextInt(500);
	}
}
