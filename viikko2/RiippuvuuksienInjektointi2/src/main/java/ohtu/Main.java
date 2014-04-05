package ohtu;

import ohtu.laskin.Laskin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");

        //Laskin laskin = (Laskin) ctx.getBean("laskin");
        Laskin laskin = ctx.getBean(Laskin.class);
        laskin.suorita();
    }
}
