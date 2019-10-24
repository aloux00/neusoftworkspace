package orz.doublexi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClient {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("classpath:springconfig.xml");
	First bean = context.getBean("test",First.class);
	bean.haha();
}
}
