

import java.util.Date;

import kl.pageModel.PLDuser;
import kl.service.UserServiceI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testHibernate {
	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
		UserServiceI usi = (UserServiceI) ac.getBean("userService");
//		Tuser u = new Tuser();
		PLDuser u = new PLDuser();
		u.setUsercode("uyxyz7");
		u.setUsername("uyxyz6");
		u.setPassword("uyxyz6");
		u.setComcode("uyxyz6");
		u.setOperator("uyxyz6");
		u.setMakedate(new Date());
		u.setMaketime("00:00:00");

		usi.save(u);
	}
}
