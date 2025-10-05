package pres;

import metier.Gestion;
import dao.ICalcul;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception {
        Class c1 = Class.forName("dao.CalculV2");
        ICalcul cal = (ICalcul) c1.getDeclaredConstructor().newInstance();

        Class c2 = Class.forName("metier.Gestion");
        Gestion gestion = (Gestion) c2.getDeclaredConstructor().newInstance();

        gestion.setCal(cal);
        System.out.println("Résultat: " + gestion.calcul());
    }
}
