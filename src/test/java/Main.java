import CountrySimulator.Country;
import CountrySimulator.Exceptions.ValueException;
import CountrySimulator.Tools.Happiness;

public class Main{
    public static void main(String[] args) throws ValueException{

        Happiness happiness = new Happiness();
        happiness.change(Happiness.Field.ADULTS, 2);
        Country country = new Country();
        country.getPopulation();

    }
}
