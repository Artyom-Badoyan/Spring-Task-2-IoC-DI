import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        ApplicationContext applicationContext1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        ApplicationContext applicationContextCat =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat = (Cat) applicationContextCat.getBean("cat");
        System.out.println(beanCat.getName());

        ApplicationContext applicationContextCat1 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat1 = (Cat) applicationContextCat1.getBean("cat");
        System.out.println(beanCat1.getName());

        System.out.println("HelloWorld instances are the same: " + (bean == bean1));
        System.out.println("Cat instances are the same: " + (beanCat == beanCat1));
    }
}