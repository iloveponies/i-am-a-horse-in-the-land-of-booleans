package ohtu;

import ohtu.laskin.IO;
import ohtu.laskin.Koe;
import ohtu.laskin.Laskin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
        
        Laskin laskin = ctx.getBean(Laskin.class);
        laskin.suorita();
    }
}














//        //Koe k = ctx.getBean(Koe.class);
//        Koe k = (Koe)ctx.getBean("koe");
//        k.foo();
//        
//        IO io = ctx.getBean(IO.class);
//        io.print("paska");