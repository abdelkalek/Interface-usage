package exercice1;

import exercice1.Fonction;

public class Cos implements Fonction {
    @Override
    public double appel(double x) {
        return Math.cos(x);
    }
}
