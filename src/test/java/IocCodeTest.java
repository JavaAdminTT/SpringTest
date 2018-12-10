import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seyong.beans.Person;

public class IocCodeTest {
	
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("/applicationContext.xml") ;

	@SuppressWarnings({ "resource", "unused" })
	@Test
	public void test() {
		Person bean = (Person) ioc.getBean("person08");
		System.out.println(bean);
	}

	@Test
	public void DbTest() throws Exception {
		
		DataSource connection = (DataSource) ioc.getBean("comboPooledDataSource");
		Connection conn = connection.getConnection();
		System.out.println(conn);
		
		
	}
}
