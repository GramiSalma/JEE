package dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class DaocaptImpl implements  IDao{
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double data=77;
        return data;
    }
}
