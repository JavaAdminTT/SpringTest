import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seyong.beans.Person;

public class IOCDemo {
	
	private static final ApplicationContext ioc;
	static {
		String path = "/spring.xml";
		ioc = new ClassPathXmlApplicationContext(path);
	}
	
	

	@Test
	public void iocTest02() {
		//通过类的类型从容器中拿到对象
		//该情况下如果对象不唯一会报错
		Person person = ioc.getBean(Person.class);
		System.out.println(person);
	}
	
	@Test
	public void iocTest01() {
		// 通过配置文件配置的ID 属性拿到对应的对象
		Person person = (Person) ioc.getBean("person02");
		System.out.println(person);
		
	}
}
