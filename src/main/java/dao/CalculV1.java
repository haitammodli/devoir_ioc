package dao;

import org.springframework.stereotype.Component;

@Component("cal")
public class CalculV1 implements ICalcul {
    @Override
    public double getValue() {
        return 100;
    }
}
