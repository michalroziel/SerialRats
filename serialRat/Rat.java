public class Rat extends Tier {

    private Rat(String pArt, int pGewicht, int pGroesse, boolean pIsHungry) {

        super(pArt, pGewicht, pGroesse, pIsHungry);

    }

    public Rat(int pGewicht, int pGroesse) {

        this("Ratte", pGewicht, pGroesse, true);

    }

    @Override
    public boolean eat(int pAmount) {

        if (pAmount < 500) {
            super.setGewicht(pAmount);
            return true;
        }
        return false;
    }

    @Override
    public boolean roam(int pDistance) {

        if (pDistance > 0 && pDistance < 5000) {

            super.setGewicht(pDistance / 1000 - super.getGewicht());

            return true;
        }

        return false;

    }

}