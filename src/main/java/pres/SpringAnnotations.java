package pres;

import metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class SpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotations.class);
        IGestion gestion = context.getBean(IGestion.class);
        System.out.println("Résultat: " + gestion.calcul());
    }
}
