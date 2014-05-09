
//Chance understands the probability of how likely an outcome will occur or not.

public class Chance {

    private final double theNumberOfWaysEventCanOccur;
    private final double theTotalNumberOfPossibleOutcomes;

    public Chance(int theNumberOfWaysEventCanOccur, int theTotalNumberOfPossibleOutcomes) {
        if (theNumberOfWaysEventCanOccur < 1 || theTotalNumberOfPossibleOutcomes < 1 || theNumberOfWaysEventCanOccur > theTotalNumberOfPossibleOutcomes) {
            throw new IllegalArgumentException();
        }
        this.theNumberOfWaysEventCanOccur = theNumberOfWaysEventCanOccur;
        this.theTotalNumberOfPossibleOutcomes = theTotalNumberOfPossibleOutcomes;
    }

    @Override
    public boolean equals(Object otherObject) {
        Chance chance = (Chance)otherObject;
        return (this.theNumberOfWaysEventCanOccur == chance.theNumberOfWaysEventCanOccur)&& (this.theTotalNumberOfPossibleOutcomes == chance.theTotalNumberOfPossibleOutcomes);
    }

    public double probability() {
        return theNumberOfWaysEventCanOccur/theTotalNumberOfPossibleOutcomes;
    }
}
