package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation22
{
    public static void main(String[] args) throws Exception {
       Scanner     scanner=new Scanner(System.in);
       System.out.println("Donnez la classe de la couche Dao:");

       String daoClassName= scanner.nextLine();
       Class cdao=Class.forName(daoClassName);
      IDao dao=(IDao) cdao.getConstructor().newInstance();
        //metier
        System.out.println("Donnez la classe de la couche Metier:");

        String metierClassName= scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.getConstructor().newInstance();
        //metier.setDao
         Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
     setDao.invoke(metier,dao);
     System.out.println("Res = "+metier.calcul());



    }
}
