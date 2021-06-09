import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        System.out.println(bean1 == bean2);
        Cat one = (Cat) applicationContext.getBean("Stepan");
        Cat two = (Cat) applicationContext.getBean("Stepan");
        System.out.println(one.getName());
        System.out.println(one == two);

    }
}