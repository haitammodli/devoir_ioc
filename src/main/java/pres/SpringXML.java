package pres;

import metier.Gestion;
import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Gestion gestion = (Gestion) context.getBean("metier");
        System.out.println("Résultat: " + gestion.calcul());
    }
}
