package extension;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {

        System.out.println("version Web service ");
       double data=55;
        return data;

    }
}
