import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHelloWorld = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(beanHelloWorld.getMessage());
        System.out.println(bean.getMessage());
        System.out.println(bean == beanHelloWorld);

        Cat beanCat = applicationContext.getBean("cat", Cat.class);
        Cat beanCat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat1.getMessage());
        System.out.println(beanCat == beanCat1);

    }
}