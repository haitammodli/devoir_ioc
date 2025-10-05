package metier;

import dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gestion")
public class Gestion implements IGestion {
    @Autowired
    private ICalcul cal;

    public void setCal(ICalcul cal) {
        this.cal = cal;
    }

    @Override
    public double calcul() {
        double d = cal.getValue();
        return d * 10;
    }
}
