package pres;

import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGestion gestion = context.getBean(IGestion.class);
        System.out.println("Résultat: " + gestion.calcul());
    }
}
