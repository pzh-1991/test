package junit.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.crm.bean.Car;
import com.offcn.crm.bean.FlexBean;
import com.offcn.crm.bean.Person;

public class Test1 {
	@Test
	public void test01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person bean = ac.getBean(Person.class);
		System.out.println(bean);
		
	}
	@Test	
	public void test02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		FlexBean bean = ac.getBean(FlexBean.class);
		//System.out.println(Arrays.toString(bean.getArr()));
		 List list = bean.getList();
		for (Object object : list) {
			System.out.println(object);
		}
	
	
		
	}
	@Test
	public void test03() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object bean = ac.getBean("c1");
		Object bean2 = ac.getBean("c2");
		System.out.println(bean);
		System.out.println(bean2);
		
	}
	
}
