package presentation;

import dao.IDao;
import extension.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2
{
    public static void main(String[] args) throws Exception {
       Scanner     scanner=new Scanner((new File("config.txt")));
       String daoClassName= scanner.nextLine();
       Class cdao=Class.forName(daoClassName);
      IDao dao=(IDao) cdao.getConstructor().newInstance();
        //metier
        String metierClassName= scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);
        //metier.setDao
        // Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
    // setDao.invoke(metier,dao);
     System.out.println("Res = "+metier.calcul());


    }
}
