package presentation;

import dao.DaoImpl;
import extension.DaoImpl2;
import metier.MetierImpl;

public class presentation1 {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);

        //metier.setDao(dao);//Injection des dependances
        System.out.println("RES = "+metier.calcul());
    }
}
