package Spring_ioc_annotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PhoneDriver {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig1.class);
	  Phone phone= applicationContext.getBean(Phone.class);
	  phone.Start();
}
}
