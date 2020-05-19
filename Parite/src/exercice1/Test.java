package exercice1;

import exercice1.Fonction;
import exercice1.sinus;

public  class Test   {

        /* function testParite retourne vrai si f(x)=f(-x) pour tout x dans [min,max] */
        static boolean testParite(Fonction f, int min, int max){
            boolean b = true ;
            for(int i=min; (i <=max && b==true); i++) {
                if(f.appel(i) != f.appel(-i))
                    b=false ;
            }       return (b) ;
        }
        public static void main(String[] arg){
           System.out.println(testParite( new sinus(), 0,100));
            System.out.println(testParite( new Cos(), 0,100));
        }


}
