import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seyong.beans.Person;

public class IOCDemo {
	
	private static final ApplicationContext ioc;
	static {
		String path = "/applicationContext.xml";
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
		Person person = (Person) ioc.getBean("person06");
		
		//花式遍历MAP
		Map<String, Object> map = person.getMap();
		
	/*	 推荐使用此方法遍历（遍历的时间空间复杂度相对其他的会好一些）	*/
	    Set<Entry<String,Object>> entrySet = map.entrySet();
		Iterator<Entry<String, Object>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Entry<String, Object> entry = iterator.next();
			System.out.println(entry.getKey() +"--->" + entry.getValue());
		}
	
		/* 用entry 蛋 遍历
		 * 	Set<Entry<String,Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "--->" + value);
		}*/
		
		/* 这个方法太low了
		 * Set<String> key = map.keySet();
		Iterator<String> iterator = key.iterator();
		while (iterator.hasNext()) {
			String ke = iterator.next();
			Object value = map.get(ke);
			System.out.println(ke +"--->" + value);
		}*/
	
		//System.out.println(person);
		
	}
}
