package exerice2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cercle implements IForm <Cercle> {
    private double R;

    @Override
    public double calculeSurface() {
        return Math.PI *Math.pow(R,2);
    }

    @Override
    public double calculePrimetre() {
        return  Math.PI *2*R;
    }


    @Override
    public void update( Cercle ce) {
    this.R = ce.R;
    }
}
