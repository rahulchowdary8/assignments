package assignment1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_1.xml");
		Customer customer= (Customer) context.getBean("add");
		customer.show();
//		  Resource r=new ClassPathResource("spring_1.xml");  
//		    BeanFactory factory=new XmlBeanFactory(r);  
//		      
//		    Customer e=(Customer)factory.getBean("add");  
//		    e.show();  

	}

}
