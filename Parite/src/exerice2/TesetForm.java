package exerice2;

import javax.swing.*;
import java.util.Scanner;

public class TesetForm {
    public static void main(String[] arg)
    {
        Scanner S = new Scanner(System.in);

        /*POUR l'objet Carre*/
        Carre c1 = new Carre();
        System.out.println("Donner la surface de carre ");
        c1.setL(S.nextDouble());
        System.out.println("la sûrface de C1 : "+c1.calculeSurface());
        System.out.println("la primetre  de C1 : "+c1.calculePrimetre());
        Carre c2 = new Carre();
        c2.setL(45);
        c1.update(c2);
        System.out.println("la sûrface de C1 apres l'update : "+c1.calculeSurface());
        System.out.println("la primetre  de C1 apres l'update : "+c1.calculePrimetre());
        /***********************************/


        Cercle ce1 = new Cercle();
        System.out.println("Donner la surface de carre ");
        ce1.setR(S.nextDouble());
        System.out.println("la sûrface de ce1 : "+ce1.calculeSurface());
        System.out.println("la primetre  de ce1 : "+ce1.calculePrimetre());
        Cercle ce2 = new Cercle();
        ce1.setR(5);
        ce1.update(ce2);
        System.out.println("la sûrface de ce2 apres l'update : "+c1.calculeSurface());
        System.out.println("la primetre  de ce2 apres l'update : "+c1.calculePrimetre());

    }
}
