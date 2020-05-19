package exerice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Carre implements IForm <Carre> {
    private double l ;
    @Override
    public double calculeSurface() {
        return l*l;
    }

    @Override
    public double calculePrimetre() {
        return  l*4;
    }


    @Override
    public void update(Carre c ) {
        this.l = c.l;
    }
}
