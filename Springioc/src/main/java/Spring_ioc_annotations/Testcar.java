package Spring_ioc_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testcar {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfig.class);
		Car car= applicationContext.getBean(Car.class);
		car.engine();
	}
}
