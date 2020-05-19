package exercice1;

import exercice1.Fonction;

public class sinus implements Fonction {
    @Override
    public double appel(double x) {
        return Math.sin(x);
    }
}
