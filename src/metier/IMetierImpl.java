package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao ; //Couplage faible

    @Override
    public double calcul() {
        return 0;
    }
}
