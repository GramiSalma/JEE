package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.xml.transform.stream.StreamSource;


@Repository("dao")

public class DaoImpl implements IDao{


    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        double data =24;
        return data;
    }
}
